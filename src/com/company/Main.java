package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bool =  false;
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (word!=null) {
            System.out.println(print(word));
            bool = true;
        }  
        Status status = new Status();
        status.CheckStatus(bool);

    }
    private static  String print(String word){
        return word;
    }
}

class Status{
    String success ="Success";
    String fail = "Unsuccessful";

    public String CheckStatus(boolean bool){
        if(bool){
            return success;
        }
        return fail;
        }

    }

