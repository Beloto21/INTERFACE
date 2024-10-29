package Interface;

// classe Main que testa as implementações
public class Main {
	
  public static void main(String[] args) {
	  
      // Fazendo o Funcionário Assalariado
      Funcionario funcionarioAssalariado = new FuncionarioAssalariado(1714);
      
      System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());

      // Fazendo o Funcionário Horista
      Funcionario funcionarioHorista = new FuncionarioHorista(2410);
      
      System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
  }
}