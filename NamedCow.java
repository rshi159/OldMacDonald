class NamedCow extends Cow
{
    private String myType;
    private String mySound;
	private String myName;
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
	public void getName()
	{
		return cowName;
	}
}