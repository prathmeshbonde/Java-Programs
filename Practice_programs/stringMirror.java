package Practice_programs;

import java.util.*;

public class stringMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        StringBuffer rev = new StringBuffer(str);
        rev = rev.reverse();
        System.out.println(str + " | " + rev);
        sc.close();
    }
}
