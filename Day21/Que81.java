public class Que81 {
    public static void main(String[] args) {
        String str = "Utkarsh";

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        System.out.println("Length = " + count);
    }
}