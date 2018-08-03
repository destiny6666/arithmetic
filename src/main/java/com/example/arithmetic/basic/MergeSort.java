package com.example.arithmetic.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort extends SortParent{
    public static void sort(Comparable[] a) {
        Comparable []auk = new Comparable[a.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(a,0,a.length-1,auk);
        show(a);
    }
    private static void sort(Comparable[] arr,int left,int right,Comparable []auk){
        if(left<right){
            int mid = (right+left)/2;
            sort(arr,left,mid,auk);//左边归并排序，使得左子序列有序
            sort(arr,mid+1,right,auk);//右边归并排序，使得右子序列有序
            merge(arr,left,mid,right,auk);//将两个有序子数组合并操作
        }
    }
    public static void merge(Comparable[] a,int lo,int mid,int hi,Comparable[] auk){
        System.out.println("复制后："+Arrays.toString(a));
        int i=lo;
        int j=mid+1;
        int m=0;
            while(i<=mid&&j<=hi){
                if(less(a,i,j)){
                    auk[m++]=a[i++];
                }
                else{
                    auk[m++]=a[j++];
                }
            }
            while(i<=mid){
                auk[m++]=a[i++];
            }
            while(j<=hi){
                auk[m++]=a[j++];
            }
            m=0;
        while(lo <= hi){
            a[lo++] = auk[m++];
        }
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
