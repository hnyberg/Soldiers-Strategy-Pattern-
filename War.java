
public class War {

	public static void main(String[] args) {
		
		Soldier[] soldiers = new Soldier[3];
		
		soldiers[0] = new FootSoldier("SmellyFeet");
		soldiers[1] = new Archer("Sterlin");
		soldiers[2] = new Knight("Horselover");
		
		System.out.println("King: Soldiers, attack");
		System.out.println();
		
		for (Soldier soldierX : soldiers){
			soldierX.move();
		}
		for (Soldier soldierX : soldiers){
			soldierX.attack();
		}
		
		System.out.println();
		System.out.println("after a while, all horses die");
		System.out.println();
		
		for (Soldier soldierX : soldiers){
			soldierX.changeTransportation(new Feet());
			soldierX.move();
		}
	}
}