public class Que94 {
    public static void main(String[] args) {

        String str = "aaabbccccdd";

        String compressed = "";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {

                compressed = compressed + str.charAt(i) + count;
                count = 1;
            }
        }

        compressed = compressed + str.charAt(str.length() - 1) + count;

        System.out.println("Compressed String = " + compressed);
    }
}