import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class Bag implements Method{
    private ArrayList mainn=new ArrayList();
    public void add(Object a){
     try {
         mainn.add(a);
         Collections.shuffle(mainn);
     }catch (Exception e){}

    }

    public void delete(Object a){
        int i=-1;
       try {
           do {
               i++;
           } while (a == mainn.get(i));
           mainn.remove(a);
           Collections.shuffle(mainn);
       }catch (Exception e){
           System.out.println("false");;
       }
    }

    public boolean search(Object a){
        int size=mainn.size()-1;
        int i=0,flag=0;
        for (;i<=size;i++)
        {   if (mainn.get(i)==a)
               return true;
        }
        return false;
    }

    public ArrayList getAll()
    {
       return mainn;
    }

    public boolean isEmpty(){
        if (mainn==null)
        return true;
        else
        return  false;
    }
}
