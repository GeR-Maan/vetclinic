package com.clinic;

public class Main extends Options {

    public static void main(String[] args){

       int code = Authentication.authenticate();
       if (code==0){
           System.out.println("Login success");
       } else {
           System.out.println("Login failed");
           return;                              //Выход из программы, если будет превышение кол-ва попыток
       }

       Options options = new Options();



    }
}
