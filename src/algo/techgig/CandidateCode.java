package algo.techgig;

import java.util.Scanner;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		Scanner scanner = new Scanner(System.in);

		// reading launch hour and minute
		int launch_hh = scanner.nextInt();
		int launch_min = scanner.nextInt();

		// reading travel time and adding it to launch hour and minute
		launch_hh += scanner.nextInt();
		launch_min += scanner.nextInt();

		if (launch_hh >= 24) {
			launch_hh = launch_hh % 24;
		}

		if (launch_min >= 60) {
			int count = launch_min / 60;
			launch_min = launch_min % 60;
			launch_hh += count;
			launch_hh = launch_hh % 24;
		}

		System.out.printf("%02d %02d", launch_hh, launch_min);

		scanner.close();
	}
}
