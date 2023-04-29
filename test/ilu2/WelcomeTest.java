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
		// assertEquals("Hello, Julie, BOb", Welcome.welcome("juLie,bOb"));
		assertEquals("Hello, JuLie and BOb", Welcome.welcome("juLie,bOb"));
		// assertEquals("Hello, Amélie, VICTOr", Welcome.welcome("amélie , VICTOr "));
		assertEquals("Hello, Amélie and VICTOr", Welcome.welcome("amélie  ,  VICTOr    "));
		// assertEquals("Hello, my friend, Victor", Welcome.welcome(" , Victor"));
		assertEquals("Hello, my friend and Victor", Welcome.welcome("   ,  Victor"));
		// assertEquals("Hello, Jean, my friend", Welcome.welcome(" jean , "));
		assertEquals("Hello, Jean and my friend", Welcome.welcome(" jean ,   "));
		// assertEquals("Hello, my friend, my friend", Welcome.welcome(" , "));
		assertEquals("Hello, my friend and my friend", Welcome.welcome("  ,    "));
		// assertEquals("Hello, my friend, my friend", Welcome.welcome(null + "," +
		// null));
		assertEquals("Hello, my friend and my friend", Welcome.welcome(null + "," + null));
		// assertEquals("Hello, Victor, my friend", Welcome.welcome("victor ," + null));
		assertEquals("Hello, Victor and my friend", Welcome.welcome("victor ," + null));
		// assertEquals("Hello, my friend, Julie", Welcome.welcome(null + ", julie "));
		assertEquals("Hello, my friend and Julie", Welcome.welcome(null + ", julie "));
	}

	@Test
	void test_EX5() {
		assertEquals("Hello, Amélie, VICTOr, Maram and Hugo", Welcome.welcome("amélie  ,  VICTOr  ,maram , hugo  "));
		assertEquals("Hello, my friend, my friend and my friend", Welcome.welcome(null + "," + null + "," + null));
		assertEquals("Hello, my friend, Amine, my friend and Nicolas",
				Welcome.welcome(null + ", amine ," + null + ", nicolas"));
		assertEquals("Hello, Thierry, my friend and my friend", Welcome.welcome(" thierry ," + null + "," + null));
		assertEquals("Hello, my friend, my friend, Angelo, Amélie and my friend",
				Welcome.welcome(null + "," + null + ", angelo , amélie ," + null));
		assertEquals("Hello, my friend, my friend, my friend, my friend and my friend",
				Welcome.welcome("  ,  ,  ,  ,  "));
		assertEquals("Hello, my friend, my friend, my friend, my friend, Angelo, my friend, Amélie and my friend",
				Welcome.welcome(null + ",   ,  ," + null + ", angelo ,   , amélie ," + null));

	}

	@Test
	void test_EX6() {
		assertEquals(
				"Hello, my friend, my friend, my friend, my friend, my friend, Amélie and my friend.AND HELLO, ANGELO !",
				Welcome.welcome(null + ", , ," + null + ",    ANGELO , , amélie ," + null));
		assertEquals("Hello, Amélie, Maram and Hugo.AND HELLO, VICTOR AND CHRESTINE !",
				Welcome.welcome("amélie , VICTOR ,maram , CHRESTINE  ,   hugo "));
		assertEquals("Hello, Amine.AND HELLO, NICOLAS !", Welcome.welcome(" amine , NICOLAS"));
		assertEquals("Hello, my friend.AND HELLO, JULIE !", Welcome.welcome(null + ", JULIE "));
		assertEquals("AND HELLO, ELODIE, JANET AND JULIE !", Welcome.welcome("ELODIE ,      JANET, JULIE "));

	}

	@Test
	void test_EX7() {
		assertEquals("Hello, my friend, my friend, my friend, my friend and my friend",
				Welcome.welcome("  ,  ,  ,  ,  "));
		assertEquals("AND HELLO, NICOLAS, IMAD AND JULIE !", Welcome.welcome("NICOLAS ,     IMAD, JULIE "));
		assertEquals("Hello, my friend.AND HELLO, AHMED !", Welcome.welcome(null + ", AHMED "));
		assertEquals(
				"Hello, my friend, my friend, my friend, my friend, Angelo, my friend, Amélie and my friend.AND HELLO, AMINE AND JEAN !",
				Welcome.welcome(null + ",   ,  ," + null + ", angelo ,   , amélie ," + null + ",AMINE,JEAN"));
	}

	@Test
	// mon travail respecte déja l'exigence numéro 8
	void test_EX8() {
		assertEquals("AND HELLO, ELODIE, JANET AND JULIE !", Welcome.welcome("ELODIE ,      JANET,      JULIE "));
		assertEquals("Hello, MaRCOS, Antoine and Meriam", Welcome.welcome("    MaRCOS   ,   antoine  , meriam "));
		assertEquals("Hello, MaRCOS, my friend, Antoine, Meriam and my friend.AND HELLO, NICOLAS !",
				Welcome.welcome("    MaRCOS  ,NICOLAS  ,   ,   antoine  , meriam ," + null));
	}
}
