package _3511;

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String [] args) {
		/*
		 * N number of segments along the cyclist's route.
		 * D distance in meters.
		 * T time in minutes.
		 */
		byte N = 0;
		String [] inputValues;
		int totalDistance = 0;
		int totalTime = 0;
		
		scanner = new Scanner(System.in);
		
		N = Byte.parseByte(scanner.nextLine());
		while(0 < N) {
			scanner.reset();
			inputValues = scanner.nextLine().split("\\s+");
			
			totalDistance += Integer.parseInt(inputValues[0]);
			totalTime += Integer.parseInt(inputValues[1]);

			N--;
		}
		
		scanner.close();
		System.out.print(totalDistance + " " + totalTime + " "+ ((int)Math.floor((double)totalDistance/totalTime)));
	}
}
