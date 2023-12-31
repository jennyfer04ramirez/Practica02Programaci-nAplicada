/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 *
 * @author casa
 */
public interface ISujeto {
    public void suscribirObservador(IObserver observador);
    public void notificarObservador(String mensaje);
    public void desuscribirObservador(IObserver observador);
}
