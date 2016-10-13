class Chick implements Animal 
{     
    private String myType;
    private String mySound; //your code here
    public Chick(String type, String sound, String sound2)
    {
    	myType = type;
    	if(Math.random() < .5)
    		mySound = sound;
    	else
    		mySound = sound2;
    }
    public Chick()
    {
    	myType = "Chick: ";
    	mySound = "Cheep";
    }
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}