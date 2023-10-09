package com.codegym.variables;

public class Variable {
    public static void main(String[] args) {
        String fullName = "Nguyen Van Teo";
        System.out.print(fullName);//print: output value inline
        System.out.print(fullName);

        System.out.println(fullName);//print: output value inline, break new line
        System.out.println(fullName);

        int myAge = 18;
        //printf: output string with variable value in string
        //variable with defined type
        System.out.printf("My age is: %d",myAge);
        System.out.printf("My age is: %s\n",fullName);
    }
}
