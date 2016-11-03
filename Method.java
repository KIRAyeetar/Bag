import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
interface Method <T>{
     void add(T a);
     void delete(T a);
     boolean search(T a);
     ArrayList getAll();
     boolean isEmpty();
}
