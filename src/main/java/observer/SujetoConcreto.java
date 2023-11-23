/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casa
 */
public class SujetoConcreto implements ISujeto {

    private List<IObserver> listaObservadores = new ArrayList<>();
            
    @Override
    public void suscribirObservador(IObserver observador) {
        listaObservadores.add(observador);
    }

    @Override
    public void notificarObservador(String mensaje) {
        for (IObserver observador : listaObservadores) {
            observador.actualizar(mensaje);
        }
    }
    
}
