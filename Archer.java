
public class Archer extends Soldier{
	
	public Archer(String name){
		super(name);
		
		transportation = new Feet();
		weapon = new Bow();
	}
}