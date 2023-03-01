package Practica;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Proporcione la nota= ");
        int nota = Integer.parseInt(sc.nextLine());
        String resultado;
        
        if(nota>=0&&nota<=10){
            if(0<=nota&&nota<6){
                resultado="F";
            }
            else if (6<=nota&&nota<7){
                resultado="D";
            }
            else if(7<=nota&&nota<8){
                resultado="C";
            }
            else if(8<=nota&&nota<9){
                resultado="B";
            }
            else {
                resultado="A";
            }
            System.out.println("Resultado = " + resultado);
        }
        else{
            System.out.print("La nota no puede ser mayor de 10 o menor de 0:");
        }
        
    }
}
