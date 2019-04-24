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
public class Estrella extends Cuerpoceleste {

    // Atributos
   /* String nombre;
    double diametro, superficie, volumen, masa;
    int densidad, temperatura, gravedad;*/
    String galaxia;

    //contructores
    public Estrella(String nombre, double diametro, double superficie, double volumen, double masa, double densidad, double temperatura, double gravedad, String galaxia) {
        super(nombre,diametro,superficie,volumen,masa,densidad,temperatura,gravedad);
        this.galaxia = galaxia;
    }

    // conversion a string
    @Override
    public String toString() {
        String s = "";
        s += "la estrella " + nombre + " pertenece a la galaxia " + galaxia + ".\n";
        s += "Sus caracteristicas son : \n";
        s += "- Diametro de " + diametro + " km\n";
        s += "- Superficie de " + superficie + " km^2\n";
        s += "- Volumen de " + volumen + " km^3\n";
        s += "- Masa de " + masa + " kg\n";
        s += "- Densidad de " + densidad + " kg/m^3\n";
        s += "- Temperatura de " + temperatura + " C°\n";
        s += "- Gravedad de " + gravedad + " m/s^2\n\n";
        
        return s;
    }
}
