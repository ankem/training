import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class NPrimeNumbers {

    public static void main(String args[]){

        System.out.println("Enter n value");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 1);
        infiniteStream
                .limit(n)
                .filter(x -> IntStream.rangeClosed(2, x/2).anyMatch(i -> i%i == 0))
                .collect(toList())
                .forEach(System.out::println);

    }
}
