package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto(10000);
            System.out.println(konto1.getKontostand());
                kontostand.setKontostand(setKontostand()*2);
        
        Konto konto2 = new Konto(10000);
            System.out.println(konto2.getKontostand());
                kontostand.setKontostand(setKontostand()*3);

        Konto konto3 = new Konto(10000);
            System.out.println(konto3.getKontostand());
               kontostand.setKontostand(setKontostand()*10);   
        
        System.out.println("-----------------------------");
        System.out.println(konto1.getKontostand());
        System.out.println(konto2.getKontostand());
        System.out.println(konto3.getKontostand());
    }
}

