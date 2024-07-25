import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterdemo {

	@ParameterizedTest
	@ValueSource(strings = {"calli","bali","suri"})
	void endwithI(String str) {
		assertTrue(str.endsWith("i"));
	}
}
