/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colasinlibreria;

/**
 *
 * @author ESTUDIANTES
 */
public class Colasinlibreria {

   public static void main(String[] args) {
   System.out.println("Hola brow, ejercicio de cola sin libreria");
       simple();
       circular();
       prioridad();
       doble();
    }
    static void simple (){
    System.out.println("1. Cola simple: primero en llegar primero en salir");
        encolarsimple("ana");
        encolarsimple("luis");
        encolarsimple("marta");
    }
    static void circular (){
    
    }
    static void prioridad (){
    
    }
    static void doble (){
    
    }
    //operaciones propias: arreglo, indice y ciclos: sin clases ni librerias
    private static final String[] datossimple = new String[5];
    private static int cantidadsimple=0;
    
    static void encolarsimple(String nombre){
    
    if (cantidadsimple == datossimple.length)throw new IllegalStateException("cola llena");
    datossimple[cantidadsimple++]=nombre;
    }
    static String desencolarsimple(String nombre){
    if(cantidadsimple ==0)return null;
    
    String primero = datossimple[0];
    for (int i =0; i<cantidadsimple -1; i++)
        datossimple[i]=datossimple[i + 1];
    
    datossimple[--cantidadsimple]=null;
    return primero;
    
    }
    static void agregariniciosimple(String nombre){
    if (cantidadsimple == datossimple.length)throw new IllegalStateException("cola llena");
        
        for (int i =0; i<cantidadsimple -1; i++)
        datossimple[i]=datossimple[i + 1];
         
        datossimple[0]=nombre;
        cantidadsimple++;
         
    }
    static String retirarfinalsimple(){
    if (cantidadsimple==0)return null;
    String ultimo = datossimple [--cantidadsimple];
    datossimple [cantidadsimple]=null;
    return ultimo;
    
    }
    
    private static final String[] datoscircular = new String[3];
    private static int frentecircular=0;
    private static int fincircular=0;
    private static int cantidadcircular=0;
    
    static void encolarcircular(String nombre){
    if (cantidadcircular== datoscircular.length)throw new IllegalStateException("cola llena");
        
        datoscircular[fincircular]=nombre;
        fincircular=(fincircular +1)% datoscircular.length;
        cantidadcircular++;
        
    }
    static String desencolar(){
        if(cantidadcircular==0)return null;
        String primero = datoscircular[frentecircular];
        datoscircular[frentecircular]=null;
        frentecircular=(frentecircular+1)% datoscircular.length;
        cantidadcircular--;
        return primero;
        
        }
    private static final Integer[]datosprioridad =new Integer[5];
    
    private static int cantidadprioridad=0;
     static void encolarprioridad(int prioridad){
    if (cantidadprioridad == datosprioridad.length)throw new IllegalStateException("cola llena");
        datosprioridad[cantidadprioridad++]=prioridad;
    
     }
     static Integer desencolarprioridad(){
     if (cantidadprioridad==0)return null;
     int mejor=0;
     
     for(int i =1; i<cantidadprioridad; i++){
     if(datosprioridad[i]<datosprioridad[mejor])mejor = i;
     
     }
     Integer resultado = datosprioridad[mejor];
     for(int i= mejor; i<cantidadprioridad -1; i++)datosprioridad[i]=datosprioridad[i+1];
           datosprioridad[--cantidadprioridad]=null;
           return resultado;
     
     
    }
}
