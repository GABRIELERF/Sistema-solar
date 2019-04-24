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
public class Cuerpoceleste {
    // Atributos
    String nombre;
    double diametro, superficie, volumen, masa;
    double densidad, temperatura, gravedad;
    
    //Constructor

    public Cuerpoceleste(String nombre, double diametro, double superficie, double volumen, double masa, double densidad, double temperatura, double gravedad) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.superficie = superficie;
        this.volumen = volumen;
        this.masa = masa;
        this.densidad = densidad;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

    
}
