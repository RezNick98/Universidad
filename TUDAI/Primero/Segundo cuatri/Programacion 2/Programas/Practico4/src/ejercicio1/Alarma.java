/*

 */
package ejercicio1;

/**
 *
 * @author ezequiel
 */
public class Alarma {
    private boolean ventanarota;
    private boolean ventanaabierta;
    private boolean puertaabierta;
    private boolean movimiento;
    protected Timbre timbre;

    
    public Alarma(Timbre timbre){
        ventanarota=false;
            puertaabierta=false;
            ventanaabierta=false;
            movimiento=false;
            timbre.hacerSonar();
    }
    
    void comprobar(){
        if( ventanarota || puertaabierta || ventanaabierta || movimiento){
            timbre.hacerSonar();
        }
    }
    
    
    
    
     boolean isVentanarota() {
        return ventanarota;
    }

     void setVentanarota(boolean ventanarota) {
        this.ventanarota = ventanarota;
    }

     boolean isVentanaabierta() {
        return ventanaabierta;
    }

     void setVentanaabierta(boolean ventanaabierta) {
        this.ventanaabierta = ventanaabierta;
    }

     boolean isPuertaabierta() {
        return puertaabierta;
    }


     void setPuertaabierta(boolean puertaabierta) {
        this.puertaabierta = puertaabierta;
    }

    /**
     * @return the movimiento
     */
    public boolean isMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
    
    
    
    
}
