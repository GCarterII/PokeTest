
public class PokeTest {

	public static void main(String[] args) {
		Pokedex pd1 = new Pokedex();
		Pokedex pd2 = new Pokedex();
		Pokedex pd3 = new Pokedex();
		
		

		Pokemon pk1 = pd1.createPokemon("Joey", 100, "Jersey");
		Pokemon pk2 = pd2.createPokemon("Situation", 100, "Jersey");
		pd3.createPokemon("Frank", 45, "Singer");
		
		pd1.listPokemon();
		System.out.println(pk2.getHealth());
		pk1.attackPokemon(pk2);
		System.out.println(pk2.getHealth());
		pk2.getHealth();
	}

}
