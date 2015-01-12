package pl.stankiewicz.bigdata.starter.pig;

import java.io.IOException;

import junit.framework.Assert;

import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.junit.Test;

public class MyUdfTest {
	private TupleFactory tupleFactory = TupleFactory.getInstance();

    @Test
    public void testIdentityUDF() throws IOException {
        Tuple input = tupleFactory.newTuple("ala");
        MyUdf func = new MyUdf();
        String output = func.exec(input);
        Assert.assertEquals(input.get(0), output);
    }
}
