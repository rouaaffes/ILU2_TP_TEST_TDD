package ilu2;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_EX1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Martin", Welcome.welcome("Martin"));// cas premiere lettre déja en majuscule
		assertEquals("Hello, Élodie", Welcome.welcome("élodie"));// test lettre avec accent
		assertEquals("Hello, Jean-baptiste", Welcome.welcome("jean-baptiste"));
		assertThrows(IllegalArgumentException.class, () -> {
			Welcome.welcome("");// cas chaine vide
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Welcome.welcome(null); // cas paramètre null
		});
	}

}
