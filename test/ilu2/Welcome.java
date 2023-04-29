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

	private static String and_majuscule(String chaine_majuscule) {
		String chaine_majuscule_add = "AND HELLO, ";
		chaine_majuscule = chaine_majuscule.substring(0, chaine_majuscule.length() - 2);
		// System.out.println(chaine_majuscule);
		String[] names_majuscule = chaine_majuscule.split(",");
		if (names_majuscule.length == 2) {
			return "AND HELLO, " + names_majuscule[1].trim() + " !";
		}
		for (int i = 1; i < names_majuscule.length; i++) {
			// System.out.println(i + names_majuscule[i]);
			if (i == names_majuscule.length - 1) {
				chaine_majuscule_add = chaine_majuscule_add.substring(0, chaine_majuscule_add.length() - 2) + " AND"
						+ names_majuscule[i] + " !";
			} else {
				chaine_majuscule_add = chaine_majuscule_add + names_majuscule[i].trim() + ", ";
			}
		}
		return chaine_majuscule_add;

	}

	private static String and_minuscule(String chaine_minuscule) {
		String chaine_minuscule_add = "Hello, ";
		chaine_minuscule = chaine_minuscule.substring(0, chaine_minuscule.length() - 2);

		String[] names_minuscule = chaine_minuscule.split(",");
		// System.out.println(names_minuscule.length);
		if (names_minuscule.length == 2) {
			return "Hello," + names_minuscule[1];
		}
		for (int i = 1; i < names_minuscule.length; i++) {
			// System.out.println(i + names_minuscule[i]);
			if (i == names_minuscule.length - 1) {
				chaine_minuscule_add = chaine_minuscule_add.substring(0, chaine_minuscule_add.length() - 2) + " and"
						+ names_minuscule[i];
			} else {
				chaine_minuscule_add = chaine_minuscule_add + names_minuscule[i].trim() + ", ";
			}
		}
		return chaine_minuscule_add;

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
		if ("Hello, ".equals(chaine_minuscule)) {
			return and_majuscule(chaine_majuscule);

		}
		if ("AND HELLO, ".equals(chaine_majuscule)) {
			return and_minuscule(chaine_minuscule);
		}
		return and_minuscule(chaine_minuscule) + "." + and_majuscule(chaine_majuscule);
	}

}
