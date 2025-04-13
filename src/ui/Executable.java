package ui;

import model.Controller;
import java.util.Scanner;

public class Executable {

    private Scanner escaner;
    private Controller cont;
    private int filas;
    private int columnas;
    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        escaner = new Scanner(System.in);

    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {
        System.out.println("Ingrese la cantidad de filas de las matrces");
        filas= escaner.nextInt();
        System.out.println("Ingrese la cantidad de columnas de las matrces");
        columnas=escaner.nextInt();

        cont = new Controller(filas, columnas);
        
        System.out.println("Inserte los numeros de la matriz numero 1");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Insertar dato en fila " + i +" y columna " + j + "");
                int valor = escaner.nextInt();
            
                cont.getMatriz1().instertarValor(i, j, valor);
            }
        }

        System.out.println("Inserte los números de la matriz número 2");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Insertar dato en fila " + i +" y columna " + j + "");
                int valor = escaner.nextInt();
                
                cont.getMatriz2().instertarValor(i, j, valor);
            }
        }
        
        System.out.println("Matriz 1:");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(cont.getMatriz1().getMatriz()[i][j] + " ");
            }
            System.out.println();
        }
 
        System.out.println("Matriz 2:");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(cont.getMatriz2().getMatriz()[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz suma:");
        int[][] resultado = cont.sumarMatrices();
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
        
    

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}