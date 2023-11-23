/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import observer.ObservadorConcreto;
import observer.SujetoConcreto;

/**
 *
 * @author casa
 */
public class InicioVista {

    public static void main(String[] args) {
        SujetoConcreto sc = new SujetoConcreto();
        ObservadorConcreto observadorConcreto1 = new ObservadorConcreto("Pepe");
        ObservadorConcreto observadorConcreto2 = new ObservadorConcreto("Juan");
        ObservadorConcreto observadorConcreto3 = new ObservadorConcreto("Pepito");
        ObservadorConcreto observadorConcreto4 = new ObservadorConcreto("Maria");
        ObservadorConcreto observadorConcreto5 = new ObservadorConcreto("Karen");
        sc.suscribirObservador(observadorConcreto1);
        sc.suscribirObservador(observadorConcreto2);
        sc.suscribirObservador(observadorConcreto3);
        sc.suscribirObservador(observadorConcreto4);
        sc.suscribirObservador(observadorConcreto5);
    }
}
