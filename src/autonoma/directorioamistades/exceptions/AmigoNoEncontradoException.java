/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.directorioamistades.exceptions;

/**
 * Interfaz grafica Ventana Buscar
 * @author Johan Villada
 * @since 20250324
 * @version 1.0.0
 */
public class AmigoNoEncontradoException extends RuntimeException{
    public AmigoNoEncontradoException(){
        super(" El amigo no se encontro :(");
    }
}
