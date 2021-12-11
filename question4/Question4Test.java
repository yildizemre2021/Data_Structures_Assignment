package question4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Question4Test {
    public static void main(String[] args) throws IOException {
        /*
         * List<String> list = Question4
         * .listOfWordsInFile(
         * "C:\\Users\\Emre\\Code\\Java\\Data_Structures_Assignment\\question4\\sample.txt"
         * );
         * for (String string : list) {
         * System.out.println(string);
         */
        Path filePath = Path.of("C:\\Users\\Emre\\Code\\Java\\Data_Structures_Assignment\\question4\\sample.txt");
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
