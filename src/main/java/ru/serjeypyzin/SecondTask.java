package ru.serjeypyzin;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину
 и содержать элементы одного типа.
 */

public class SecondTask {

    public static <T> boolean compareArrays (T[] firstSomeArray, T[] secondSomeArray){
        if (firstSomeArray.length != secondSomeArray.length){
            return false;
        }

        for (int i = 0; i < firstSomeArray.length; i++) {
            if (!firstSomeArray[i].getClass().getTypeName().equals(secondSomeArray[i].getClass().getTypeName())){
                return false;
            }
        }
        return true;
    }
}
