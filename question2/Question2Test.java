package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(Arrays.asList("apple", "train", "plane", "gun", "metal", "bread"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("banana", "take", "bread", "plane", "metal", "money"));

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.print("L1: ");
        for (String string : list1) {
            System.out.print("[" + string + "]");
        }
        System.out.println();
        System.out.print("L2: ");
        for (String string : list2) {
            System.out.print("[" + string + "]");
        }
        System.out.println();
        List<String> L3 = Question2.returnUnionOfSortedLists(list1, list2);
        System.out.print("L3: ");
        for (String string : L3) {
            System.out.print("[" + string + "]");
        }

    }
}