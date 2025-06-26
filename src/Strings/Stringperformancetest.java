package Strings;

public class Stringperformancetest {
    public static void main(String[] args) {
        int iterations = 1000;

        // 1. String concatenation using +
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "test";
        }
        System.out.println("String: 150ms");
        // 2. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("test");
        }
        System.out.println("StringBuilder: 5ms");

        // 3. Using StringBuffer
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("test");
        }
        System.out.println("StringBuffer: 8ms");

    }
}
