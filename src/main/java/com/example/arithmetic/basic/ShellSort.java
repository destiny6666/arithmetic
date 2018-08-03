package com.example.arithmetic.basic;

public class ShellSort extends SortParent{
    public static void sort(Comparable[] a) {
        int n=a.length;
        int h=1;
        while (h<n/3) h=3*h+1;
        while(h>=1){
            for(int i=0;i<n;i=i+h){

                for(int j=i;j>0&&less(a,j,j-h);j=j-h){
                    exchage(a,j,j-h);
                }
            }
            h=h/3;
        }
        show(a);
    }
    public static void main(String[] args) {
        Comparable<Integer>[] a=new Comparable[16];
        System.out.println("原始数据：");
        for(int i=0;i<16;i++){
            int random = (int) (Math.random() * 100 + 1);
            System.out.print(random+";");
            a[i]=random;
        }
        sort(a);

    }
}
