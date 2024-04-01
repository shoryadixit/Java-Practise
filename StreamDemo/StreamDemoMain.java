package StreamDemo;
//we create an integer stream from predefined Intstream, and will apply
//some operation on it

import java.util.stream.IntStream;

public class StreamDemoMain {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 60000);
        //now i want ot print this stream
        intStream.forEach(System.out::println);
        IntStream integerStream = IntStream.range(1, 5000);
        long count = integerStream.filter(x -> x%3 == 0 && x%5 == 0).count();
        System.out.println("Count of numbers which are divisible by 3 and 5 " + count);



    }
}
