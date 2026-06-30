public class Que82 {
    public static void main(String[] args) {

        String str = "Utkarsh";
        String reverse = "";

        // Traverse string from last to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse);
    }
}