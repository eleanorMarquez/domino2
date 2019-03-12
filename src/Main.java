
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        // se crean 28 fichas y se ocultan 28
        Mesa mesa = new Mesa();
        // Se crean los jugadores para mostrar su mazo
        Player jugador1 = new Player("Estrella");
        Player jugador2 = new Player("PC");

        // Repartir 7 fichas a cada jugador
        for (int i = 0; i < 7; i++) {
            jugador1.addFicha(mesa.getFichaOculta());
            jugador2.addFicha(mesa.getFichaOculta());
        }
        //sacar la ficha inicial
        mesa.addFichaInicial(jugador2.getFicha(0));

        /*int n = 7;
        for (int i = -3 * n / 2; i <= n; i++) {
            for (int j = -3 * n / 2; j <= 3 * n / 2; j++) {
                if ((Math.abs(i) + Math.abs(j) < n)
                        || ((-n / 2 - i) * (-n / 2 - i) + (n / 2 - j) * (n / 2 - j) <= n * n / 2)
                        || ((-n / 2 - i) * (-n / 2 - i) + (-n / 2 - j) * (-n / 2 - j) <= n * n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
         */
//      Inicia el ciclo para poder controlar el juego
        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.println("\nQUE FUNCION DESEAS HACER?:\n"
                    + "0 => iniciar juego.\n"
                    + "1 => salir.\n"
            );
            int resultado = menu.nextInt();
            switch (resultado) {

                case 0:
                    //ciclo de control for continue con ingreso de datos en teclado
                    Scanner scan = new Scanner(System.in);
                    for (int i = 0; i < 4; i++) {
                        jugador1.showMazo();
                        mesa.show();
                        if (jugador1.jugadaPosible(mesa.getFirst(), mesa.getLast())) {
                            System.out.print(jugador1.getNombre() + " para colocar ficha al inicio presione 1 de lo contrario 0:");
                            int sitioJugar = scan.nextInt();
                            System.out.print("coloque el indice de la ficha a jugar ?:");
                            int indiceFichaJugar = scan.nextInt();

                            mesa.jugarFicha(jugador1, sitioJugar, indiceFichaJugar);
                        }
                        jugador2.showMazo();
                        mesa.show();
                        if (jugador2.jugadaPosible(mesa.getFirst(), mesa.getLast())) {
                            System.out.print(jugador2.getNombre() + " para colocar ficha al inicio presione 1 de lo contrario 0:");
                            int sitioJugar = scan.nextInt();
                            System.out.print("coloque el indice de la ficha a jugar ?:");
                            int indiceFichaJugar = scan.nextInt();

                            mesa.jugarFicha(jugador2, sitioJugar, indiceFichaJugar);
                        }
                        mesa.show();

                    }
                case 1:
                    System.exit(0);
                default:
                    System.out.println("La opcion no es correacta.");
                    System.out.println(" \n//////////||||||||||//////////||||||||||//////////||||||||||//////////||||||||||");
                    int rest = menu.nextInt();
            }
        }

    }

}
