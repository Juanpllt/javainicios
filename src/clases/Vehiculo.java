package clases;

public abstract class Vehiculo {
    private String marca,color, gamma;
    private int capacidad;
    
    public Vehiculo(String marca,String color,int capacidad,String gamma){
        this.marca = marca;
        this.color = color;
        this.capacidad= capacidad;
        this.gamma = gamma;
    }
    
    public void parquear(String marca){
        
        System.out.println("Estoy parqueando ");
    }
    
    public abstract void acelerar(String gamma);
    
    public void moverse(){
        System.out.println("El vehiculo se esta moviendo");
    }
    
     public void desplegarInformacion(){
        System.out.println(getMarca()+"\n"+getColor()+"\n"+getCapacidad()+"\n"+getGamma());
        
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    /*public String getTipoVehiculo(){
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }
    */
    public String getColor(){
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad =  capacidad;
    }
     
    public String getGamma(){
        return gamma;
    }
    public void setGamma(String gamma){
        this.gamma = gamma;
    }
    
}
