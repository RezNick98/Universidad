/*
Crear una clase Electrodoméstico con las siguientes características:
Atributos son nombre, precio base, color, consumo energético y peso.
Valores por defecto:
● El color por defecto es gris plata.
● El consumo energético 10 Kw.
● Precio base 100 pesos.
● El peso es 2 kg.
Implementar todos los constructores.
La funcionalidad de la clase es la siguiente:
● Todos los métodos get y set.
● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
● Indicar si un producto es de alta gama, el balance es mayor que 3
 */
package practico3;

public class Electrodomestico {
    private String color;
    private int consumo;
    private int pesokg;
    private int precio;
    private int balance;
    private String electrodomestico;
    public Electrodomestico(){
        color="Gris plateado";
        consumo=10;
        pesokg=2;
        precio=100;
    }
    public Electrodomestico(String electrodomestico){
        this.electrodomestico=electrodomestico;
        color="Gris";
        consumo=10;
        pesokg=2;
        precio=100;
    }
    public Electrodomestico(String electrodomestico,String color){
        this.electrodomestico=electrodomestico;
        this.color=color;
        consumo=10;
        pesokg=2;
        precio=100;
    }
    public Electrodomestico(String electrodomestico,String color,int consumo){
        this.electrodomestico=electrodomestico;
        this.color=color;
        this.consumo=consumo;
        pesokg=2;
        precio=100;
    }
    public Electrodomestico(String electrodomestico,String color,int consumo,
            int pesokg){
        this.electrodomestico=electrodomestico;
        this.color=color;
        this.consumo=consumo;
        this.pesokg=pesokg;
        precio=100;
    }
    public Electrodomestico(String electrodomestico,String color,int consumo,
    int pesokg,int precio){
        this.electrodomestico=electrodomestico;
        this.color=color;
        this.consumo=consumo;
        this.pesokg=pesokg;
        this.precio=precio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getPesokg(){
        return pesokg;
    }
    public void setPesokg(int pesokg){
        this.pesokg=pesokg;
    }
    public int getConsumo(){
        return consumo;
    }
    public void setConsumo(int consumo){
        this.consumo=consumo;
    }
    public int Balance(){
        return (precio/pesokg);
    }
    public void Balance(int Balance){
        this.balance=Balance();
    }
    public boolean DeBajoConsumo(){
        if((consumo<45)){
            return true;
        }else{
            return false;
        }
    }
    public boolean DeAltagamma(){
        if(balance>=3){
            return true;
        }else{
            return false;
        }
    }
        public static void main(String[] args){
            Electrodomestico microondas=new Electrodomestico();
            Electrodomestico microondas2=new Electrodomestico("microondas");
            microondas.color="Rojo";
            microondas2.color="Azul";
            microondas.getColor();
            String color1=microondas2.getColor();
            System.out.println("El color del microondas es "+color1);
        }
}
