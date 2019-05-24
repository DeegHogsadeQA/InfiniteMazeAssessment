import java.util.Random;
import java.util.Scanner;

public class App {
	static boolean running = true;

	public static void main(String[] args) {
		Messages messages = new Messages();
		System.out.println(messages.getIntro());
		String direction;
		Random r = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		Random r4 = new Random();
		int xRandom = r.nextInt(20);
		int yRandom = r2.nextInt(20);
		int xRandom2 = r3.nextInt(20);
		int yRandom2 = r4.nextInt(20);
//		Monster m1 = new Monster(19);
		System.out.println(messages.getcIntro());
		Player p1 = new Player(input(), xRandom, yRandom);
		Treasure t1 = new Treasure(xRandom2, yRandom2);
		while (running) {
			int xTotal = xRandom - xRandom2;
			int yTotal = yRandom - yRandom2;
			double distance = Math.sqrt((Math.pow(xTotal, 2) + Math.pow(yTotal, 2)));
			if (distance == 0.00) {
				System.out.println(messages.getEnd());
				running = false;
			} else {
				System.out.println("The dial reads " + distance + "m");
//				m1.setCount();
//				System.out.println("The end is near:" + m1.getCount());
//				if (m1.getCount()) {
//					System.out.println("You are not worthy");
//				} else {
					System.out.println(messages.getTryD());
					direction = input();
					direction.toLowerCase();
					if (direction.equals("north")) {
						yRandom = yRandom + 1;
						running = true;
					} else if (direction.equals("east")) {
						xRandom = xRandom + 1;
						running = true;
					} else if (direction.equals("south")) {
						yRandom = yRandom - 1;
						running = true;
					} else if (direction.equals("west")) {
						xRandom = xRandom - 1;
						running = true;
					} else
						System.out.println(messages.getDirectionError());
					running = true;
				}
			}
		}
	

	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
