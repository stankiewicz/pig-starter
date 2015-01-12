package pl.stankiewicz.bigdata.starter.pig;

import java.io.IOException;

import org.apache.pig.pigunit.PigTest;
import org.apache.pig.tools.parameters.ParseException;
import org.junit.Test;

public class MyPigTest {
	private static final String PIG_SCRIPT = "script.pig";

	@Test
	public void testScript() throws IOException, ParseException {
		String[] args = { "n=1" };
		PigTest test = new PigTest(PIG_SCRIPT, args);
		String[] input = { "ala", "bela" };
		String[] output = { "(ala)" };
		test.assertOutput("data", input, "limited", output);
	}
}