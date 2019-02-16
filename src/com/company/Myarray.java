package com.company;

public class Myarray implements Array{
    int a[] = new int[50];
    int size =0;

    @Override
    public  int get (int i){
        return a[i];
    }

    @Override
    public  boolean Add (int x){
        if (size!=a.length){
            a[size] = x;
            size++;
            return true;
        }else
            return false;

    }
}
