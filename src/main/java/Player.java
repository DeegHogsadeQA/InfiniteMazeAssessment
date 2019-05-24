import java.util.Scanner;

public class Player {
	private String name;
	private int locationx;
	private int locationy;

	public Player(String name, int locationx, int locationy) {
		this.locationx = locationx;
		this.locationy = locationy;
	}

	public void setName(String name) {
		this.name = input();
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}

}
