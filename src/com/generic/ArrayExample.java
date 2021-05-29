package com.generic;

public class ArrayExample<x,y,z> {
    x[] myxArray;
    y[] myyArray;
    z[] myzArray;

    public ArrayExample(x[] myxArray, y[] myyArray, z[] myzArray) {
        this.myxArray = myxArray;
        this.myyArray = myyArray;
        this.myzArray = myzArray;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};

        new ArrayExample<Integer,Double,Character>(intArray,doubleArray,charArray).toPrint();
    }

    private void toPrint() {
        toPrint(myxArray);
        toPrint(myyArray);
        toPrint(myzArray);
    }

    private static <E> void toPrint(E[] intArray) {
        for (E element : intArray) {
            System.out.println(element);
        }
        System.out.println();
    }

}





