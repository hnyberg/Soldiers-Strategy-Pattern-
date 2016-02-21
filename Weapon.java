
public interface Weapon {
	String getAttackDescription();
}

class Sword implements Weapon{
	public String getAttackDescription(){
		return "swings sword.";
	}
}

class Bow implements Weapon{
	public String getAttackDescription(){
		return "shoots arrows.";
	}
}