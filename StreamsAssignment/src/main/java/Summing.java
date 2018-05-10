/*Summing the Triples of the Even Integers from 2 through 10*/

import java.util.stream.IntStream;

public class Summing {

    public static void main(String args[])
    {
        int sum = IntStream.rangeClosed(2,10).filter(i -> i%2==0).map(i -> i*3).sum();
        System.out.println("Sum of the Triples of the Even Integers from 2 through 10 is " + sum);
    }

}
