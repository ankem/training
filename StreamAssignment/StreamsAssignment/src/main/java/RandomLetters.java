/*Write a program that inserts 30 random letters into a List. Perform the following operations and display your results:
        Sort the List in ascending order.
        Sort the List in descending order.
        Display the List in ascending order with duplicates removed.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RandomLetters {

    public static void main(String args[])
    {
        List<Character> randomCharacters = new ArrayList<>();
        for(int i = 0; i<30; i++){
            int num = (int) (26* Math.random());
            char letter = (char) (num + 'a');
            randomCharacters.add(letter);
        }
        List result = randomCharacters.stream().sorted().collect(Collectors.toList());
        System.out.println("Result in ascending order");
        System.out.println(result);

        List result1 = randomCharacters.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Result in descending  order");
        System.out.println(result1);

        List result2 = randomCharacters.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Result in ascending order with no duplicates");
        System.out.println(result2);
    }
}


