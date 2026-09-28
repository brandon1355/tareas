/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota1;

import java.util.Scanner;

public class Mascota1 {
    private String nombre;
    private int energia;
    private int hambre;

    public Mascota1(String nombre) {
        this.nombre = nombre;
        this.energia = 100;
        this.hambre = 0;
    }
    public void comer() {
        this.hambre = Math.max(0, this.hambre - 30);
    }

    public void jugar() {
        this.energia -= 20;
        this.hambre += 15;
    }


    public void dormir() {
        this.energia = 100;
    }
    public boolean estaFeliz() {
        return this.energia > 50 && this.hambre < 50;
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Energia: " + energia + " | Hambre: " + hambre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de tu mascota: ");
        String nombre = scanner.nextLine();

        Mascota1 miMascota = new Mascota1(nombre);

        System.out.println("demostraion");
        System.out.println("Estado inicial:");
        miMascota.mostrarEstado();
        System.out.println("Esta feliz: " + miMascota.estaFeliz());

        System.out.println("Haciendo jugar a " + nombre + " 3 veces...");
        miMascota.jugar();
        miMascota.jugar();
        miMascota.jugar();

        miMascota.mostrarEstado();
        System.out.println("Sigue feliz: " + miMascota.estaFeliz());
        System.out.println("datos: La energia bajo a 40 (requiere mayor a 50). Para recuperarla debes llamar a dormir");

        System.out.println("menu");
        int opcion = 0;

        do {
            System.out.println(" ");
            miMascota.mostrarEstado();
            System.out.println("Estado de animo: " + (miMascota.estaFeliz() ? "Feliz" : "Triste  Cansado"));
            System.out.println("  ");
            System.out.println("1. Comer");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        miMascota.comer();
                        System.out.println("-> Has alimentado a " + nombre + ".");
                        break;
                    case 2:
                        miMascota.jugar();
                        System.out.println("-> Has jugado con " + nombre + ".");
                        break;
                    case 3:
                        miMascota.dormir();
                        System.out.println("-> " + nombre + " ha dormido y recupero su energia.");
                        break;
                    case 4:
                        System.out.println("adios");
                        break;
                    default:
                        System.out.println("incorrecto, intenta denuevo.");
                }
            } else {
                System.out.println("ingresa un numero valido");
                scanner.next();
            }
        } while (opcion != 4);

        scanner.close();
    }
}