package Education;

import java.util.Scanner;

public class Education {
    public int getDegree(String degree) {
        if (degree.equalsIgnoreCase("PhD")) return 9;
        else if (degree.equalsIgnoreCase("MSc")) return 6;
        else if (degree.equalsIgnoreCase("BSc")) return 4;
        else throw new RuntimeException();
    }


    public static void main(String[] args) {
        Education main = new Education();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your degree: ");
        String degree = s.nextLine();

        int value = main.getDegree(degree);
        System.out.println(value + " years!");
    }
}
