public class Que98 {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "grape";

        System.out.print("Common Characters : ");

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) {

                boolean printed = false;

                for (int j = 0; j < i; j++) {

                    if (str1.charAt(j) == ch) {
                        printed = true;
                        break;
                    }
                }

                if (!printed) {
                    System.out.print(ch + " ");
                }
            }
        }
    }
}