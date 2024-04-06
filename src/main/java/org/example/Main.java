package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
          int s = 300;
         System.out.println("x equals: " + s);
         Integer integerWrapper = 230;
        System.out.println("IntegerWrapper equals: " + integerWrapper);

          Long byteValueFromWrapper =  integerWrapper.longValue();
          long byteValue = s;


        System.out.println("byteValueFromWrapper equals: " + byteValueFromWrapper);
        System.out.println("byteValue equals: " + byteValue);


        String name = "Andrii";

        int age = 39;
        System.out.println("Name: " + name +", Age: "+ age);


    }
}