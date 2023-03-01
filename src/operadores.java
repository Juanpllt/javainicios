
import java.util.Scanner;

public class operadores {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero del mes para saber la estacion: ");
        int mes = Integer.parseInt(sc.nextLine());
        String Estacion;
        
        if(mes==12||mes==1||mes==2){
            Estacion= "Invierno";
            System.out.println("Estacion = " + Estacion);
        }
        else if(mes==3||mes==4||mes==5){
            Estacion="Primavera";
            System.out.println("Estacion = " + Estacion);
        }
        else if(mes==6||mes==7||mes==8){
            Estacion="Verano";
            System.out.println("Estacion = " + Estacion);
        }
        else if(mes==9||mes==10||mes==11){
            Estacion="Otoño";
            System.out.println("Estacion = " + Estacion);
        }
        else {
            Estacion="Estacion desconocida";    
            System.out.println("Estacion = " + Estacion);
        }
    }
}
