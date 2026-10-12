/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author emanu
 */
import modelo.Punto;
import modelo.Rectangulo;

// controlador que conecta la vista con el modelo
public class ControladorRectangulo {
    // referencia al rectangulo (modelo)
    private Rectangulo rectangulo;

    // crea un rectangulo a partir de las cuatro coordenadas
    public boolean crearRectangulo(double x1, double y1, double x2, double y2) {
        // valida que los puntos no sean iguales (area cero)
        if (x1 == x2 || y1 == y2) {
            return false;
        }
        // instancia el objeto del modelo
        this.rectangulo = new Rectangulo(x1, y1, x2, y2);
        return true;
    }

    // verifica si ya existe un rectangulo creado
    public boolean hayRectangulo() {
        return rectangulo != null;
    }

    // invoca el metodo de negocio calcularArea del modelo
    public double obtenerArea() {
        if (rectangulo == null) {
            throw new ArithmeticException("Primero debe crear el rectangulo.");
        }
        return rectangulo.calcularArea();
    }

    // invoca el metodo de negocio mover del modelo
    public boolean moverRectangulo(double deltaX, double deltaY) {
        if (rectangulo == null) {
            return false;
        }
        rectangulo.mover(deltaX, deltaY);
        return true;
    }

    // invoca el metodo de negocio escalar del modelo
    public boolean escalarRectangulo(double factor) {
        if (rectangulo == null) {
            return false;
        }
        rectangulo.escalar(factor);
        return true;
    }

    // invoca el metodo de negocio contienePunto del modelo
    public boolean validarPuntoDentro(double x, double y) {
        if (rectangulo == null) {
            return false;
        }
        return rectangulo.contienePunto(x, y);
    }

    // devuelve la base calculada por el modelo
    public double obtenerBase() {
        if (rectangulo == null) {
            throw new ArithmeticException("Primero debe crear el rectangulo.");
        }
        return rectangulo.calcularBase();
    }

    // devuelve la altura calculada por el modelo
    public double obtenerAltura() {
        if (rectangulo == null) {
            throw new ArithmeticException("Primero debe crear el rectangulo.");
        }
        return rectangulo.calcularAltura();
    }

    // devuelve el toString del rectangulo (modelo)
    public String obtenerDatos() {
        if (rectangulo == null) {
            return "No hay rectangulo creado.";
        }
        return rectangulo.toString();
    }
}