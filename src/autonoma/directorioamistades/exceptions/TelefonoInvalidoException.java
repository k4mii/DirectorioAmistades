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
        super("Ingrese un numero valido, que no contenga mas de 10 digitos y debe de iniciar por  por los dígitos (606 o 30) :)");
    }
    
}
