package com.tit.day06.runtimeanalysis.stringconcatenate;

public class StringConcatenation
{
   // String (O(N²)) - Creates new objects each time, slowest
    public static void testString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a"; // New object created each time
        }
    }

    // StringBuilder (O(N)) - Mutable, fast
    public static void testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }

    // StringBuffer (O(N)) - Thread-Safe, slightly slower than StringBuilder
    public static void testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
}
