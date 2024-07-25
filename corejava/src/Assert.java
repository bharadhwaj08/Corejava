
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Assert {
public void testforassertequal() {
	int result=1;
	int exp=1;
	assertEquals(result,exp);
}
@Test
void testassertTrue() {
	assertTrue("hello". contains("i"));
}
@Test
void testnull() {
	String n=null;
	assertNull(" ");
}
}
