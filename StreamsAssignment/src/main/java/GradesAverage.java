/*Create a program that reads integer grades and stores them in an ArrayList, then use stream processing to perform the average
        calculation.*/

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class GradesAverage {

    public static void main(String args[])
    {
        List<Integer> set=new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("How many grades do you want to enter?");
        int count = s.nextInt();
        System.out.println("Enter "+ count + " grades");
        for(int i=0;i<count;i++)
        set.add(s.nextInt());

        OptionalDouble result = set.stream().mapToInt(e -> e).average();
        System.out.println("The average of the grades is " + result);
    }
}
