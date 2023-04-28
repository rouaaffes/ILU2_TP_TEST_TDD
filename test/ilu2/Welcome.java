package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) {
			return "Hello, my friend";
		}
		input = input.trim();
		String name = input.substring(0, 1).toUpperCase() + input.substring(1);
		return "Hello, " + name;

	}

}
