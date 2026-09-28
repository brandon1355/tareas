/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 package heroes;

public class Heroes {
    private String nombre;
    private int vida;
    private int ataque;

    public Heroes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida);
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void atacar(Heroes rival) {
        int danioFinal = this.ataque;

        if (Math.random() < 0.5) {
            danioFinal *= 2;
            System.out.println("golpe fuerte  de " + this.nombre + " ");
        }

        rival.setVida(rival.getVida() - danioFinal);

        System.out.println(this.nombre + " atacar a " + rival.getNombre() + 
                           " haciendo " + danioFinal + " de danio. " +
                           "(vida " + rival.getNombre() + ": " + rival.getVida() + ")");
    }
    
    public static void main(String[] args) {
        Heroes a = new Heroes("Valkiria", 100, 10);
        Heroes b = new Heroes("Golem", 130, 12);

        System.out.println("combate vs ");
        System.out.println(a.getNombre() + " (" + a.getVida() + " HP) vs " + 
                           b.getNombre() + " (" + b.getVida() + " HP)");

        int ronda = 1;

        while (a.estaVivo() && b.estaVivo()) {
            System.out.println("Ronda " + ronda + " ");
            
            a.atacar(b);

            if (b.estaVivo()) {
                b.atacar(a);
            }
            
            System.out.println();
            ronda++;
        }

        System.out.println("final de la ronda");
        if (a.estaVivo()) {
            System.out.println("El ganador es " + a.getNombre() + "");
        } else {
            System.out.println("El ganador es " + b.getNombre() + "");
        }
    }
}