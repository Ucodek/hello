package gamee;

import java.util.Scanner;

public class PlayingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a sharpshooter game! Press q or Q to quit the game");
		String response = scanner.next();
		if(response.equals("q") || response.equals("Q")) {System.out.println("well done you quit the game");
		}else System.out.println("You are still playing the game *pew pew!*");
				}

}
