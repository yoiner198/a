package modelo;

import java.util.ArrayList;

public class Restaurante {
    
    private Vegano pVegano;
    private Carne pCarne;
    ArrayList plato;
    plato platoc = new Carne();
    plato platov = new Vegano();
    

    public Restaurante() {
    }

    public Restaurante(Vegano pVegano) {
        this.pVegano = pVegano;
    }

    public Restaurante(Carne pCarne) {
        this.pCarne = pCarne;
    }
    
    
    public ArrayList agregarPlato(Carne platoc){
        
    }
    
    public ArrayList agregarPlato(Carne platoc){
        
    }
    
    public ArrayList buscarPlato(int cPLato){
        
    }
    
    public double servicioDomicilio(){
        return 0;
    }
    
    public double servicioDeMesa(){
        return 0;
    }
}
