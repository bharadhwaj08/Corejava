import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptiondemo {
@Test
void testonassume() {
	int a=5,s=25;
	Assumptions.assumeTrue(a==a*a);
	System.out.println("ok");
}

}
