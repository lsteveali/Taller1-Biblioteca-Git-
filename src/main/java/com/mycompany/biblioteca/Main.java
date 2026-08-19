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

    public static void listClients() {
        System.out.println("\n--- Lista de clientes ---");
        if (clients.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Client c : clients) {
            System.out.println(c);
        }
    }

    public static Client searchClient(String id) {
        for (Client c : clients) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public static void updateClient() {
        System.out.print("\nIngrese el ID del cliente a actualizar: ");
        String id = sc.nextLine();
        Client client = searchClient(id);

        if (client == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre (" + client.getName() + "): ");
        client.setName(sc.nextLine());
        System.out.print("Nuevo teléfono (" + client.getPhone() + "): ");
        client.setPhone(sc.nextLine());
        System.out.print("Nuevo email (" + client.getEmail() + "): ");
        client.setEmail(sc.nextLine());

        System.out.println("Cliente actualizado con éxito.");
    }
}