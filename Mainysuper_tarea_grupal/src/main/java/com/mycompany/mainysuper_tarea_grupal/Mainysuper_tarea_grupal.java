/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainysuper_tarea_grupal;

/**
 *
 * @author Rodriguez
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Carlos", 40, "Cardiología");
        Deportista deportista = new Deportista("Ana", 25, "Fútbol");

        System.out.println("Nombre: " + doctor.getNombre() + ", Edad: " + doctor.getEdad());
        doctor.mostrarProfesion();

        System.out.println("Nombre: " + deportista.getNombre() + ", Edad: " + deportista.getEdad());
        deportista.mostrarProfesion();
    }
}
