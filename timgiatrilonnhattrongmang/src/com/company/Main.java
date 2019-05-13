package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int size;
	   do {
           System.out.println("Nhap size");
           size=scanner.nextInt();
           if (size>20){
               System.out.println("Size khong duoc vuot qua 20");
           }
       } while (size>20);
        int[] array=new int[size];
           int i=0;
           while (i<array.length){
               System.out.println("Nhap gia tri o chi so"+i);
               array[i]=scanner.nextInt();
               i++;
           }
           int k=0;
           while (k<array.length){
               System.out.print(array[k]+"\t");
               k++;
           }
           int max =array[0];
           int j=1;
           int vitri=1;
           while (j<array.length){
               if (array[j]>max){
                   max=array[j];
                   vitri=j+1;
               }
               j++;
           }
        System.out.println("Phan tu co gia tri lon nhat trong mang la "+max+" o vi tri "+ vitri);

    }
}
