package javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaList {
     List<Integer> list = new ArrayList<Integer>();

    public List<Integer> getList() {
        return list;
    }

    public void setList(int n) {
        list.add(n);
    }
    public void sort(){
        Collections.sort(list);
    }
    public void reversesort(){
        Collections.sort(list,Collections.reverseOrder());
    }
    public void find(){
        if (list.contains(2)){
            System.out.println("True");
        }
    }
    public void remove(){
        list.remove(0);
        list.remove(0);
        list.remove(0);
    }
}
