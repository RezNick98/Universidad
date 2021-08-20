/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

public class AlarmaLuminosa extends Alarma {
    private Luz luz1;

    public AlarmaLuminosa(Luz luz1,Timbre timbre) {
        super(timbre);
        this.luz1=luz1;
    }
    public void verificarAlarma(){
        super.comprobar();
        if(super.timbre.setTimbre()){
            luz1.encederLuz();
            
        }
    }

        
    }
    
