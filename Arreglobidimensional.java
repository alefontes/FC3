package com.mycompany.arreglobidimensional;
import java.util.*;
public class Arreglobidimensional {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] n=new int[3][2];
        int[][] m=new int[2][3];
        int[][] p=new int[3][3];
        
        System.out.println("Matriz de 3x2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese el dato en "+(i)+","+(j));
                n[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz de 2x3");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el dato en "+(i)+","+(j));
                m[i][j]=sc.nextInt(); 
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz de 3x2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Matriz de 2x3");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Multiplicacion de las matrices");
        for ( int i = 0; i < 3; i++){ 
            for ( int j = 0; j < 3; j++){
                for ( int k = 0; k < 2; k++ ){
                        p[i][j] += n[i][k]*m[k][j];
                }
        }
}
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
