package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "midtermscores.txt";

    public static void main(String[] args) throws URISyntaxException, IOException {

        Map<String, String> histogram = new LinkedHashMap<>();

        histogram.put("0-9:", "*".repeat((int) countRepeats(0, 9)));
        histogram.put("10-19:", "*".repeat((int) countRepeats(10, 19)));
        histogram.put("20-29:", "*".repeat((int) countRepeats(20, 29)));
        histogram.put("30-39:", "*".repeat((int) countRepeats(30, 39)));
        histogram.put("40-49:", "*".repeat((int) countRepeats(40, 49)));
        histogram.put("50-59:", "*".repeat((int) countRepeats(50, 59)));
        histogram.put("60-69:", "*".repeat((int) countRepeats(60, 69)));
        histogram.put("70-79:", "*".repeat((int) countRepeats(70, 79)));
        histogram.put("80-89:", "*".repeat((int) countRepeats(80, 89)));
        histogram.put("90-99:", "*".repeat((int) countRepeats(90, 99)));
        histogram.put("100:", "*".repeat((int) countRepeats(100, 100)));

        histogram.forEach((key, value) -> System.out.println(key + value));

    }

    private static long countRepeats(int start, int end) throws URISyntaxException, IOException {

        final String scores = fileContent();
        List<Integer> listOfScores = new ArrayList<>();
        String[] arrayOfScores = scores.split(" ");
        for (String arrayOfScore : arrayOfScores) {
            listOfScores.add(Integer.parseInt(arrayOfScore));
        }

        return listOfScores.stream().filter(a -> a >= start && a <= end).count();
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
