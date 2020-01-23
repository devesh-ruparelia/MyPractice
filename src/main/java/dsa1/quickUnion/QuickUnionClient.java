package dsa1.quickUnion;

public class QuickUnionClient {
    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);
        qu.union(1,2);
        System.out.println(qu.find(1,2));
        System.out.println(qu.find(3,4));
        qu.union(3,4);
        System.out.println(qu.find(3,4));
        System.out.println(qu.find(1,4));
        qu.union(2,3);
        System.out.println(qu.find(1,4));
    }
}
