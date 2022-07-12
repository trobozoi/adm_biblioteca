package main.app;

import main.model.Cliente;
import main.model.Emprestimo;
import main.model.Livro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Antônio Jailton Carvalho Araújo");
        cliente.setTelefone("+55 85 988592440");
        cliente.setEmail("trobozoi@gmail.com");

        List<Livro> livros = List.of();
    }
}
