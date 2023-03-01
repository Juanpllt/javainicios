package clases;

public class Moto extends Vehiculo {
    public Moto(String color, String marca, int capacidad, String gamma){
        super(color,marca, capacidad, gamma);
    }
    
    @Override
    public void acelerar(String gamma){
        
        switch(gamma){
            case "estandar":
                System.out.println("\nla moto acelero a 80km/h en 12 segundos");
                break;
            case "alta":
                System.out.println("\nla moto acelero a 100km/h en 8 segundos");
                break;
            case "super":
                System.out.println("\nla moto acelero a 120km/h en 5 segundos");
                break;
        }
    } 
    
}
