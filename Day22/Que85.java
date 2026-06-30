public class Que85 {
    public static void main(String[] args) {

        String str = "madam";
        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Compare original and reversed string
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is Not a Palindrome String.");
        }
    }
}