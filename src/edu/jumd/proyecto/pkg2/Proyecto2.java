/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jumd.proyecto.pkg2;

import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Proyecto2 {

    static int mayor, menor;

    public static void main(String[] args) {
        int n1, n2, n3, n4;
        boolean paso = false;
        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite el numero 1 : ");
            n1 = entrada.nextInt();
            System.out.println("Digite el numero 2: ");
            n2 = entrada.nextInt();
            System.out.println("Digite el numero 3: ");
            n3 = entrada.nextInt();
            System.out.println("Digite el numero 4: ");
            n4 = entrada.nextInt();
            int sum = n1 + n2 + n3 + n4;
            
            //En esta parte del codigo, incluimos las condiciones de menor a 0, mayor qwu 200 y que los numeros no se pueden repetir
            if (sum >= 200 || n1<0 && n2<0 && n3<0 && n4<0 || n1==n2 && n1==n3 && n1==n4 || n2==n1 && n2==n3 && n2==n4 ||  n3==n1 && n3==n2 && n3==n4 || n4==n1 && n4==n2 && n4==n3){
                    System.out.println("No se pueden hacer operaciones menores, mayores o iguales a 200\nDigite de nuevo los numeros:");
                    paso = false;

            } else {
                paso = true;
            }

        } while (paso == false);

        if (paso == true) {
            mayor = n1;
            menor = n1;
            comprobar(n1);
            comprobar(n2);
            comprobar(n3);
            comprobar(n4);
            
              //Sumamos al mayor si el numero menor es mayor a 10 y si el mayor es menor a 50, al numero menor se le tiene que restar 
            if(menor>10){
                mayor = mayor +10;
            }
            else if(mayor<50){
                menor = menor -5;
            }
        }
            System.out.println("El numero mayor es " + mayor + " y el menor es : " + menor);                     
    }

    static void comprobar(int num) {
        if (num < menor) {
            menor = num;
        }
        if (num > mayor) {
            mayor = num;
        }
    }
}
