package com.GenericFunction;

public class GenericClass <T extends Comparable<T>>{
    public void sort(T[] array){
        for(int i = 0;i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i].compareTo(array[j])> 0){
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public void print(T[] array){
        for(T value:array){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();
        Integer[] number = {30,20,23,75,86};
        genericClass.sort(number);
        genericClass.print(number);

        GenericClass<String> genericClasses = new GenericClass<>();
        String[] stringValue = {"Sathashini","Keerthana","Abiksha","Sobhan bro","Maddu Bro"};
        genericClasses.sort(stringValue);
        genericClasses.print(stringValue);

        GenericClass<Character> genericChar = new GenericClass<>();
        Character[] charValue = {'S','k','A','B','C'};
        genericChar.sort(charValue);
        genericChar.print(charValue);



    }


}
