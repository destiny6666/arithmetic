package com.example.arithmetic.basic;

public abstract  class SortParent {
    public static void sort(Comparable[] a){

    }
    public static boolean  less(Comparable[] a,int i,int j){
        if(a[i].compareTo(a[j])<0){
            return  true;
        }
        return false;
    }
    public static void exchage(Comparable[] a,int i,int j){
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void show(Comparable[] a){
        System.out.println();
        System.out.println("排序后：");
        for(Comparable c:a){
            System.out.print(c+";");
        }
    }
}
