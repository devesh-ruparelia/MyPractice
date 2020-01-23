package dsa1.quickUnion;

public class QuickUnion {

    /*
        
     */
        private int[] id;

        QuickUnion(int N){
            id = new int[N];
            for(int i=0;i<N;i++)
                id[i]=i;
        }

        public int root(int p){
            while(id[p]!=p){
                p=id[p];
            }
            return p;
        }
        public void union(int p,int q){
            id[root(p)]=root(q);
        }
        public boolean find(int p,int q){
            if(root(p)==root(q))
                return true;
            return false;
        }
}
