/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author casa
 */
public class ObservadorConcreto implements IObserver {

    private String nombre;

    public ObservadorConcreto() {
    }

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " ha recibido el mensaje " + mensaje);
    }
    
}
