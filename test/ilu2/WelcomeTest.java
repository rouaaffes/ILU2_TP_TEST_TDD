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

	@Test
	void test_EX3() {
		assertEquals("HELLO, ROUA !", Welcome.welcome(" ROUA   "));
		assertEquals("Hello, JuLie", Welcome.welcome("juLie"));
		assertEquals("Hello, MaRCOS", Welcome.welcome("    MaRCOS    "));

	}

	@Test
	void test_EX4() {
		// test
		assertEquals("Hello, JuLie, BOb", Welcome.welcome("juLie,bOb"));
		assertEquals("Hello, Amélie, VICTOr", Welcome.welcome("amélie  ,  VICTOr    "));
		assertEquals("Hello, my friend, Victor", Welcome.welcome("   ,  Victor"));
		assertEquals("Hello, Jean, my friend", Welcome.welcome(" jean ,   "));
		assertEquals("Hello, my friend, my friend", Welcome.welcome("  ,    "));
		assertEquals("Hello, my friend, my friend", Welcome.welcome(null + "," + null));
		assertEquals("Hello, Victor, my friend", Welcome.welcome("victor ," + null));
		assertEquals("Hello, my friend, Julie", Welcome.welcome(null + ", julie "));
	}

	@Test
	void test_EX5() {
		assertEquals("Hello, Amélie, VICTOr, Maram, Hugo", Welcome.welcome("amélie  ,  VICTOr  ,maram , hugo  "));
		assertEquals("Hello, my friend, my friend, my friend", Welcome.welcome(null + "," + null + "," + null));
		assertEquals("Hello, my friend, Amine, my friend, Nicolas",
				Welcome.welcome(null + ", amine ," + null + ", nicolas"));
		assertEquals("Hello, Thierry, my friend, my friend", Welcome.welcome(" thierry ," + null + "," + null));
		assertEquals("Hello, my friend, my friend, Angelo, Amélie, my friend",
				Welcome.welcome(null + "," + null + ", angelo , amélie ," + null));
		assertEquals("Hello, my friend, my friend, my friend, my friend, my friend", Welcome.welcome("  ,  ,  ,  ,  "));
		assertEquals("Hello, my friend, my friend, my friend, my friend, Angelo, my friend, Amélie, my friend",
				Welcome.welcome(null + ",   ,  ," + null + ", angelo ,   , amélie ," + null));

	}
}
