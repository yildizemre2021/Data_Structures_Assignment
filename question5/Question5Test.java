package question5;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import question4.Question4;

public class Question5Test {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("/home/emre/IdeaProjects/Data_Structures_Assignment/question4/sample.txt");
        List<String> list = Question4.returnLoweredWordsList(Question4.listOfWordsInFile(filePath));
        for (String string : list) {
            System.out.println(string + " ," + Collections.frequency(list, string));
        }
    }
}
