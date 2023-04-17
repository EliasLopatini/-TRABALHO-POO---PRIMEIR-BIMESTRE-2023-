package livraria.modelo;

import java.util.Date;

public class Livro {

    private int id;
    private String titulo;
    private String editora;
    private String autores;
    private Date lancamento;
    private String genero;
    private int numeroPaginas;
    private int quantidadeEstoque;
    private double preco;
    private String formaDePagamento;
    private Double desconto;

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    
    public void caluculaDesconto(){
        preco = preco - desconto;
    }
    
    
    public void Dinheiro(){
        formaDePagamento = "Dinheiro";
    }
    
     public void Cartao(){
        formaDePagamento = "Cartao";  
    }
    
     
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > this.quantidadeEstoque) {
            System.out.println("Erro: quantidade de estoque insuficiente.");
            return;
        }
        this.quantidadeEstoque -= quantidade;
    }

    public Livro() {
    }

    public Livro(int id, String titulo, String editora, String autores, Date lancamento, String genero, int numeroPaginas, int quantidadeEstoque, double preco, double desconto/*, Estoque estoque*/) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.lancamento = lancamento;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.desconto = desconto;
        //this.estoque = estoque;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    /*
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }*/

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /*
    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }*/
    
    /*
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
*/

    @Override
    public String toString() {
        return "\nLivro{" + "id=" + id + ", titulo=" + titulo + ", editora=" + editora + ", autores=" + autores + ", lancamento=" + lancamento + ", genero=" + genero + ", numeroPaginas=" + numeroPaginas + ", quantidadeEstoque=" + quantidadeEstoque + ", preco=" + preco + ", formaDePagamento=" + formaDePagamento + ", desconto=" + desconto + '}';
    }




    void setQuantidadeEstoque(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}