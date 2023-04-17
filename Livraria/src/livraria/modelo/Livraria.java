package livraria.modelo;

import java.util.ArrayList;


public class Livraria {

    private ArrayList<String>Estoque;

    public Livraria() {
    }

    public Livraria(ArrayList<String> Estoque) {
        this.Estoque = Estoque;
    }

    public ArrayList<String> getEstoque() {
        return Estoque;
    }

    public void setEstoque(ArrayList<String> Estoque) {
        this.Estoque = Estoque;
    }

    @Override
    public String toString() {
        return "Livraria{" + "Estoque=" + Estoque + '}';        
    }
    
    
}
