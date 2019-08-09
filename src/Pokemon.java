
public class Pokemon {
	private String name ="";
	private int health = 0;
	private String type = "";
	private static int count = 0;
	
	Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
//	@Override
//	public String pokemonInfo(Pokemon pokemon) {
//		String output = "Name: " + this.name + " - Health: " + this.health + " - Type:";
//		return output;
//		
//	}
//	@Override
//	public Pokemon createPokemon(String name, int health, String type) {
//		Pokemon p = new Pokemon(name, health, type);
//		return p;
//	}

	public void attackPokemon(Pokemon target) {
		target.setHealth(target.getHealth()-10);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}


}
