/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
// clase rectangulo que hereda de FiguraGeometrica y usa dos puntos (composicion)
public class Rectangulo extends FiguraGeometrica {
    // vertices opuestos del rectangulo (composicion)
    private Punto punto1;
    private Punto punto2;

    // constructor que recibe los dos puntos opuestos
    public Rectangulo(Punto punto1, Punto punto2) {
        super("Rectangulo");
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    // constructor sobrecargado que recibe las cuatro coordenadas
    public Rectangulo(double x1, double y1, double x2, double y2) {
        super("Rectangulo");
        this.punto1 = new Punto(x1, y1);
        this.punto2 = new Punto(x2, y2);
    }

    // getters
    public Punto getPunto1() { return punto1; }
    public Punto getPunto2() { return punto2; }

    // calcula la base como la diferencia absoluta de las x
    public double calcularBase() {
        return Math.abs(punto2.getX() - punto1.getX());
    }

    // calcula la altura como la diferencia absoluta de las y
    public double calcularAltura() {
        return Math.abs(punto2.getY() - punto1.getY());
    }

    // sobrescribe el metodo abstracto calcularArea (base x altura)
    @Override
    public double calcularArea() {
        return calcularBase() * calcularAltura();
    }

    // sobrescribe el metodo mover desplazando los dos puntos
    @Override
    public void mover(double deltaX, double deltaY) {
        punto1.mover(deltaX, deltaY);
        punto2.mover(deltaX, deltaY);
    }

    // sobrescribe el metodo escalar aumentando o reduciendo dimensiones
    @Override
    public void escalar(double factor) {
        // valida que el factor sea positivo
        if (factor <= 0) {
            throw new ArithmeticException("El factor de escalado debe ser mayor que cero.");
        }
        // calcula el centro del rectangulo
        double centroX = (punto1.getX() + punto2.getX()) / 2.0;
        double centroY = (punto1.getY() + punto2.getY()) / 2.0;
        // recalcula los puntos desde el centro aplicando el factor
        punto1.setX(centroX + (punto1.getX() - centroX) * factor);
        punto1.setY(centroY + (punto1.getY() - centroY) * factor);
        punto2.setX(centroX + (punto2.getX() - centroX) * factor);
        punto2.setY(centroY + (punto2.getY() - centroY) * factor);
    }

    // sobrescribe el metodo que valida si un punto esta dentro del rectangulo
    @Override
    public boolean contienePunto(double x, double y) {
        // obtiene los limites en x y en y sin importar el orden de los vertices
        double minX = Math.min(punto1.getX(), punto2.getX());
        double maxX = Math.max(punto1.getX(), punto2.getX());
        double minY = Math.min(punto1.getY(), punto2.getY());
        double maxY = Math.max(punto1.getY(), punto2.getY());

        // estructura condicional anidada: verifica primero x y luego y
        if (x >= minX && x <= maxX) {
            if (y >= minY && y <= maxY) {
                // el punto esta dentro del rectangulo
                return true;
            } else {
                // la y esta fuera del rango
                return false;
            }
        } else {
            // la x esta fuera del rango
            return false;
        }
    }

    // devuelve los datos del rectangulo como texto
    @Override
    public String toString() {
        return String.format("Rectangulo[%s, %s] Base: %.2f | Altura: %.2f | Area: %.2f",
                punto1.toString(), punto2.toString(),
                calcularBase(), calcularAltura(), calcularArea());
    }
}