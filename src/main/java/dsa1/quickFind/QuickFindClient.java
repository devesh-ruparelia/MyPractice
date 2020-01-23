package dsa1.quickFind;

public class QuickFindClient {
    public static void main(String[] args) {
        QuickFindUF qFindTest = new QuickFindUF(10);
        qFindTest.union(1,2);
        qFindTest.union(3,4);
        qFindTest.union(5,6);
        System.out.println(qFindTest.find(2,3));
        qFindTest.union(3,2);
        qFindTest.union(6,7);
        System.out.println(qFindTest.find(2,3));
        System.out.println(qFindTest.find(6,8));
        qFindTest.union(8,9);
        qFindTest.union(6,9);
        System.out.println(qFindTest.find(6,8));
    }
}
