package question3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question3 {
    public static List<String> returnListWithoutDuplicates(List<String> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}