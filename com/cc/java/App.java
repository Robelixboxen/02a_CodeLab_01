package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto(10000);
            System.out.println("Konto1 = " + konto1.getKontostand() + " €");
        
        Konto konto2 = new Konto(10000);
            System.out.println("Konto2 = " + konto2.getKontostand() + " €");

        Konto konto3 = new Konto(10000);
            System.out.println("Konto3 = " + konto3.getKontostand() + " €");  
        
        System.out.println("-----------------------------");

        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        System.out.println("Konto1 = " + konto1.getKontostand() + " €");
        System.out.println("Konto2 = " + konto2.getKontostand() + " €");
        System.out.println("Konto3 = " + konto3.getKontostand() + " €");
    }
}

