package clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         String colorx ,marcax , gammax;
         int capacidadx;
         Scanner sc = new Scanner(System.in);
         
        do{
            System.out.println("Introduzca la gamma de su vehiculo, entra las opciones estan estandar, alta y super: ");
            gammax= sc.nextLine();
            
        }
        while(gammax.isBlank());
        //!"estandar".equals(gammax)||!"alta".equals(gammax)||!"super".equals(gammax)
        do{
            System.out.println("Introduzca la marca de su vehiculo");
            marcax= sc.nextLine();
        }
        while(marcax.isBlank());
        
        do{
            System.out.println("Introduzca el color del vehiculo");
            colorx= sc.nextLine();
        }
        while(colorx.isBlank());
        
        do{
            System.out.println("Introduzca la capacidad de su vehiculo");
            capacidadx= sc.nextInt();
        }
        while(capacidadx<=0);
        
        Vehiculo moto = new Moto(colorx, marcax, capacidadx, gammax);
        
        moto.setColor(colorx);
        moto.setMarca(marcax);
        moto.setCapacidad(capacidadx);
        moto.setGamma(gammax);
        
        moto.desplegarInformacion();
        moto.acelerar(gammax);
        moto.moverse();
        
        
    }
}
