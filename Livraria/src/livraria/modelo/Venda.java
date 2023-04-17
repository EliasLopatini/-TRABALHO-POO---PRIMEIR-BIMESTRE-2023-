package livraria.modelo;

import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private Double totalVenda;
    private List<Livro> livros;
    private Double totalVendaItem;
 
    public Venda() {
    }

    public Venda(int id, Cliente cliente, Double totalVenda, List<Livro> livros, Double desconto, Double totalVendaItem) {
        this.id = id;
        this.cliente = cliente;
        this.totalVenda = totalVenda;
        this.livros = livros;
        this.totalVendaItem = totalVendaItem;
    }
    
    public void calculaTotalVenda() { 
        totalVenda = 0.0;
        
        for (int i = 0; i < livros.size(); i++) {
            totalVenda = totalVenda + (livros.get(i).getPreco() * livros.get(i).getQuantidadeEstoque());
            livros.get(i).setQuantidadeEstoque(livros.get(i).getQuantidadeEstoque() - livros.get(i).getQuantidadeEstoque());
            
        }
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }


    public Double getTotalVendaItem() {
        return totalVendaItem;
    }

    public void setTotalVendaItem(Double totalVendaItem) {
        this.totalVendaItem = totalVendaItem;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", totalVenda=" + totalVenda + ", livros=" + livros + ", totalVendaItem=" + totalVendaItem + '}';
    }

   
}