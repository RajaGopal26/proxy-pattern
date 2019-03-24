package go4.proxy;

import java.util.Scanner;

public class ClientInternet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
