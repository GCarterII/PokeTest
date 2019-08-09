import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<Pokemon> myPokemon = new ArrayList<>();
	
	public void addToPokedex(Pokemon pokemon) {
		myPokemon.add(pokemon);
	}
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = super.createPokemon(name, health, type);
		this.addToPokedex(p);
		return p;
		
	}
	
	


	@Override
	public void listPokemon() {
		String output = "You have the following Pokemon in your Pokedex: \n";
		int myPoke = 0;
		for(Pokemon pokemon : myPokemon) {
			myPoke +=1;
			output += pokemon.getName() + "\n";
		}
		
		output += "There are " + (Pokemon.getCount() - myPoke) + " Pokemon that others have found!";
		System.out.println(output);
	}
}
