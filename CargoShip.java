
public class CargoShip extends CruiseShip
{
	private int tonnage;
	
	public CargoShip(String n, String y, int t)
	{
		super(n,y);
		tonnage = t;
	}
	public void setTonnage(int t)
	{
		tonnage = t;
	}
	public int getTonnage()
	{
		return tonnage;
	}
	public String toString()
	{
		
	}
}
