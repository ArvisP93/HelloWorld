package HelloWorldPackage;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import junit.framework.Assert;

public class MainTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(byteArrayOutputStream);
		Hello.printHelloWorld(printStream);
		String outString = byteArrayOutputStream.toString();
		Assert.assertEquals("Hello world!\n", outString);
		//fail("Not yet implemented");
	}

}
