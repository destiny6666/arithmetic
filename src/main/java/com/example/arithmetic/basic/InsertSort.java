package com.example.arithmetic.basic;

public class InsertSort extends SortParent{
    public static void sort(Comparable[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i;j>0&&less(a,j,j-1);j--){
                exchage(a,j,j-1);
            }
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
