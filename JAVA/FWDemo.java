import java.io.*;

public class FWDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello World");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}