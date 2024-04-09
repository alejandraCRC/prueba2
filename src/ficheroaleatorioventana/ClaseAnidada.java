/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroaleatorioventana;

/**
 *
 * @author Usuario
 */
public class ClaseAnidada {
    
    private final VentanaDepart outer;

    public ClaseAnidada(final VentanaDepart outer) {
        this.outer = outer;
    }

    public void entrada() {
        System.out.println("Método entrada.");
    }

    public String salida(int d) {
        System.out.println("Salida.");
        System.out.println("Estoy trabajando");
        
        System.out.println("Sigo añadiendo lineas");
        
        System.out.println("This is new advances on the new release");
        return "Salida el " + d;
    }
    
}
