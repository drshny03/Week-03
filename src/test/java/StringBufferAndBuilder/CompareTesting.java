package StringBufferAndBuilder;

import com.tit.day04.stringbufferandbuilder.stringbuffer.Compare;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareTesting {

   static Compare
           compare;
    @BeforeAll
    static void setUp()
    {
        compare  = new Compare();
    }

    @Test
    void testbufferPerformance()
    {
        long bufferTime = compare.bufferPerformance();
        assertTrue(bufferTime>0);
    }
    @Test
    void testbuilderPerformance()
    {
        long builderTime = compare.bufferPerformance();
        assertTrue(builderTime>0);
    }
}
