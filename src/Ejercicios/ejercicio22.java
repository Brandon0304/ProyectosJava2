package Ejercicios;

import javax.swing.*;
import java.util.Random;
import java.util.List;

public class ejercicio22 {
    public String jugador1 = "";
    public String jugador2 = "";

    public int carta1 = 1;
    public int carta2 = 2;
    public int carta3 = 3;
    public int carta4 = 4;
    public int carta5 = 5;
    public int carta6 = 6;
    public int carta7 = 7;
    public int carta8 = 8;
    public int carta9 = 9;
    public int carta10 = 10;

    public int[] cartas = {carta1, carta2, carta3, carta4, carta5, carta6, carta7, carta8, carta9, carta10};

    public ejercicio22() {
        generarCartasAleatorias();
    }

    private void generarCartasAleatorias() {
        Random random = new Random();
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = random.nextInt(10) + 1;
        }
    }

    public void mostrarCarta1() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(cartas.length);
        int cartaAleatoria= cartas[indiceAleatorio];
        JOptionPane.showMessageDialog(null, " primera carta de " + jugador1  +" es el numero : " + cartaAleatoria);
    }

    public void mostrarCarta2(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(cartas.length);
        int cartaAleatoria = cartas[indiceAleatorio];
        JOptionPane.showMessageDialog(null, " primera carta de " + jugador2  +" es el numero : " + cartaAleatoria);

    }

    public void mostrarCarta2jugado1(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(cartas.length);
        int cartaAleatoria = cartas[indiceAleatorio];
        JOptionPane.showMessageDialog(null, " segunda carta de " + jugador1  +" es el numero : " + cartaAleatoria);
    }

    public void mostrarCarta2jugador2(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(cartas.length);
        int cartaAleatoria = cartas[indiceAleatorio];
        JOptionPane.showMessageDialog(null, " segunda carta de " + jugador2  +" es el numero : " + cartaAleatoria);
    }
    public String opccion;
    public void cartaAdiciona1(){
        opccion = JOptionPane.showInputDialog(null, "desea otra carta " + jugador1 + "?");
        if (opccion.equals("si")){
            Random random = new Random();
            int indiceAleatorio = random.nextInt(cartas.length);
            int cartaAleatoria = cartas[indiceAleatorio];
            JOptionPane.showMessageDialog(null, " tercera carta " + jugador1  +" es el numero : " + cartaAleatoria);
        }else  {
            JOptionPane.showMessageDialog(null, "su total es de "  );
        }
    }
    public String opccion2;
    public void cartaAdiciona2(){
        opccion2 = JOptionPane.showInputDialog(null, "desea otra carta " + jugador2 +"?");
        if (opccion2.equals("si")){
            Random random = new Random();
            int indiceAleatorio = random.nextInt(cartas.length);
            int cartaAleatoria = cartas[indiceAleatorio];
            JOptionPane.showMessageDialog(null, " tercera carta " + jugador2  +" es el numero : " + cartaAleatoria);
        }else {
            JOptionPane.showMessageDialog(null,"su total es de " );
        }
    }

    public int calcularPuntaje(List<Integer> cartasJugador) {
        int suma = 0;
        for (int carta : cartasJugador) {
            suma += carta;
        }
        return suma;
    }

    public void determinarGanador() {
        int puntajeJugador1 = calcularPuntaje(calcularPuntaje());
        int puntajeJugador2 = calcularPuntaje(calcularPuntaje());

        String mensaje = "Puntaje de " + jugador1 + ": " + puntajeJugador1 + "\n" +
                "Puntaje de " + jugador2 + ": " + puntajeJugador2 + "\n";

        if (puntajeJugador1 > puntajeJugador2) {
            mensaje += "El ganador es " + jugador1 + " con " + puntajeJugador1 + " puntos.";
        } else if (puntajeJugador2 > puntajeJugador1) {
            mensaje += "El ganador es " + jugador2 + " con " + puntajeJugador2 + " puntos.";
        } else {
            mensaje += "Es un empate con " + puntajeJugador1 + " puntos.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getCarta1() {
        return carta1;
    }

    public void setCarta1(int carta1) {
        this.carta1 = carta1;
    }

    public int getCarta2() {
        return carta2;
    }

    public void setCarta2(int carta2) {
        this.carta2 = carta2;
    }

    public int getCarta3() {
        return carta3;
    }

    public void setCarta3(int carta3) {
        this.carta3 = carta3;
    }

    public int getCarta4() {
        return carta4;
    }

    public void setCarta4(int carta4) {
        this.carta4 = carta4;
    }

    public int getCarta5() {
        return carta5;
    }

    public void setCarta5(int carta5) {
        this.carta5 = carta5;
    }

    public int getCarta6() {
        return carta6;
    }

    public void setCarta6(int carta6) {
        this.carta6 = carta6;
    }

    public int getCarta7() {
        return carta7;
    }

    public void setCarta7(int carta7) {
        this.carta7 = carta7;
    }

    public int getCarta8() {
        return carta8;
    }

    public void setCarta8(int carta8) {
        this.carta8 = carta8;
    }

    public int getCarta9() {
        return carta9;
    }

    public void setCarta9(int carta9) {
        this.carta9 = carta9;
    }

    public int getCarta10() {
        return carta10;
    }

    public void setCarta10(int carta10) {
        this.carta10 = carta10;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "carta1=" + carta1 +
                ", carta2=" + carta2 +
                ", carta3=" + carta3 +
                ", carta4=" + carta4 +
                ", carta5=" + carta5 +
                ", carta6=" + carta6 +
                ", carta7=" + carta7 +
                ", carta8=" + carta8 +
                ", carta9=" + carta9 +
                ", carta10=" + carta10 +
                '}';
    }
}
