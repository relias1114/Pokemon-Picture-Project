package doc.resources;

public class Pokemon {
	private int health = 120;  //intialize in the extension or usage 
	private int damage;
	private String name;
	private String type; //make an int that is used in an array 
	public Pokemon (int health1, int damage1, String name1, String type1) {
		health = health1;
		damage = damage1;
		name = name1;
		type = type1;
		
	}
	public int getHealth(){
		return health;
	}
	public int getDamage() {
		return damage;
	}
	public String getName () {
		return name;
	}
	public String getType() {
		return type;
	}
	public int hit(int userHealth, int attackDamage) {
		if (userHealth ==0 || (userHealth-attackDamage)<0) {
			return 0;
		} else {
			return userHealth-attackDamage;
		}
		
	}
	public boolean superEffective(String type1, String type2) {
		boolean effective = false;
		if (type1.equals(type2)) {
			return effective;
		}
		if (type1.equals("fire")&& type2.equals("grass")) {
			effective = true;
		}
		if(type1.equals("water")&& type2.equals("fire")) {
			effective = true;
		}
		if (type1.equals("grass")&& type2.equals("water")) {
			effective = true;
		}
		return effective;
}
	}
