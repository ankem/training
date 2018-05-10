/*
Write a program that inputs a sentence from the user (assume no punctuation), then determines and displays the unique words in
        alphabetical order. Treat uppercase and lowercase letters the same.
*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unique {

    public static void main(String args[])
    {
        System.out.println("Enter the sentence");
        Scanner s = new Scanner(System.in);
        String sent=s.nextLine();

        List<String> set=new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(sent);
        while (st.hasMoreTokens()) {
            set.add(st.nextToken().toLowerCase());
        }
        List result = set.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("The unique words in alphabetical order are: ");
        System.out.println(result);

    }
}
