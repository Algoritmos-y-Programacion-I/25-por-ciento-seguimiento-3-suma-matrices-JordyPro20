package model;

public class MatrizNumerica {

    private int[][] matriz; // Declaro
    private int cantFilas; // Declaro
    private int cantColumnas; // Declaro

    public MatrizNumerica(int filas, int columnas){
        this.cantFilas = filas;
        this.cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializado

    }

    public void instertarValor(int i, int j, int valor){
        matriz[i][j] = valor;
    }

    public int getValor(int i, int j) {
        return matriz[i][j];
    }

    public int[][] getMatriz() {
        return matriz;
    }
    
    public int getFilas() {
        return cantFilas;
    }

    public int getColumnas() {
        return cantColumnas;
    }
}
