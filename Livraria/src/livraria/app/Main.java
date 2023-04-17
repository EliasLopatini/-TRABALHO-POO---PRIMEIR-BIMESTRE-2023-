package livraria.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import livraria.modelo.Cliente;
import livraria.modelo.Endereco;
import livraria.modelo.Estoque;
import livraria.modelo.Livro;
import livraria.modelo.Venda;


public class Main {
    public static void main(String[] args) {
        
        
        //Adicionar Estoque//
        Estoque estoque = new Estoque();
        estoque.setLivros(new ArrayList<Livro>());
        
        
        // Adicionando livros ///
        Livro livro  = new Livro(1, "Harry Potter e a Pedra Filosofal",
                "Bloomsbury Publishing",  "J. K. Rowling",
                new Date(1997, 6, 26), "Fantasia e ficção",
                208, 5, 35.90, 2.00);
        livro.caluculaDesconto();
        livro.Dinheiro();
        estoque.getLivros().add(livro);
        estoque.setQuantidadeEstoque(2);
        
        
        Livro livro1 = new Livro(2, "Harry Potter e a Câmara Secreta",
                "Bloomsbury Publishing", "J. K. Rowling",
                new Date(1998, 6, 2), "Fantasia e ficção",
                224, 5, 32.99, 10.00);
        livro1.caluculaDesconto();
        livro1.Cartao();
        estoque.getLivros().add(livro1);
        estoque.setQuantidadeEstoque(5);
        
        Livro livro2 = new Livro(3, "Harry Potter e o Prisioneiro de Azkaban",
                "Bloomsbury Publishing", "J. K. Rowling",
                new Date(1999, 7, 8), "Fantasia e ficção",
                348, 10, 34.99, 00.00);
        livro2.caluculaDesconto();
        livro2.Dinheiro();
        estoque.getLivros().add(livro2);
        estoque.setQuantidadeEstoque(10);
       
        // Adicionando endereço //
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setEstado("PR");
        endereco.setPais("Brasil");
        endereco.setNumero(220);
        endereco.setRua("Rua das Orquídeas");
        

        // Adicionando Cliente //        
        Cliente cliente = new Cliente(1, "Lucas", "000.000.00", endereco);
        
        // Adicionar a Venda //
        
        /*        
        System.out.println("Livros escolhidos pelo cleinte: " + livros);

        Venda venda = cliente.registrarVenda(livros);
        
        venda.calculaTotalVenda();
        
        System.out.println("Venda realizada: " + venda.getTotalVenda());
        System.out.println("Livros após a venda: " + livros); */
        
        System.out.println(estoque.toString());
        
    }
        
}