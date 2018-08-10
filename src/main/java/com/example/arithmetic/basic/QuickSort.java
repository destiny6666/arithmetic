package com.example.arithmetic.basic;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort extends SortParent {
    public static void sort(Comparable[] a){
        //打乱数组
        Collections.shuffle(Arrays.asList(a));
        sort(a,0,a.length-1);
        show(a);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if(lo>=hi) return ;
        int j=pagination(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    public static int pagination(Comparable[] a,int lo,int hi){
        int i=lo;
        int j=hi+1  ;
        Comparable v=a[lo];
        while (true){
            while(less(a,++i,lo)) if(i==hi) break;
            while(less(a,lo,--j)) if(j==lo) break;
            if (i >= j) break;
            exchage(a,i,j);
        }
        exchage(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Comparable<Integer>[] a=new Comparable[10];
        System.out.println("原始数据：");
        for(int i=0;i<10;i++){
            int random = (int) (Math.random() * 100 + 1);
            System.out.print(random+";");
            a[i]=random;
        }
        sort(a);
    }
}
