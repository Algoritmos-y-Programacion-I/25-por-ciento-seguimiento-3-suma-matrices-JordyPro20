package model;

import model.SalaCine;
import model.MatrizNumerica;


public class Controller {

    private SalaCine cinemark; // Declarando sala de cine
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;
    private int filas;
    private int columnas;
    /**
     
Constructor de la clase Controller para inicializar *
@pre No se requieren precondiciones específicas.
@post Se crea una instancia de Controller */
    public Controller(int filas,int columnas) {
        matriz1=new MatrizNumerica(filas,columnas);
        matriz2=new MatrizNumerica(filas,columnas);
    }

    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    

    public MatrizNumerica getMatriz1(){
        return matriz1;
    }

    public MatrizNumerica getMatriz2(){
        return matriz2;
    }

    public void instertarValorMatriz1(int i, int j, int valor) {
        matriz1.instertarValor(i, j, valor);
    }
    
    public void instertarValorMatriz2(int i, int j, int valor) {
        matriz2.instertarValor(i, j, valor);
    }
    
    public int[][] sumarMatrices() {
        int filas = matriz1.getFilas();
        int columnas = matriz1.getColumnas();
        int[][] resultado = new int[filas][columnas];
    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1.getValor(i, j) + matriz2.getValor(i, j);
            }
        }
    
        return resultado;
    }


}
