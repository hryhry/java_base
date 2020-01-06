package com.hry;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int treeHave = 0; //一棵树上剩下的果子
        int treeALL = 0; //所有树的果子
        int D=0;
        int E = 0 ;
        int [] e = new int[m];
        for (int i=0;i<m;i++){
            boolean drop = false;
            int sum = 0;
            int n = sc.nextInt();
            treeHave = sc.nextInt();
            for (int j=1;j<n;j++){
                int num = sc.nextInt();
                if (num>0){
                    if (treeHave>num && drop==false){
                        drop =true;
                        D++;
                        e[i]=1;
                        treeHave=num;
                    }
                }else {
                    treeHave += num;
                }
            }
            treeALL += treeHave;
        }
        for (int i = 0;i<m+3;i++){
            if (e[i%m]==1 && e[(i+1)%m]==1 && e[(i+2)%m]==1 ){
                E++;
            }
        }
        System.out.println(treeALL+" "+D+" "+ E);
    }

}
