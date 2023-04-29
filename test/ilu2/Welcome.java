package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (chaine_null_ou_vide(input)) {
			return "Hello, my friend";
		}
		if (input.contains(",")) {
			String resultat = "Hello, ";
			String[] names = input.split(",");
			for (int i = 0; i < names.length - 1; i++) {
				resultat = resultat + traitement_nom(names[i]);
				resultat = resultat + ", ";
			}
			return resultat + traitement_nom(names[names.length - 1]);
		} else if (input.trim().equals(input.trim().toUpperCase())) {
			return "HELLO, " + input.trim() + " !";
		} else {
			input = input.trim();
			String name = input.substring(0, 1).toUpperCase() + input.substring(1);
			return "Hello, " + name;
		}
	}

	private static boolean chaine_null_ou_vide(String input) {
		return input == null || input.trim().isEmpty() || input.equals("null");
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
