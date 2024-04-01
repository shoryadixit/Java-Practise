package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemoMain {
    public static void main(String[] args) {
        String regex = "[gG][lL][aA]1\\d{5}";
        Pattern pattern = Pattern.compile(regex);
        String input = "GLA118304";
        Matcher matcher = pattern.matcher(input);

        //to check if input matched
        System.out.println(matcher.matches());

        while (matcher.find()){
            System.out.println("start index of match= " + matcher.start());

            System.out.println("end index of match = " + matcher.end());
        }
    }
}
