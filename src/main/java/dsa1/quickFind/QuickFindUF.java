package dsa1.quickFind;

public class QuickFindUF {

    /*

     */

    private int[] id;

    QuickFindUF(int N){
        id = new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }

    // O(1) operation
    public boolean find (int p,int q){
        return id[p]==id[q];
    }

    // O(N) operation
    public void union (int p,int q){
        if(!find(p,q)){
            int pid = id[p];
            int qid = id[q];
            for(int i=0;i<id.length;i++){
                if(id[i]==qid){
                    //id[i]=pid;
                    id[i]=id[p];
                }
            }
        }
    }

}
