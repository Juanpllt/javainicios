package caja;

public class Caja {
    private int alto, ancho, profundidad;
    public Caja(int alto, int ancho, int profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
//    public void volumenCaja(){
//        System.out.println("volumen = "+ancho*alto*profundidad );
//    }
    public int volumenCaja(){
        return alto*ancho*profundidad;
    }
    public void mostrarVolumen(){
        System.out.println(volumenCaja() );
    }
}
