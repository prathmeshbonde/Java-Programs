package Practice_programs;

import java.util.*;

public class increasingNum {

    static boolean checkInc(int n) {
        int x = n % 10;
        n = n / 10;
        while (n > 0) {
            if (x <= n % 10) {
                return false;
            }
            x = n % 10;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        boolean isInc = checkInc(n);
        if (isInc == true) {
            System.out.println("Num is increasing.");
        } else {
            System.out.println("Num is not increasing.");
        }
        sc.close();
    }
}
