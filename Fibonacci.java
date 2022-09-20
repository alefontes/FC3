package com.mycompany.fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static int Fibonacci(int x){
        if (x==0 || x==1) {
            return x;
        }else{
            return Fibonacci(x-1)+Fibonacci(x-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Selecciona hasta que numero quiere de la sucesion de fibonacci:");
        int fin=sc.nextInt();
        for (int i = 0; i < fin; i++) {
            System.out.println(Fibonacci(i));
        }
    }
}
