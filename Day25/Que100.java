public class Que100 {
    public static void main(String[] args) {

        String words[] = {"Java", "Programming", "Is", "Fun", "Language"};

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() > words[j].length()) {

                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words Sorted by Length:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}