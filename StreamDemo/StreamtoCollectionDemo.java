package StreamDemo;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//converting stream to collection
public class StreamtoCollectionDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50000);
        Stream<Integer> integerStream = intStream.boxed();
        //converting to collection by using collect method
        var list = integerStream.
                filter(x -> x%3 == 0 && x%5 ==0).
                collect(Collectors.toList());
        System.out.println(list.size());
        System.out.println(list);

        Stream<Integer> streamfromCollection = list.stream();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Hi", 1);
        map.put("kaise", 2);
        map.put("ho", 3);
        System.out.println(map);
        var  r = map.remove(3,"ho");
        System.out.println(r);
        //we are not use map in stream we use through entry set
        var stream = map.entrySet().stream();
        //done
        System.out.println(streamfromCollection);
        System.out.println(stream);
    }
}
