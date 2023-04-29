package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (chaine_null_ou_vide(input)) {
			return "Hello, my friend";
		}
		if (input.contains(",")) {
			String[] names = input.split(",");
			names[0] = traitement_nom(names[0]);
			names[1] = traitement_nom(names[1]);
			return "Hello, " + names[0] + ", " + names[1];

		} else if (input.trim().equals(input.trim().toUpperCase())) {
			return "HELLO, " + input.trim() + " !";
		} else {
			input = input.trim();
			String name = input.substring(0, 1).toUpperCase() + input.substring(1);
			return "Hello, " + name;
		}

	}

	private static boolean chaine_null_ou_vide(String input) {
		return input == null || input.trim().isEmpty();
	}

	private static String traitement_nom(String input) {
		if (chaine_null_ou_vide(input)) {
			input = "my friend";
		} else {
			input = input.trim().substring(0, 1).toUpperCase() + input.trim().substring(1);

		}
		return input;
	}

}
