package question2;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Question2 {
    public static List<String> returnUnionOfSortedLists(List<String> list1, List<String> list2) {
        Set<String> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        List<String> sortedUnionList = new ArrayList<>(set);
        Collections.sort(sortedUnionList);
        return sortedUnionList;
    }
}