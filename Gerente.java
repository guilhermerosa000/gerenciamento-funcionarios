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
public class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    
    
    
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
    
    
}
