/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
// interfaz que define las operaciones comunes de las figuras
public interface IOperable {
    double calcularArea();
    void mover(double deltaX, double deltaY);
    void escalar(double factor);
    boolean contienePunto(double x, double y);
}
