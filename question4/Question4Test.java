package question4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Question4Test {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("/home/emre/IdeaProjects/Data_Structures_Assignment/question4/sample.txt");
        List<String> listTest = Question4.listOfWordsInFile(filePath);
        System.out.println(listTest.size());
        for (String string : listTest) {
            System.out.println(string);
        }
        List<String> list = Question4
                .returnDistinctWordsList(Question4.returnLoweredWordsList(Question4.listOfWordsInFile(filePath)));
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println(list.size());
    }

}
