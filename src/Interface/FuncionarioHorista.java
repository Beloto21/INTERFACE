package Interface;

// classe FuncionarioHorista que implementa a interface do funcionario
public class FuncionarioHorista implements Funcionario {
	
	// atributos da classe 
  private double totalAnualRecebido;

  // construtor da classes 
  public FuncionarioHorista(double totalAnualRecebido) {
	  
   this.totalAnualRecebido = totalAnualRecebido;
  }

  // função que calcula o bonus
  @Override
  public double calcularBonus() {
	  
   return totalAnualRecebido * 0.10; // aqui sao os 10% do total anual recebido
  }
}