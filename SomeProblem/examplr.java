package SomeProblem;

import java.io.IOException;

public class examplr {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*Scanner sc = new Scanner(System.in);
        String txt = null;
        System.out.println("To quit Typing write : exit");
        System.out.println("Type values and Enter");
        StringBuilder txt1 = new StringBuilder();
        while (!(txt = sc. nextLine()).equals("exit")){
    }

            txt1.append(txt + '\n');
            System.out.println("Echo :" + txt);
        }
        System.out.println(txt1);*/
/*
        FileSystem fs = FileSystems.getDefault();
        fs.getFileStores().forEach(s -> System.out.println(s.type() + ' ' + s.name()));
        fs.getRootDirectories().forEach(p -> System.out.println(p));
        String separator = fs.getSeparator();*/

        /*Path path = Path.of("docs", "index.html");
        URI url = URI.create("http://openjdk.java.net");
        HttpRequest req = HttpRequest.newBuilder(url).GET().build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<Path> res = client.send(req, HttpResponse.BodyHandlers.ofFile(path));*/

        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();


        int num = 12345;
        if (num == 0)
            System.out.println(0);
        else{
            System.out.println(Math.log10(num));
            System.out.println(Math.floor(Math.log10(num)) + 1);
        }
    }
}