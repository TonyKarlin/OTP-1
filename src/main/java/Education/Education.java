package Education;

import java.util.Scanner;

public class Education {
    public int getDegree(String degree) {
        if (degree.equalsIgnoreCase("PhD")) return 9;
        else if (degree.equalsIgnoreCase("MSc")) return 6;
        else if (degree.equalsIgnoreCase("BSc")) return 4;
        else throw new RuntimeException();
    }
}
