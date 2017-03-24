/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.main;

import be.vdab.model.EilandController;
import be.vdab.utils.Wacht;

/**
 *
 * @author Vinnie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EilandController eilandController = new EilandController();
        Thread eilandThread = new Thread(eilandController);
        Thread wachtThread = new Thread(new Wacht());
        eilandThread.start();
        
        try{
            eilandThread.join();
            wachtThread.start();
            wachtThread.join();           
        }catch(InterruptedException e){
            System.err.println("Boe");
        }
        eilandThread = new Thread(eilandController);
        eilandThread.start();
        
//        try{
//            
//            System.err.println("Hello");
//            //
//            
//            
//        }catch(InterruptedException e){
//            System.err.println("Boe2");
//        }

        
        
        
    }
    
}
