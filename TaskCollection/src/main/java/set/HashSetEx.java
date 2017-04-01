package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("vf");
        st.add("fv");
        System.out.println(st.add("fv1"));
//        Map smp = Collections.synchronizedMap(mp);
        Iterator<String> it = st.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        for (String s : st) {
            System.out.println(s);
        }

    }
}
