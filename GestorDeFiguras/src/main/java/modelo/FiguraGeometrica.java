/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
// clase abstracta que define el contrato de cualquier figura
public abstract class FiguraGeometrica implements IOperable {
    // nombre de la figura para identificarla
    protected String nombre;

    // constructor de la clase base
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // getter del nombre
    public String getNombre() { return nombre; }

    // metodo abstracto que cada subclase debe implementar
    @Override
    public abstract double calcularArea();

    // metodo abstracto que cada subclase debe implementar
    @Override
    public abstract void mover(double deltaX, double deltaY);

    // metodo abstracto para escalar la figura
    @Override
    public abstract void escalar(double factor);

    // metodo abstracto para saber si un punto esta dentro de la figura
    @Override
    public abstract boolean contienePunto(double x, double y);
}