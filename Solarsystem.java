/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;

/**
 *
 * @author Gabriel
 */
public class Solarsystem {

    public static Estrella sol;
    public static Planeta mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno;

    public static void main(String[] args) throws IOException {
        //Menu
        Imprimirmenu();
        crearsistemasolar();
        System.out.println(" Introduce una opcion del sistema solar: ");
        String salir = "s";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = br.readLine();
        while (!opcion.equals(salir)) {
            switch (opcion) {
                //-Informacion general del sistema solar = a
                case "a":
                    Versistemasolar();
                    break;
                //Sol = b
                case "b":
                    System.out.println(sol.toString());
                    break;
                //planetas = c
                case "c":
                    Verplanetas();
                    break;
                //satelites = d
                case "d":
                    Versatelites();
                    break;
                //-cuerpos celestes (asteroides, cometas, meteoroides)= e
                case "e":
                    InformacionCceleste();
                    break;
                //Ver menu = g
                case "f":
                    Imprimirmenu();
                    break;
                default:
                    System.out.println("La opción introducida no es una opción válida.");
                    break;
            }
            System.out.print("Introduce una opción del menu sistema solar: ");
            opcion = br.readLine();
        }

        System.out.println("La ejecución ha finalizado.");
    }

    public static void InformacionCceleste() {
        System.out.println("Un asteroide es un cuerpo rocoso, más pequeño que un planeta y mayor que un meteoroide.\n"
                + "La mayoría orbita entre Marte y Júpiter, en la región del sistema solar conocida como cinturón\n "
                + "de asteroides; otros se acumulan en los puntos de Lagrange de Júpiter, y la mayor parte del resto\n"
                + "cruza las órbitas de los planetas.\n\n");
        System.out.println("Los cometas son los cuerpos celestes constituidos por hielo, polvo y rocas que orbitan alrededor\n"
                + "del Sol siguiendo diferentes trayectorias elípticas, parabólicas o hiperbólicas. Los cometas, junto con los\n"
                + "asteroides, planetas y satélites, forman parte del sistema solar\n\n");
        System.out.println("Un meteoroide es un cuerpo menor del sistema solar de, aproximadamente, entre 100 µm hasta 50 m\n"
                + "(de diámetro máximo). El límite superior de tamaño, 50 m, se emplea para diferenciarlo de los cometas y de"
                + "\nlos asteroides, mientras que el límite inferior de tamaño, 100 µm,"
                + "se emplea para diferenciarlo del polvo cósmico;\n"
                + "no obstante, los límites de tamaño no muy estrictamente siendo ambigua la designación de los\n"
                + "objetos que se encuentren cercanos a estos límites.\n\n");
    }

    public static void Verplanetas() throws IOException {
        Imprimirmenuplanetas();
        System.out.print("Introduce una opción del menu planetas: ");
        String salir = "s";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = br.readLine();
        while (!opcion.equals(salir)) {
            switch (opcion) {
                //-Mercurio
                case "a":
                    System.out.println(mercurio.toString());
                    break;
                //Sol = b
                case "b":
                    System.out.println(venus.toString());
                    break;
                //planetas = c
                case "c":
                    System.out.println(tierra.toString());
                    break;
                //satelites = d
                case "d":
                    System.out.println(marte.toString());
                    break;
                //-cuerpos celestes (asteroides, cometas, meteoroides)= e
                case "e":
                    System.out.println(jupiter.toString());
                    break;
                //-ver informacion de planeta= f
                case "f":
                    System.out.println(saturno.toString());
                    break;
                //-composicion de estrella= g
                case "g":
                    System.out.println(urano.toString());
                    break;
                //Ver menu = i
                case "i":
                    System.out.println(neptuno.toString());
                    break;
                case "s":

                    break;
                default:
                    System.out.println("La opción introducida no es una opción válida.");
                    Verplanetas();
                    break;
            }
            System.out.print("Introduce una opción del menu planetas: ");
            opcion = br.readLine();
        }
    }

