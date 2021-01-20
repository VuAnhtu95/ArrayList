import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0,3);
        myList.add(1,4);
        myList.add(2,5);
        myList.add(3,1);
        myList.add(4,1);
        myList.add(5,3);
        myList.add(6,4);
        myList.add(7,5);
        myList.add(8,1);
        myList.add(9,1);
        int a = myList.get(4);
        System.out.println(a);
        myList.add(0,3);
        int b = myList.get(0);
        System.out.println(b);
    }
}
