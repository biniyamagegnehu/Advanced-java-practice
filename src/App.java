import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("the file exists");
            System.out.println("Absolute path" + file.getAbsolutePath());

            System.out.println("writable " + file.canWrite());
            System.out.println("readable " + file.canRead());
            System.out.println("file size " + file.length());
        } else {
            System.out.println("the file doesn't exist");
        }
    }
}
