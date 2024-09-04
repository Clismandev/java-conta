
public class aula05 {

	public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco ();
      p1.setNumConta(2222);
      p1.setDono("Hernanes");
      p1.abrirConta("CC");
      
      ContaBanco p2 = new ContaBanco ();
      p2.setNumConta(5555);
      p2.setDono("Mariana");
      p2.abrirConta("CP");
      
      p1.depositar(100);
      p2.depositar(500);
      p2.sacar(100);
      
      p1.sacar(150);
      p1.fecharConta();
      
      p1.estadoAtual();
      p2.estadoAtual();
	}

}
