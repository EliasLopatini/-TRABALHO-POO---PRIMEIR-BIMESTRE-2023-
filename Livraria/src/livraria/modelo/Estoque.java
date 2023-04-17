package livraria.modelo;

import java.util.ArrayList;

public class Estoque {
    
    private int id;
    private ArrayList<Livro> livros;
    private int quantidadeEstoque;

    public Estoque() {
    }

    public Estoque(int id, ArrayList<Livro> livros, int quantidadeEstoque) {
        this.id = id;
        this.livros = livros;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Estoque{" + "id=" + id + ", livros=" + livros + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
    
}




/*package livraria.modelo;

public class Estoque {
    
    private Livro livros;
    private int qtd_Estoque;

    public Estoque() {
    }

    public Estoque(Livro livros, int qtd_Estoque) {
        this.livros = livros;
        this.qtd_Estoque = qtd_Estoque;
    }
    
    public Livro getLivros() {
        return livros;
    }

    public void setLivros(Livro livros) {
        this.livros = livros;
    }

    public int getQtd_Estoque() {
        return qtd_Estoque;
    }

    public void setQtd_Estoque(int qtd_Estoque) {
        this.qtd_Estoque = qtd_Estoque;
    } 

    @Override
    public String toString() {
        return "Estoque{" + "livros=" + livros + ", qtd_Estoque=" + qtd_Estoque + '}';
    }
    
}*/

