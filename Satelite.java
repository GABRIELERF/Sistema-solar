/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

/**
 *
 * @author Gabriel
 */
class Satelite {
       //nombre
    String nombre;
    //distancia
    double distancia;
    //gravedad
    double gravedad;
    
    public Satelite (String nombre, double distancia, double gravedad){
        this.nombre=nombre;
        this.distancia=distancia;
        this.gravedad=gravedad;
        }
    @Override
    public String toString(){
        String s="";
        s +="El satelite "+nombre+" orbita en una distancia de "+distancia+" de su planeta\n"
                + "tiene una gravedad de "+gravedad+" m/s^2";
        return s;
    }
}

