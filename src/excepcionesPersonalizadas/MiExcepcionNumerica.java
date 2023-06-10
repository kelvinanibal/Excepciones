/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author KELVIN VR
 */
public class MiExcepcionNumerica extends Exception{
    static final String MENSAJE = ""
           + "Error de conversion numerica"
           +"ingresa un texto que contenga un numero";
    public MiExcepcionNumerica(String message) {
        super(message);
    }

    public MiExcepcionNumerica() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
