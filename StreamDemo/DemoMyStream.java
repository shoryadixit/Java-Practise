package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoMyStream {
    public static void main(String[] args){
        //Create a list of integers
        List<Integer> number = Arrays.asList(1,22,3,4,5);
        System.out.println("Demonstation of map method");
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        //Creating a list of String
        List<String> names = Arrays.asList("A","B","C","D");

        System.out.println("Demonstrate filter method");
        List<String> result = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());;
        System.out.println(result);

        System.out.println("demonstration of sorted method");
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        //creata a list of integer
        List<Integer> numbers = Arrays.asList(2,3,4,56,6,2);

        System.out.println("collect method return a set");
        Set<Integer> squareset = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println(squareset);

        System.out.println("demonstrate  of foreach method");
        number.stream().map(x -> x*x).forEach(y -> System.out.println(y));

        System.out.println("demonstration of reduce method");
        int even = number.stream().filter(x -> x%2 == 0).reduce(0,(ans,i) -> ans + i);
        System.out.println(even);
    }
}
