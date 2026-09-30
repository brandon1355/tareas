/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariotienda;
import java.util.ArrayList;
import java.util.Collections;

public class InventarioTienda {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();

        inventario.add("Arroz");
        inventario.add("Pan");
        inventario.add("Leche");
        inventario.add("Fideos");
        inventario.add("Aceite");

        System.out.println("Inventario inicial: " + inventario);

        inventario.set(1, "Galletas");

        int posicion = inventario.indexOf("Leche");
        System.out.println("La posicion de 'Leche' es: " + posicion);

        String productoAEliminar = "Fideos";
        
        if (inventario.contains(productoAEliminar)) {
            inventario.remove(productoAEliminar);
            System.out.println("Se elimio" + productoAEliminar + "' del inventario.");
        } else {
            System.out.println("Error: El producto '" + productoAEliminar + "' no existe.");
        }

 
        System.out.println("Total de productos restantes: " + inventario.size());

        Collections.sort(inventario); 
        
        System.out.println("nventario final");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
    }
}
