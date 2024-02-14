package ru.serjeypyzin;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.subtract(a, b));
        System.out.println(Calculator.divide(a, b));


        String[]array1 = {"Hello", "World"};
        String[]array2 = {"book", "car"};
        String[]array3 = {"bike", "home", "chance"};
        Integer[]arr1 = {1, 2, 3};
        Integer[]arr2 = {4, 5, 6};
        Integer[]arr3 = {10, 12, 13, 14};

        System.out.println("=========================================");
        System.out.println(SecondTask.compareArrays(array1, array2));
        System.out.println(SecondTask.compareArrays(array1, array3));
        System.out.println(SecondTask.compareArrays(arr1, arr2));
        System.out.println(SecondTask.compareArrays(arr1, arr3));
        System.out.println(SecondTask.compareArrays(array1, arr1));

        System.out.println("=========================================");
        Pair<String, Integer> pair = new Pair<>("book", 200);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}