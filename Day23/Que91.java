import java.util.Arrays;

public class Que91 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {

            System.out.println("Not Anagram");
            return;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
    }
}