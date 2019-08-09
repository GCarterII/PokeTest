
public abstract class AbstractPokemon implements PokemonInterface {

	public String pokemonInfo(Pokemon pokemon) {
		String output = "Name: " + pokemon.getName() + " - Health: " + pokemon.getHealth() + " - Type: " + pokemon.getType();
		return output;
		
	}

	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name, health, type);
		return p;
		
	}

}
