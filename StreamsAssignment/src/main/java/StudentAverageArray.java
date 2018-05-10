/*defined a two-dimensional array of grades with 10 rows and three columns, representing 10 students’ grades on three exams.
        Use a stream pipeline to calculate the average of all the grades. For this exercise, use Stream method of to create a
        stream from the two-dimensional array and Stream method flatMapToInt to map each row into a stream of int values.
        defined a two-dimensional array of grades with 10 rows and three columns, representing 10 students’ grades on three exams.
        Use streams to calculate the students’ individual averages.*/

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentAverageArray {

    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}, {11, 21, 31}, {12, 22, 32}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}};
        List<OptionalDouble> averages = Arrays.stream(array).map(t -> Arrays.stream(t).average()).collect(Collectors.toList());

        for(int i = 0;i<array.length;i++){
            System.out.println("average of"+ i +" element"+IntStream.of(array[i]).average());
        }

        OptionalDouble y = Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).average();
        System.out.println("y = " + y);
//        Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
    }
}
