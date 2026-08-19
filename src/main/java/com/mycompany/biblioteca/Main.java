package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Main menu goes here (Phase 8)
    }

    public static void createClient() {
        System.out.println("\n--- Registrar nuevo cliente ---");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Teléfono: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Client client = new Client(id, name, phone, email);
        clients.add(client);
        System.out.println("Cliente registrado con éxito.");
    }
}