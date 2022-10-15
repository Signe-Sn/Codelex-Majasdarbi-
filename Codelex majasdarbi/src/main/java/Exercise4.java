import java.io.*;

public class Exercise4 {

    private static final String PATH_TO_APP = "C:\\Users\\user\\Desktop\\";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "Text.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "outText.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            out.write(stringBuilder.append(line).reverse() + "\n");
        }
        in.close();
        out.close();
    }
}
