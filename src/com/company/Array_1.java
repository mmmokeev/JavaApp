package com.company;

public class Array_1 implements Array {
    int a[] = new int[50];
    int size =0;

    @Override
    public  int get (int i){
        if (i <a.length)
        return a[a.length-i-1];
        else
            return a[0];
    }

    @Override
    public  boolean Add (int x) {
        if (size != a.length) {
            a[size] = x;
            size++;
            return true;
        } else
            return false;
    }
    }
