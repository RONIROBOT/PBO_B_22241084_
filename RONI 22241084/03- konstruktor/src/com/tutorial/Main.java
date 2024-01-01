package com.tutorial;

class polos{
    string datastring;
    int datainteger;
}
public class Main {

    public static void main(String[] args) {
        //instansi objek
        polos pls =new polos();
        
        //memberikan nilai pada objek pls
        pls.datastring ="polos";
        pls.datainteger ="110";

        System.out.println("datastring :" + pls.
        datastring);
        System.out.println("datainteger :" +pls.
        datainteger);
    }
}