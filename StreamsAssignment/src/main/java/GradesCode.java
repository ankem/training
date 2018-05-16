/*Create a program that reads integer grades and stores them in an ArrayList,
        then use stream processing to display each grade’s letter equivalent (A, B, C, D or F).*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GradesCode {

    public static void main(String args[])
    {
        List<Integer> set=new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("How many grades do you want to enter?");
        int count = s.nextInt();
        System.out.println("Enter "+ count + " grades");
        for(int i=0;i<count;i++)
            set.add(s.nextInt());

        Function<Integer, Character> gradeMapper = e -> {
            if(e>80)
                return 'a';
            else if(e>60)
                return 'b';
            else return 'f';
        };
        List<Character> result = set.stream().map(gradeMapper).collect(Collectors.toList());
        System.out.println(result);
    }
}
