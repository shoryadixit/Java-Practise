package SomeProblem;

import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file1 = new File("D:\\Desktop\\Software engineering.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        String st;
        while ((st = br.readLine()) != null){
            System.out.println(st);
        }
    }
}
