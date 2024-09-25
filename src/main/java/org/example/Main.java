package org.example;

import org.example.MODELOS.Apartamentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Apartamentos apartamentos = new Apartamentos();
        System.out.print("Digite localidad del apartamento: ");
        apartamentos.setLocalizacion(lea.nextLine());
        System.out.print("Digite el precio del apartamento: ");
        apartamentos.setPrecio(lea.nextInt());
        System.out.print("Digite el numero de baños: ");
        apartamentos.setNumeroBaños(lea.nextInt());
        System.out.print("Digite numero de habitaciones: ");
        apartamentos.setNumeroHabitaciones(lea.nextInt());
        System.out.print("Digite numero de cocinas: ");
        apartamentos.setNumeroCocinas(lea.nextInt());
        System.out.print("Tiene patio? ");
        apartamentos.setTienePatio(lea.nextBoolean());
        System.out.println(apartamentos);



    }
}