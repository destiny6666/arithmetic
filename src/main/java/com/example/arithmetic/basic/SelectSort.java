package com.example.arithmetic.basic;

public class SelectSort extends SortParent{
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length ; j++) {
                if(less(a, j , min)) min = j;
            }
            exchage(a, i, min);
        }
        show(a);
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
