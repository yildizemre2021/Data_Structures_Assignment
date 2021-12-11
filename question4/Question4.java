package question4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import question3.*;

public class Question4 {
    public static List<String> listOfWordsInFile(Path filePath) throws IOException {

        String data = Files.readString(filePath);
        String s = data.replace("\n", " ");

        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        for (String string : list) {
            if (string.contains(" ") || string.contains("\n") || string.contains("\t") || string.contains("\\"))
                list.remove(string);
        }
        return list;

    }

    public static List<String> returnDistinctWordsList(List<String> list) {
        return Question3.returnListWithoutDuplicates(list);
    }

    public static int wordSizeInList(List<String> list) {
        return list.size();
    }

    public static List<String> returnLoweredWordsList(List<String> list) {
        return list.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}