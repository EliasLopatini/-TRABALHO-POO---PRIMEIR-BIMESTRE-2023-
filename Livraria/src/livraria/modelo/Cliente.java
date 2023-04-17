package livraria.modelo;

import java.util.List;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Venda registrarVenda(List<Livro> livros) {
        Venda venda = new Venda();

        venda.setLivros(livros);

        return venda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + '}';
    }
}