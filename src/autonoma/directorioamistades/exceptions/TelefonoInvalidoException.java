/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.exceptions;

/**
 *
 * @author Kamii
 */
public class TelefonoInvalidoException extends RuntimeException{
    public TelefonoInvalidoException(){
        super("El telefono es invalido debe de iniciar por  por los dígitos (606 o 30)");
    }
    
}
