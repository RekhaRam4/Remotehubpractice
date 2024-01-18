package collections;


import java.util.*;

public class collectionlist {
    public static  void main(String[] args)
    {
        List l1 = new ArrayList();
        l1.add("Ram");
        l1.add("Rekha");
        System.out.println(l1);

        Set s1=new HashSet();
        s1.add("Ram");
        s1.add("Rekha");
        s1.add("Ram");
        System.out.println(s1);
        Map m1=new HashMap();
        m1.put("101","Naru");
        m1.put("102","sara");
        System.out.println(m1);

    }
}
