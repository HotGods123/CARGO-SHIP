
public class Ship 
{
	private String name;
	private String YearBuilt;
	
	public Ship(String n, String y)
	{
		name = n;
		YearBuilt = y;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setYearBuilt(String y)
	{
		YearBuilt = y;
	}
	public String getName()
	{
		return name;
	}
	public String getYearBuilt()
	{
		return YearBuilt;
	}
	public String toString()
	{
		return name + YearBuilt;	
	}

}
