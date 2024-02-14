package ru.serjeypyzin;
/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(),
subtract(). Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
*/
public class Calculator {

    public static <T extends Number> double sum (T firstNumber, T secondNumber){
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number> double multiply (T firstNumber, T secondNumber){
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public static <T extends Number> double divide (T firstNumber, T secondNumber){
        if (secondNumber.doubleValue() == 0){
            throw new IllegalArgumentException("Ошибка! Деление на ноль невозможно!");
        }
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }

    public static <T extends Number> double subtract (T firstNumber, T secondNumber){
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
}
