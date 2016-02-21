
public class Knight extends Soldier{
	
	public Knight(String name){
		super(name);
		
		transportation = new Horse();
		weapon = new Sword();
	}
}