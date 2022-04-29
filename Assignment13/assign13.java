package Assignment13;

import java.io.*;
import java.util.*;

public class assign13 {
    public static void main(String args[]) {

        HashMap<Integer, String> student_data = new HashMap<>();

        student_data.put(1, "James");
        student_data.put(2, "Robert");
        student_data.put(3, "Mary");
        student_data.put(4, "Patricia");
        student_data.put(5, "Jennifer");
        student_data.put(6, "John");

        System.out.println("|---Roll No.----Name------|");

        for (Map.Entry<Integer, String> e : student_data.entrySet())
            System.out.println("|      " + e.getKey() + "        " + e.getValue());

        System.out.println("--------------------------");

    }
}
