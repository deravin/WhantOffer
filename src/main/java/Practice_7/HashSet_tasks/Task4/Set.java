package Practice_7.HashSet_tasks.Task4;

import java.util.HashSet;

public class Set {
    private HashSet<Integer> set;
    public Set(){
        this.set = new HashSet<>();
    }
    public void addElement(int e){
        set.add(e);
    }
    public boolean isSetContainsElementsFromAnotherSet(HashSet<Integer> set2){
        return set.containsAll(set2);
    }
}
