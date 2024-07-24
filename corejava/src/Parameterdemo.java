import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterdemo {
	@ParameterizedTest
	@ValueSource(strings= {"calli","balli","suri"})
	void endawithI(String str) {
		assertTrue(str.endsWith("i"));
	}

}
