class NamedCow extends Cow
{
	public NamedCow(String type, String name, String sound)
	{
		myType = type;
		myName = name;
    	mySound = sound;
	}
	public NamedCow()
	{
		myType = "unknown";
    	mySound = "unknown";
    	myName = "unknown";
	}
	public String getName()
	{
		return myName;
	}
}