package practice;

import java.util.Queue;

public class P6 {
    public static void main(String[] args) {
         String str="a.b.c.de+fgh+ijk";
         int size = str.length();
         int [] p = new int[4];
         int a=str.indexOf("+");
        System.out.println(a);
        System.out.println(str.substring(2,4));
        str=str.replaceAll("\\.","");
        System.out.println(str);

    }
}
