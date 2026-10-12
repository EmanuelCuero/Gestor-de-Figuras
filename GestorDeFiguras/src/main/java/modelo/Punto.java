/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
// clase que representa un punto en el plano cartesiano
public class Punto {
    // coordenadas del punto
    private double x;
    private double y;

    // constructor del punto
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters y setters
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // mueve el punto sumando los desplazamientos
    public void mover(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    // muestra el punto en formato de texto
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
