package banco;

import java.util.Scanner;

public class ProgramaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco banco;
		int opcao;
		
		System.out.println("Digite o número da Agencia:");
		int agencia = sc.nextInt();
		System.out.println("Nome do propriedario da conta:");
		String nome = sc.next();
		System.out.println("Tem deposito inicial:");
		System.out.println(" 1- SIM");
		System.out.println(" 2- Não");
		int resposta = sc.nextInt();
		if (resposta == 1) {
			System.out.println("Entre com o valor incial:");
			double saldoInicial = sc.nextDouble();
			banco = new Banco (agencia, nome, saldoInicial);
		}
		else {
			banco = new Banco (agencia, nome);
		}
		
		System.out.println("Dados da conta:");
		System.out.println(banco);
		
		do {
		System.out.println("\n1- Deposito");
		System.out.println("2- Saque");
		System.out.println("0- Sair");
		opcao = sc.nextInt();
		switch(opcao) {
		 
		case 1:
		System.out.println();
		System.out.println("Entre com o valor do deposito:");
		double depositoValor = sc.nextDouble();
		banco.deposito(depositoValor);
		System.out.print("Atualização dos dados da conta: ");
		System.out.println(banco);
		break; 
		
		case 2:
		System.out.println();
		System.out.println("Entre com o valor do saque:");
		double saqueValor = sc.nextDouble();
		if (saqueValor < banco.getSaldo()){
			System.out.println("Saldo insuficiente");
		}
		else {
		banco.saque(saqueValor);
		}
		System.out.print("Atualização dos dados da conta: ");
		System.out.println(banco);
		break;
		
		case 0: 
			System.out.println("Saindo do sistema!");
			break;
			
		default: 
			System.out.println("Opção invalida");
		break;
		
		   }
		}while(opcao != 0);
	}

}
