package practice;

public class P5 {

    public static void main(String[] args) {
        int x= 32;
        int y=12;
        int n = x ^ y;
        int count=0;
        while(n!=0){
            System.out.println(Integer.toBinaryString(n));
            System.out.println(Integer.toBinaryString(n-1));
            //System.out.println(Integer.toBinaryString(n&(n-1)));
            n = n & (n-1);
            count++;
        }
        //System.out.println(count);
    }
}
