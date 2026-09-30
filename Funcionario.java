/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentofuncionarios;

/**
 *
 * @author Guilherme
 */
public class Funcionario {
    protected String nome;
    protected double salarioBase;
    
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
    
}
