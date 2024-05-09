/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import java.io.*;
/**
 *
 * @author Arell
 */
public class Puntuaje implements Runnable {
//    EjemploChatgpt
    private int tiempoRestante;
    private int nivel;
    private int score;
    private String jugador;

    public Puntuaje() {
        this.tiempoRestante = 60; // 60 segundos para el nivel 1
        this.nivel = 1;
        this.score = 0;
        this.jugador = "";
    }

    @Override
    public void run() {
        while (tiempoRestante > 0) {
            // Actualiza la interfaz de usuario con el tiempo restante
            // por ejemplo: tiempoRestanteLabel.setText(String.valueOf(tiempoRestante));
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tiempoRestante--;
        }
        // Si el tiempo llega a cero, pasa al siguiente nivel
        nivel++;
        calcularPuntaje();
        guardarPuntaje();
        // Coloca aquí la lógica para pasar al siguiente nivel
    }

    private void calcularPuntaje() {
        // Coloca aquí la lógica para calcular el puntaje
        // por ejemplo: score = tiempoRestante * nivel;
    }

    private void guardarPuntaje() {
        try {
            // Lee la puntuación previa del archivo
            File archivo = new File("puntaje.txt");
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            int puntajePrevio = Integer.parseInt(br.readLine());
            br.close();
            
            // Si el puntaje actual es mayor, solicita el nombre del jugador y guarda la nueva puntuación
            if (score > puntajePrevio) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("¡Nuevo récord! Ingresa tu nombre:");
                jugador = reader.readLine();
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(score + "\n" + jugador);
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



