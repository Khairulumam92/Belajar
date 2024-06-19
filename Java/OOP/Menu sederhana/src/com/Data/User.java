package com.Data;
import java.util.Scanner;

public class User {

    Scanner scan = Scanner(System.in);
    
    public void userName(){
        System.out.println("===ID harus 15 baris===");
        System.out.print("Masukkan id anda : ");
        String idUser = scan.nextLine();
        System.out.println("id anda" +idUser);

        // if(idUser == 15){   
        //     System.out.println("Anda berhasil login");
        // } else {
        //     System.out.println("Masukkan Id dengan benar");
        // }
    }
}
