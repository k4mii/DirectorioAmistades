/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.exceptions;

/**
 *
 * @author Kamii
 */
public class AmigoduplicadoException extends RuntimeException{
    public AmigoduplicadoException(){
        super("El correo ya se encuentra. Amigo duplicado");
    }
}
