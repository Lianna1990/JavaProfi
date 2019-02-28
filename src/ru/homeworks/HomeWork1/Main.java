package ru.homeworks.HomeWork1;

import java.util.ArrayList;

public class Main {

    public static <E> E[] change(E[] arr, int a, int b) {
        E let;
        let = arr[a];
        arr[a] = arr[b];
        arr[b] = let;
        return arr;
    }

    public static <E> ArrayList<E> toArrayList(E[] arr) {
        ArrayList<E> arrL = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrL.add(arr[i]);
        }
        return arrL;
    }

    public static <E> void arrPrint(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"0","1", "2", "3", "4",};
        arrPrint(arr);
        System.out.println("arr ---");
        change(arr, 1, 2);
        arrPrint(arr);
        System.out.println("arrChange ---");

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }
        System.out.println("appleBox weight: " + appleBox.getWeight());

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        System.out.println("appleBox1 weight: " + appleBox1.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        System.out.println("orangeBox weight: " + orangeBox.getWeight());

        System.out.println("Compare orangeBox and appleBox: " + orangeBox.compare(appleBox));

        appleBox.union(appleBox1);
        System.out.println("appleBox1 after union: " + appleBox1.getWeight());
    }
}