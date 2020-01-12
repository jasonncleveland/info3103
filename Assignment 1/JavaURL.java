import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class JavaURL {

    private static String protocol;
    private static String domainName;
    private static String documentPath;
    private static int port;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter protocol:");
            protocol = scanner.next();

            System.out.println("Enter domain name:");
            domainName = scanner.next();

            System.out.println("Enter port number");
            port = scanner.nextInt();

            System.out.println("Enter document path:");
            documentPath = scanner.next();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        String[] documentParts = documentPath.split("/");
        String fileName = documentParts[documentParts.length - 1];

        try {
            URL url = new URL(protocol, domainName, port, "/" + documentPath);
            try (BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                try (FileWriter fileWriter = new FileWriter(new File(fileName))) {
                    String line;
                    while ((line = urlReader.readLine()) != null) {
                        fileWriter.append(line);
                        fileWriter.append('\n');
                    }
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.exit(-2);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-3);
        }
    }
}