    public static void Versatelites() throws IOException {
        Imprimirmenusatelites();
        System.out.print("Introduce una opción del menu satelite: ");
        String salir = "s";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = br.readLine();
        while (!opcion.equals(salir)) {
            switch (opcion) {
                //-Satelite Mercurio
                case "a":
                    Imprimirsatelites(mercurio);
                    break;
                //Satelite Venus
                case "b":
                    Imprimirsatelites(venus);
                    break;
                //Satelite Tierra
                case "c":
                    Imprimirsatelites(tierra);
                    break;
                //Satelite Marte
                case "d":
                    Imprimirsatelites(marte);
                    break;
                //-Satelite Jupiter
                case "e":
                    Imprimirsatelites(jupiter);
                    break;
                //-Satelite Saturno
                case "f":
                    Imprimirsatelites(saturno);
                    break;
                //-Satelite Urano
                case "g":
                    Imprimirsatelites(urano);
                    break;
                //Satelite Neptuno
                case "i":
                    Imprimirsatelites(neptuno);
                    break;
                case "s":

                    break;
                default:
                    System.out.println("La opción introducida no es una opción válida.");
                    Verplanetas();
                    break;
            }
            System.out.print("Introduce una opción del menu satelite: ");
            opcion = br.readLine();
        }
    }

    public static void Imprimirmenu() {
        System.out.println("**** Menu sistema solar ***");
        System.out.println("Opcion a: -Informacion general del sistema solar");
        System.out.println("Opcion b: -Sol");
        System.out.println("Opcion c: -planetas");
        System.out.println("Opcion d: -satelites");
        System.out.println("Opcion e: -cuerpos celestes (asteroides, cometas, meteoroides)");
        System.out.println("Opcion f: -imprimir menu");
        System.out.println("Opcion s: -Salir");
    }

    public static void Imprimirmenuplanetas() {
        System.out.println("**** Menu planetas ***");
        System.out.println("Opcion a: -Mercurio");
        System.out.println("Opcion b: -Venus");
        System.out.println("Opcion c: -Tierra");
        System.out.println("Opcion d: -Marte");
        System.out.println("Opcion e: -Jupiter");
        System.out.println("Opcion f: -Saturno");
        System.out.println("Opcion g -Urano");
        System.out.println("Opcion h: -Neptuno");
        System.out.println("Opcion i: -Menu planetas");
        System.out.println("Opcion s: -Salir\n\n");
    }

    public static void Imprimirmenusatelites() {
        System.out.println("**** Menu Satelites ***");
        System.out.println("Opcion a: -Satelites de Mercurio");
        System.out.println("Opcion b: -Satelites de Venus");
        System.out.println("Opcion c: -Satelites de Tierra");
        System.out.println("Opcion d: -Satelites de Marte");
        System.out.println("Opcion e: -Satelites de Jupiter");
        System.out.println("Opcion f: -Satelites de Saturno");
        System.out.println("Opcion g -Satelites de Urano");
        System.out.println("Opcion h: -Satelites de Neptuno");
        System.out.println("Opcion i: -Menu satelites");
        System.out.println("Opcion s: -Salir\n\n");
    }

    public static void Versistemasolar() {
        System.out.println("\nEl sistema solar es el sistema planetario "
                + "en el que se encuentran la Tierra y otros objetos astronómicos "
                + "que giran directa o indirectamente en una órbita alrededor "
                + "de una \núnica estrella conocida como el Sol."
                + "\nEl Sol es el único cuerpo celeste del sistema solar que emite luz propia,"
                + "debido a la fusión termonuclear del hidrógeno y su transformación en helio en su núcleo."
                + "\n\nEl sistema solar se formó hace unos 4600 millones de años a partir del colapso de una nube molecular. "
                + "El material residual originó un disco circunestelar protoplanetario \nen el que ocurrieron los procesos físicos"
                + "que llevaron a la formación de los planetas.\nEl sistema solar se ubica en la actualidad en la nube "
                + "Interestelar Local que se halla en la Burbuja Local del brazo de Orión, de la galaxia espiral Vía Láctea,\n"
                + "a unos 28 000 años luz del centro de esta.");
    }

