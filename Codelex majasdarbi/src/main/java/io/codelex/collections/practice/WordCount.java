package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        List<String> text = Files.readAllLines(path, charset);

        int lineCount = text.size();
        int charCount = 0;
        int wordCount = 0;

        for (String lines : text){
            String[] words = lines.split("\\s+");
            wordCount += words.length;
            charCount += lines.length();
        }

        System.out.println("Lines = " + lineCount + "\n" + "Words = " + wordCount + "\n" + "Chars = "+ charCount);







    }
}
