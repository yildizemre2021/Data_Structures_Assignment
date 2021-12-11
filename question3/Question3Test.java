package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3Test {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "apple", "banana"));
        List<String> listWithoutDuplicates = Question3.returnListWithoutDuplicates(listWithDuplicates);
        for (String string : listWithoutDuplicates) {
            System.out.println(string);
        }
    }
}