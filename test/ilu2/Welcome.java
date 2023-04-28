package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input == null) {
			throw new IllegalArgumentException("Le chaine de carctère du nom  ne peut pas être null");
		}
		// Vérifier que le paramètre n'est pas vide
		if (input.isEmpty()) {
			throw new IllegalArgumentException("La chaine de carctère du nom ne peut pas être vide");
		}
		String name = input.substring(0, 1).toUpperCase() + input.substring(1);
		// Retourner la chaîne "Hello, <nom>"
		return "Hello, " + name;
	}

}
