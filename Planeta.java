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

public class Planeta extends Cuerpoceleste {

    //Atributos
    double periodoOrbital, Velocidadorbital, radioOrbital, periodorotacional;
    String composicionatmosfera;
    Satelite [] satelites;
    public Planeta(String nombre, double diametro, double superficie, double volumen, double masa, double densidad, double temperatura, double gravedad, double periodoOrbital, double Velocidadorbital, double radioOrbital, double periodorotacional, String composicionatmosfera) {
        super(nombre, diametro, superficie, volumen, masa, densidad, temperatura, gravedad);
        this.periodoOrbital = periodoOrbital;
        this.Velocidadorbital = Velocidadorbital;
        this.radioOrbital = radioOrbital;
        this.periodorotacional = periodorotacional;
        this.composicionatmosfera = composicionatmosfera;
        this.satelites= new Satelite[0];
    }

    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }
    public void setSatelites(Satelite satelite){
        Satelite[] auxiliar= new Satelite[this.satelites.length + 1];
        for (int i=0; i< this.satelites.length; i ++){
            auxiliar[i]= satelites [1] ;
        }
        auxiliar[auxiliar.length -1]= satelite;
        this.satelites= auxiliar;
    }
    
    @Override
    public String toString() {
        String s = "";
        s += "\n El planeta " + this.nombre + " tiene las caracteristicas :\n";
        s += "-Diametro: " + this.diametro + " Km\n";
        s += "-Superficie: " + this.superficie + " Km^2\n";
        s += "-Volumen: " + this.volumen + " Km^3\n";
        s += "-Masa: " + this.masa + " Kg\n";
        s += "-Densidad: " + this.densidad + " g/cm3\n";
        s += "-Temperatura: " + this.temperatura + " C°\n";
        s += "-Gravedad: " + this.gravedad + " m/s^2\n";
        s += "-Periodo Orbital: " + this.periodoOrbital + " Dias\n";
        s += "-Velocidad Orbital: " + this.Velocidadorbital + " Km/h\n";
        s += "-Radio  Orbital: " + this.radioOrbital + " Km\n";
        s += "-Periodio Rotacional: " + this.periodorotacional + " Dias\n";
        s += "-Composicion Atmosferica: "+this.composicionatmosfera+"\n\n ";    
        return s;
    }

}
