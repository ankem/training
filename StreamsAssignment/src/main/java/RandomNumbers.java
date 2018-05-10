/*Use SecureRandom method ints to generate a stream of 50 random numbers in the range 1 to 999, then filter the resulting stream
        elements to select only the odd numbers and display the results in sorted order.*/

import java.security.SecureRandom;

public class RandomNumbers {

    public static void main(String args[])
    {
        SecureRandom random = new SecureRandom();
        random.ints( 50,1,999 ).filter(x -> x%2 != 0).sorted().forEach( System.out::println );

    }
}