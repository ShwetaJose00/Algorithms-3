package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class HWQUPC_Solution {
    public static void main(String[] args){
        Random random = new Random();

        for(int n =5; n<10000; n++){
            int connections = 0;
            //boolean pathCompression = true;
            UF_HWQUPC uf = new UF_HWQUPC(n,true);

            while(uf.components()>1){
                int x = random.nextInt(n);
                int y = random.nextInt(n);
                connections++;
                if(uf.connected(x, y)) continue;
                uf.connect(x, y);
            }
            //System.out.println( n + " " + connections);
            System.out.println("For " + n + " objects, there are " + " " + connections + " connection pairs" );
        }

    }

}
