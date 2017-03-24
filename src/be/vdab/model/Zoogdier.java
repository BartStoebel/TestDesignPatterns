/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Vinnie
 */
public class Zoogdier extends Inwoner {

    public Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void update(Observable o, Object arg) {
        reageerOpUitbarsting();
    }
    
    public void reageerOpUitbarsting(){
        System.out.println(this.getNaam() + " schuilt in zijn hol door een "
                + "vulkaanuitbarsting.");
    }
    
}
