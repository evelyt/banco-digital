
public class Main {

	public static void main(String[] args) {
		Cliente evely = new Cliente();
		
		evely.setNome("Evely Tereza");

		Conta cc = new ContaCorrente(evely);
		Conta poupanca = new ContaPoupanca(evely);
		Conta poupanca1 = new ContaPoupanca(evely);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		cc.transferir(8, poupanca1);
		
		poupanca.depositar(41);
		poupanca.transferir(50, poupanca1);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca1.imprimirExtrato();
	}

}
