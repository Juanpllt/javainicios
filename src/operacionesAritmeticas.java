
import java.util.Scanner;

public class operacionesAritmeticas {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero = \n");
        double a= sc.nextDouble();
        System.out.println("Digite el segundo numero = \n");
        double b= sc.nextDouble();
        double resultado = a + b;
        System.out.println("resultado de la suma es = " + resultado);
        resultado = a-b;
        System.out.println("resultado de la resta es =  " + resultado);
        resultado = a*b;
        System.out.println("resultado de la multiplicación es = " + resultado);
        resultado = a/b;
        System.out.println("resultado de la division es = " + resultado);
        resultado = a%b;
        System.out.println("resultado del residuo de la división= " + resultado);
        
        if ((a%2)==0)
            System.out.println("A es par = " + a);
        else
            System.out.println("A es impar = "+ a);
        if((b%2)==0)
            System.out.println("B es par = " + b);
        else
            System.out.println("B es impar = "+ b);
    }
}
