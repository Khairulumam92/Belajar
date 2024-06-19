package com.main.Data;
import java.util.Scanner;
public class User {
    Scanner input = new Scanner(System.in);

    //property
    public String username;
    public String password;

    //method
    public void getUsername(){
        System.out.print("Username : ");
        String getUsername = input.nextLine();
    }

    public void getPassword(){
        System.out.print("Password : ");
        String getPassword = input.nextLine();
    }

}
