
public class Soldier {
	
	String name;
	Weapon weapon;	//	interface
	Transportation transportation;	//	interface
	
	public Soldier(String name){
		this.name = name;
	}
	
	public void attack(){
		System.out.println(name + " " + weapon.getAttackDescription());
	}
	
	public void move(){
		System.out.println(name + " " + transportation.getTransportationDescription());
	}
	
	public void changeWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void changeTransportation(Transportation transportation){
		this.transportation = transportation;
	}
}