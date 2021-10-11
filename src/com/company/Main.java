package com.company;

class MyException1 extends Exception{
    String str1;

    MyException1(String str2) {
        str1 = str2;
    }
    public String toString(){
        return ("MyException Occurred: "+ str1) ;
    }
}

//class Example1{

public class Main {
    public static void main(String args[]){
        try{
            System.out.println("Starting of try block");
            throw new MyException1("This is error Message");
        }
        catch(Exception exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }
        /*catch(MyException1 exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }*/
    }
}