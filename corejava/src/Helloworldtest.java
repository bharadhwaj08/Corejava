import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Helloworldtest {
@Test
void print() {
	System.out.println("hello");
}
@Test
void show() {
	System.out.println("welcome to java");
}
@RepeatedTest(3)
@Test
void display() {
	System.out.println("hello world");
}
}

