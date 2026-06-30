import java.util.Arrays;

public class Que99 {
    public static void main(String[] args) {

        String names[] = {"Lakshya", "Aryan", "Utkarsh", "Nitin", "Ambuj"};

        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}