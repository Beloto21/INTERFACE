package Interface;

// classe FuncionarioAssalariado com implemento 
public class FuncionarioAssalariado implements Funcionario {
	
	// atributo
  private double salario;

  // construtor da classe 
  public FuncionarioAssalariado(double salario) {
	  
  this.salario = salario;
  }

  // função para que calcula o bonus
  @Override
  public double calcularBonus() {
	  
  return 5000.00; 
  }
}
