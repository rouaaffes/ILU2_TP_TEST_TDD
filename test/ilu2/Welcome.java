package ilu2;

//welcome 
public class Welcome {

	public static String welcome(String input) {
		if (chaine_null_ou_vide(input)) {
			return "Hello, my friend";
		}
		if (input.contains(",")) {
			String[] names = input.split(",");
			return traitement_chaine_minuscule_majuscule(names);

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

	private static String traitement_chaine_minuscule_majuscule(String[] names) {
		String chaine_minuscule = "Hello, ";
		String chaine_majuscule = "AND HELLO, ";
		for (int i = 0; i < names.length; i++) {
			String name = traitement_nom(names[i]);
			if (name.equals(name.toUpperCase())) {
				chaine_majuscule = chaine_majuscule + name + ", ";
			} else {
				chaine_minuscule = chaine_minuscule + name + ", ";
			}
		}
		if (chaine_minuscule == "Hello, ") {
			return chaine_majuscule.substring(0, chaine_majuscule.length() - 2) + " !";
		}
		if (chaine_majuscule == "AND HELLO, ") {
			return chaine_minuscule.substring(0, chaine_minuscule.length() - 2);
		}
		return chaine_minuscule.substring(0, chaine_minuscule.length() - 2) + "."
				+ chaine_majuscule.substring(0, chaine_majuscule.length() - 2) + " !";
	}
}
