package prueba_palindromo;

import java.util.Scanner;
import java.util.Random;

public class Prueba_Palindromo {

    public static void main(String[] args) {
        String palabras[] = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language",
            "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};
        int cantidad,aleatorio;
        Scanner sc = new Scanner(System.in);
        Random rd=new Random();
        for (int numerolista = 0; numerolista < 20; numerolista++) {
            System.out.println("[" + numerolista + "]" + " - " + palabras[numerolista]);
        }
        System.out.println("ingresar la cantidad de nuemros en la lista");
        cantidad = sc.nextInt();
        System.out.println(" ");
        
        

        String listaA[]=new String[cantidad];
        String listaB[]=new String[cantidad];
        
        aleatorio=rd.nextInt(palabras.length);
        
        for (int lista1 = 0; lista1 < cantidad; lista1++) {
            System.out.println("["+lista1+"]"+listaA[lista1]);
        }
        System.out.println(" ");

        for (int lista2 = 0; lista2 < cantidad; lista2++) {
            System.out.println("["+lista2+"]"+listaB[lista2]);
        }
        System.out.println(" ");

    }

}
