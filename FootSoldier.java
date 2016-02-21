
public class FootSoldier extends Soldier{
	
	public FootSoldier(String name){
		super(name);
		
		transportation = new Feet();
		weapon = new Sword();
	}
}
