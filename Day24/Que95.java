public class Que95 {
    public static void main(String[] args) {

        String sentence = "Java is an object oriented programming language";

        String words[] = sentence.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {

                longest = words[i];
            }
        }

        System.out.println("Longest Word = " + longest);
        System.out.println("Length = " + longest.length());
    }
}