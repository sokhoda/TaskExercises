package abstract_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public abstract class Abstr {
        public static void naming(){
            System.out.println("naming");
        };

        public  void naming(String s){
            System.out.println(s);

        };

    public static void main(String[] args) {
        Abstr.naming();
        int[] a = new int[10];
        new String().length();
        short [] cc[] [];
        short [] ccg = new short[]{4,5,5};
        int y= 33;
        y/=2;
        System.out.println(y);
StringBuffer sb = new StringBuffer("fr");
        sb.append("-f");

        Double d = new Double(12.4);
        System.out.println("double " + (d.toString() == d.toString()));
        System.out.println(sb);
        int x=0;
        System.out.println(String.valueOf(++x) + String.valueOf(x++));
        System.out.println(String.valueOf(++x) + String.valueOf(++x) + String.valueOf(++x));
        x=10;
        System.out.println("x=" + (x+=y-=2));
        System.out.println(++x==x++);
        x=0;
        int v= ++x + ++x + ++x + x++;
        System.out.println(v);
//        x=0;
//        System.out.println(x++==++x);

//        System.out.println(true==false==false==true==false);


    }
}
