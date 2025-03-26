/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.exceptions;

/**
 *
 * @author Kamii
 */
public class CorreoInvalidoException extends RuntimeException{
    public CorreoInvalidoException(){
        super("El correo es invalido, asegurate que contenga arroba (@) ;)");
    }
}
