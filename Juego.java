/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

/**
 *
 * @author AL-Alumno
 */
public class Juego {
    private String nombre;
    private int edadMinima;
    private int duracion;
    private double alturaMinima; 

    public Juego(String nombre, int edadMinima, int duracion, double alturaMinima) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
        this.alturaMinima = alturaMinima;
    }

    public void mostrarInfo() {
        System.out.println(" " + nombre + " ");
        System.out.println("Edad minima: " + edadMinima + " anos");
        System.out.println("Duracion: " + duracion + " minutos");
        System.out.println("Altura minima: " + alturaMinima + " m");
        System.out.println(" ");
    }

    public boolean puedeSubir(int edad) {
        return edad >= this.edadMinima;
    }

    public boolean puedeSubir(int edad, double altura) {
        return edad >= this.edadMinima && altura >= this.alturaMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public static void main(String[] args) {
        Juego juego1 = new Juego("Montana Rusa", 12, 3, 1.40);
        Juego juego2 = new Juego("Carrusel", 4, 5, 0.90);
        Juego juego3 = new Juego("Carros Chocones", 8, 4, 1.20);

        System.out.println("informacion de juegos");
        juego1.mostrarInfo();
        juego2.mostrarInfo();
        juego3.mostrarInfo();

        int edadNino = 10;
        System.out.println("validacion de la edad de nino " + edadNino + " anos");
        
        if (juego1.puedeSubir(edadNino)) {
            System.out.println("Acceso a " + juego1.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego1.getNombre() + ": No puede subir");
        }

        if (juego2.puedeSubir(edadNino)) {
            System.out.println("Acceso a " + juego2.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego2.getNombre() + ": No puede subir");
        }

        if (juego3.puedeSubir(edadNino)) {
            System.out.println("Acceso a " + juego3.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego3.getNombre() + ": No puede subir");
        }

        double alturaNino = 1.35;
        System.out.println("\nEdad: " + edadNino + " anos, Altura: " + alturaNino + "m");
        
        if (juego1.puedeSubir(edadNino, alturaNino)) {
            System.out.println("Acceso a " + juego1.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego1.getNombre() + ": No puede subir");
        }

        if (juego2.puedeSubir(edadNino, alturaNino)) {
            System.out.println("Acceso a " + juego2.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego2.getNombre() + ": No puede subir");
        }

        if (juego3.puedeSubir(edadNino, alturaNino)) {
            System.out.println("Acceso a " + juego3.getNombre() + ": Si puede subir");
        } else {
            System.out.println("Acceso a " + juego3.getNombre() + ": No puede subir");
        }
    }
}