    public static void crearsistemasolar() {

        crearsol();
        Crearplanetas();
        Crearsatelites();
    }

    public static void crearsol() {

        double superficie = pow(10, 12);
        superficie = 60877 * superficie;
        double volumen = pow(10, 18);
        volumen = 14123 * volumen;

        double masa = pow(10, 30);
        masa = 19891 * masa;

        sol = new Estrella("Sol", 1392000, superficie, volumen, masa, 1411, 5505, 274, "Via lactea");

    }

    public static void Crearplanetas() {
        //Tierra
        double diametro = 12756;//km
        double superficie = 510072000;//km^2
        double volumen = 1.08321 * pow(10, 12); //km^3
        double masa = 5.9736 * pow(10, 24); //Kg
        double densidad = 5.515; //g/cm^3
        double gravedad = 9.8; //m/s^2
        double temperatura = 14.05; //C°
        double porbital = 365.256363004; //dias
        double vorbital = 107200;//km/h
        double rorbital = 149597870.691;//km
        double protacional = 1; //dias
        String composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        tierra = new Planeta("tierra", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Mercurio
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        mercurio = new Planeta("Mercurio", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Venus
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        venus = new Planeta("Venus", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Marte
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        marte = new Planeta("Marte", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Jupiter
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        jupiter = new Planeta("Jupiter", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Saturno
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        saturno = new Planeta("Saturno", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Urano
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        urano = new Planeta("Urano", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

        //Neptuno
        diametro = 12756;//km
        superficie = 510072000;//km^2
        volumen = 1.08321 * pow(10, 12);//km^3
        masa = 5.9736 * pow(10, 24);//Kg
        densidad = 5.43;//g/cm^3
        gravedad = 2.78;//m/s^2
        temperatura = 14.05;//C
        porbital = 365.256363004;//dias
        vorbital = 57894376;//km/h
        rorbital = 149597870.691;//km
        protacional = 1;//dias
        composicionatmosfera = "78 % nitrógeno, 21 % oxígeno, 1 % argón";

        neptuno = new Planeta("Neptuno", diametro, superficie, volumen, masa, densidad, temperatura, gravedad, porbital, vorbital, rorbital, protacional, composicionatmosfera);

    }

    public static void Crearsatelites() {
        //Mercurio y venus no tienen satelites

        //Satelite de la Tierra
        Satelite[] satelites = new Satelite[1];
        satelites[0] = new Satelite("Luna", 384400, 1.62);
        tierra.setSatelites(satelites[0]);

        //Satelite de Marte
        satelites = new Satelite[2];
        satelites[0] = new Satelite("Fobos", 9377, 0.0084);
        satelites[1] = new Satelite("Deimos", 9377, 0.0039);
        marte.setSatelites(satelites);

        //Satelite de Jupiter
        satelites = new Satelite[4];
        satelites[0] = new Satelite("Io", 421800, 1.81);
        satelites[1] = new Satelite("Gaminedes", 1070400, 1.42);
        satelites[2] = new Satelite("Calisto", 1882700, 1.235);
        satelites[3] = new Satelite("Europa", 671100, 1.314);
        jupiter.setSatelites(satelites);

        //Satelite de Saturno 
        satelites = new Satelite[1];
        satelites[0] = new Satelite("Titan", 1221850, 1.37);
        saturno.setSatelites(satelites);

        //Satelite de urano no tiene satelites importantes
        //Satelite de Neptuno
        satelites = new Satelite[1];
        satelites[0] = new Satelite("Triton", 354760, 0.78);
        neptuno.setSatelites(satelites);

    }

    public static void Imprimirsatelites(Planeta planeta) {
        if (planeta.satelites.length == 0) {
            System.out.println(planeta.nombre + " No tiene satelites");
        } else {
            System.out.println("El planeta " + planeta.nombre + " su/s satelites son:");
            for (int i = 0; i < planeta.satelites.length; i++) {
                System.err.println(planeta.satelites[i].toString());
            }
        }
    }

}
