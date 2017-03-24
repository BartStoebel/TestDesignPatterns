/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.utils;

/**
 *
 * @author Vinnie
 */
public class Wacht implements Runnable{

    @Override
    public void run() {
        System.out.print("\nWacht even");
        try{
            Thread.sleep(250);
            
            System.out.print(" .");
            Thread.sleep(500);
            System.out.print(" .");
            Thread.sleep(750);
            System.out.print(" .\n\n");
        }catch (InterruptedException e){
            System.err.println("WachtBoe");
        }
    }
    
}
