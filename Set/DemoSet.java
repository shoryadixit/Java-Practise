package Set;

import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("AB");
        s.add("BC");
        s.add("CD");
        s.add("DE");
        System.out.println(s);
        //s.remove(1);//it is not working in hashset
        s.remove("DE");
        System.out.println(s);

        String name = "DB";
        System.out.println(s.contains(name));
    }
}