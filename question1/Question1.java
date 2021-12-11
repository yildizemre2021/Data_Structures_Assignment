package question1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Question1 {
    private Set<Integer> values = new HashSet<>();

    public Question1() {
        Collections.addAll(this.values = new HashSet<>(), 1, 22, 3, 7);
    }

    public Set<Integer> getValues() {
        return this.values;
    }

    public boolean addUserInput(int input) {
        return values.add(input);
    }
}