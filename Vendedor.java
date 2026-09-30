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
public class Vendedor extends Funcionario {
    private double comissao;
    
    public Vendedor(String nome, double salarioBase, double comissao) {
       super(nome, salarioBase);
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
