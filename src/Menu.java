package src;

import java.util.Scanner;

public class Menu {
    Perrito perrito;

    public Menu(Perrito perrito) {
        this.perrito = perrito;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar acción: " +
                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': perrito.alimentar(); break;
                case 'd': perrito.dormir(); break;
                case 'j': perrito.jugar(); break;
                case 'p': perrito.comoEstas(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
