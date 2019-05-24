
public class Messages {
	private String TryD = "Try 'north','south','east', or 'west'";
	private String directionError = "Please enter one of the cardinal directions";
	private String end = "You see a box sitting on the plain. \r\n"
			+ "Its filled with treasure! \r\n"
			+ "A voice rings out: \r\n"
			+ "The world has been waiting for Ashura's successor \r\n"
			+ "Wait, what the hell are you..... \r\n"
			+ "To be continued...";
	private String intro = "Grey foggy clouds float oppressively close to you, "
			+ "reflected in the murky grey water which reaches up your shins. \r\n"
			+ "Some black plants barely poke out of the shallow water. \r\n";
	private String cIntro = "Where am i?! \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "What is your name? \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "This cant be real! \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "What is your name?! \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "*sweats profusely* \r\n"
			+ "Wait...what is this? \r\n"
			+ "You notice a small watch-like device in your left pocket. \r\n"
			+ "Try 'north','south','east', or 'west' \r\n"
			+ "It has hands like a watch, but the hands don't seem to tell time. \r\n"
			+ "I wonder where this goes"
			+ "WHAT IS YOUR NAME?!!! \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "------------------------------------------------------- \r\n"
			+ "Please enter your name:";

	public Messages() {
		this.intro = intro;
		this.end = end;
		this.directionError = directionError;
		this.TryD = TryD;
		this.cIntro = cIntro;
	}

	public String getcIntro() {
		return cIntro;
	}

	public String getIntro() {
		return intro;
	}
	
	public String getEnd() {
		return end;
	}
	
	public String getDirectionError() {
		return directionError;
	}
	public String getTryD() {
		return TryD;
	}

}
