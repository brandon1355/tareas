/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cancion;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSeg;

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.duracionSeg = 0;
    }

    public Cancion(String titulo, String artista, int duracionSeg) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSeg = duracionSeg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public boolean esLarga() {
        return this.duracionSeg > 240;
    }

    public String duracionFormato() {
        int minutos = this.duracionSeg / 60;
        int segundos = this.duracionSeg % 60;
        
        String segTexto = "";
        if (segundos < 10) {
            segTexto = "0" + segundos;
        } else {
            segTexto = "" + segundos;
        }
        
        return minutos + ":" + segTexto;
    }

    public void mostrar() {
        String texto = titulo + " - " + artista + " (" + duracionFormato() + ")";
        if (esLarga()) {
            texto += " [larga]";
        }
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Prisionera", "villa carino", 193);
        Cancion c2 = new Cancion("Colo colo", "centinela spectro", 144);
        Cancion c3 = new Cancion("Por Que No Se Van", "Los prisioneros", 181);

        System.out.println("Top 3 de canciones");
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        System.out.println();
        System.out.println("cambiando la duracion");
        c3.setDuracionSeg(250);
        c3.mostrar();
    }
}