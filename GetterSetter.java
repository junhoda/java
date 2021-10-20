package pack3;

public class GetterSetter {
	private String color;
	private int speed;
	private int	gear;
	
	
	public String getColor() {
		return color;
	}


	}

	public void setColor(String color)	{
		this.color = color;
	}
	
// public 	String getColor(String color) {
//	this.color = color;
//	public void setColor(String color)	{
//		this.color = color;
//	}
	public String fileds() {
		String str = "Color = " + ", Speed = " + Speed + ", Gear = " + gear;
		return color;
		
	}

	@Override
	public String toString() {
		return "GetterSetter [color=" + color + "]";
	}



	
	
