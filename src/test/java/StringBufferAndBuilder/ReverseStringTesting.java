package StringBufferAndBuilder;

import com.tit.day04.stringbufferandbuilder.stringbuilder.ReverseString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTesting
{
    static ReverseString reverseString;
    @BeforeAll

    static void setUp()
    {
        reverseString = new ReverseString();
    }
    @Test
    void testReverseString()
    {
        StringBuilder input = new StringBuilder("darshan");

        StringBuilder result = new StringBuilder(input);
        assertEquals("vaday nahsrad",result);


    }
}
