/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.model;

import be.vdab.repository.InwonerData;
import java.io.File;

/**
 *
 * @author Vinnie
 */
public class EilandController implements Runnable{
        private Eiland eiland;
        private InwonerData inwonerData;
        private final String dataFile = "C:\\Users\\Vinnie\\Documents\\NetBeansProjects\\"
                + "TestDesignPatterns\\Eilandbewoners.txt";
        
    public EilandController(){
        File file = new File (dataFile);
        inwonerData = new InwonerData(file);
        eiland = new Eiland(inwonerData.getInwonersUitBestand());
        for (Inwoner inwoner : eiland.getInwonerLijst()){
            if(inwoner instanceof Vogel || inwoner instanceof Zoogdier){
                eiland.addObserver(inwoner);
                System.out.println(inwoner.getNaam());
            }
        }
        
    }

    @Override
    public void run() {
        eiland.vulkaanBarstUit();
    }
}
