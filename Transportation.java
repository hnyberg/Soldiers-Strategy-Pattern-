
public interface Transportation {
	String getTransportationDescription();
}

class Feet implements Transportation{
	public String getTransportationDescription(){
		return "walks.";
	}
}

class Horse implements Transportation{
	public String getTransportationDescription(){
		return "rides horse.";
	}
}