package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_EX1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Martin", Welcome.welcome("Martin"));// cas premiere lettre déja en majuscule
		assertEquals("Hello, Élodie", Welcome.welcome("élodie"));// test lettre avec accent
		assertEquals("Hello, Jean-baptiste", Welcome.welcome("jean-baptiste"));
		assertEquals("Hello, Julie", Welcome.welcome("    julie    ")); // ajouter des espaces dans la chaine de
																		// caractère
		// assertThrows(IllegalArgumentException.class, () -> {
		// Welcome.welcome("");// cas chaine vide
		// });
		// assertThrows(IllegalArgumentException.class, () -> {
		// Welcome.welcome(null); // cas paramètre null

		// });
	}

	@Test
	void test_EX2() {
		assertEquals("Hello, my friend", Welcome.welcome(null));
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome("        "));
	}

}
