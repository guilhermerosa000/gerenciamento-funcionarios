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
public class GerenciamentoFuncionarios {

  
    public static void main(String[] args) {
       
    Funcionario[] funcionarios = new Funcionario[3];
    
    funcionarios[0] = new Funcionario("Joao", 2500);
    funcionarios[1] = new Gerente ("Carlos", 5000, 1500);
    funcionarios[2] = new Vendedor ("Mariana", 2000, 800);
    
    double folhaDePagamento = 0;
    
    for(Funcionario i: funcionarios) {
        folhaDePagamento += i.calcularSalario();
        
        System.out.println("Nome: " + i.getNome() + " | Salario: R$ " + i.calcularSalario());
    }
    
        System.out.println("Folha de Pagamento: R$ " + folhaDePagamento);
    }
    
}
