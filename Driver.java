import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Driver {
  public static void main(String[] args) throws IOException {
    ProcessBuilder builder = new ProcessBuilder("test-script.js");
    Map<String, String> env = builder.environment();

    env.put("HTTP_VERSION", "HTTP/1.1");

    Process process = builder.start();
    process.getOutputStream();

    BufferedReader reader = new BufferedReader(
        new InputStreamReader(
            process.getInputStream()));

    String line = "";
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
  }
}