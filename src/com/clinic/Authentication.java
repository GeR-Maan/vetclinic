package com.clinic;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN = "german";
    private static final String PASSWORD = "1234";

    public  static int authenticate(){
        Scanner in = new Scanner(System.in);

        boolean isLoginSuccess = false;
        for (int MaxAttempt = 3; MaxAttempt>0 && !isLoginSuccess; MaxAttempt--){
            System.out.println("Login: ");
            var login = in.nextLine();

            System.out.println("Password: ");
            var password = in.nextLine();

            if (login.equals(LOGIN) && password.equals(PASSWORD)){
                isLoginSuccess = true;
            }

        }

        return  isLoginSuccess ? 0 : -1;

    }

}
