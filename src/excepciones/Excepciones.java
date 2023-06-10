/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author KELVIN VR
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MiExcepcionGenerica {
     try{ 
         String valorNumerico = "46";
     int numero = Utilitario.convertir(valorNumerico);
     System.out.print("el Numero es: "+numero);
     }catch (MiExcepcionNumerica e){
         System.err.print(e.getMessage());
     }catch(MiExcepcionGenerica e){
         System.err.print(e.getMessage());
     }     

    }

}
