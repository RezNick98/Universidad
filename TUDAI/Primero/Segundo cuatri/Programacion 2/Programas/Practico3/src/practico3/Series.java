/*
4 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementar en Java.
● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
● Obtener el total episodios vistos de una temporada particular.
● Obtener el total de episodios vistos de una serie.
● Obtener el promedio de las calificaciones dadas para una temporada particular.
● Obtener el promedio de las calificaciones dadas para una serie.
● Determinar si se vio todos los episodios de la serie.
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos
 */
package practico3;

import java.util.ArrayList;

public class Series {
    private String titulo;
    private ArrayList <Integer> temporada;
    private int calificacion;
    private  ArrayList<Integer> episodio;
    private String creador;
    private String genero;
    private String descripcion;
    public Series(String titulo,ArrayList episodio,ArrayList temporada, String creador, String genero,String descripcion,
            int calificacion){
        this.titulo=titulo;
        this.calificacion=calificacion;
        this.creador=creador;
        this.descripcion=descripcion;
        episodio= new ArrayList();
        this.genero=genero;
        temporada= new ArrayList();
    }
    int ObtenerCalificacion(int calificacion){
        if ((calificacion<5) && (calificacion>0)){
            this.calificacion=calificacion;
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
        return calificacion;
    }

    
    
    
    
    
    
    
    
    
    String getTitulo(){
        return titulo;
    }
    ArrayList<Integer> getTemporada(){
        return temporada;
    }
    String getCreador(){
        return creador;
    }
    String getDescripcio(){
        return descripcion;
    }
    ArrayList<Integer> getEpisodios(){
        return episodio;
    }
    String getGenero(){
        return genero;
    }
    void setTitulo(String titulo){
        this.titulo=titulo;
    }
    void setTemporadas(int temporada){
        this.temporada.add(temporada);
    }
    void setCreador(String creador){
        this.creador=creador;
    }
    void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    void setCalificacion(int calificacion){
        this.calificacion=calificacion;
    }
    void setEpisodio(int episodio){
       this.episodio.add(episodio);
    }
    void setGenero(String genero){
        this.genero=genero;
    }
}
