package main.service;

import main.model.Cliente;
import main.model.Emprestimo;
import main.model.Livro;
import main.service.realizacao.validacao.ValidaEmprestimo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class RealizarEmprestimoService {
    private List<ValidaEmprestimo> validaEmprestimos;

    public RealizarEmprestimoService(List<ValidaEmprestimo> validaEmprestimos){
        this.setValidaEmprestimos(validaEmprestimos);
    }

    public Emprestimo RealizarEmprestimo(Cliente cliente, List<Livro> livros){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setID(UUID.randomUUID().toString());
        emprestimo.setCliente(cliente);
        emprestimo.setLivros(livros);
        emprestimo.setDataEmprestimo(LocalDateTime.now().withDayOfYear(40));
        for (ValidaEmprestimo validaEmprestimo: this.validaEmprestimos) {
            validaEmprestimo.Validar(emprestimo);
        }

        return emprestimo;
    }

    public List<ValidaEmprestimo> getValidaEmprestimos() {
        return validaEmprestimos;
    }

    public void setValidaEmprestimos(List<ValidaEmprestimo> validaEmprestimos) {
        this.validaEmprestimos = validaEmprestimos;
    }
}
