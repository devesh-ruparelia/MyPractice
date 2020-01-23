package practice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11 {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pQueue.add(stone);
        }
        while(!pQueue.isEmpty()){
            int a = pQueue.remove();
            if(pQueue.isEmpty())
                return a;
            int b = pQueue.remove();
            int c = a-b;
            if(c>0){
                pQueue.add(c);
            }
        }
        return 0;
    }
}
