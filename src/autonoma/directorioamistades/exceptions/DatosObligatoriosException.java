/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.exceptions;

/**
 *
 * @author Kamii
 */
public class DatosObligatoriosException extends RuntimeException{
    public DatosObligatoriosException(){
        super("Todos los datos son obligatorios."); 
    }
}
