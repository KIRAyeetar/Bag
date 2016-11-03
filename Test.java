import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class Test {
    public static void main(String[] args) {
        Bag test=new Bag();
        test.add("wow");
        test.add("overwatch");
        test.add(3.14);
        test.add(110);
        System.out.println(test.getAll()+"");

        test.delete("wow");
        System.out.println(test.getAll()+"");

        System.out.println(test.search(110)+"");
        System.out.println(test.search("wow")+"");

        System.out.println(test.isEmpty()+"");

    }
}
