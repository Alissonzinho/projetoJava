// Alisson G. Scrok

package src;

import java.util.ArrayList;
import java.util.Scanner;


public class GerenciaMultas {
	static ArrayList<Condutor> listaCondutores = new ArrayList<Condutor>();
	static ArrayList<Veiculo> listaVeiculos  = new ArrayList<Veiculo>();
	static ArrayList<Multa>  listaMultas   = new ArrayList<Multa>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
				
		boolean sair = false;
        int escolha;
        
        while(!sair)   // loop para exibir o menu principal
        {
            menu();
            escolha = sc.nextInt();
            
            switch (escolha)
            {
                case 1:
                	// Cadastrar Veiculo
                	cadastrarVeiculo();
                    break;
                case 2:
                	// Cadastrar Condutor
                    cadastrarCondutor();
                    break;
                case 3:
                    // Emitir Multa
                	emitirMulta();
                    break;
                case 4:
                	// Listar Multas
                    listarMultas(listaMultas);
                    break;                                
                case 5:
                	//listar condutores
                	listarCondutores(listaCondutores);
                    break;
                case 6:
                	//listar veiculos
                	listarVeiculos(listaVeiculos);
                    break;
                default :
                    System.out.println("Opção invalida!");
                    break;
            }
        }
	}
	
	/* Exibe o menu da aplicação */
	public static void menu() {
		
        String displayMenu = "\n 1 - Cadastrar Veiculo " +
        					 "\n 2 - Cadastrar condutor           " + 
        					 "\n 3 - Emitir Multa     " +
        					 "\n 4 - Exibir Multas           " +
        					 "\n 5 - Exibir condutores           " +
        					 "\n 6 - Exibir veiculos           " +

        					 "\n 7 - Sair";
        
        System.out.println(displayMenu);
    }


	public static Veiculo cadastrarVeiculo() {
		Scanner sc = new Scanner(System.in);
		Veiculo veiculo;
		String fabricante;
		String modelo;		
		int ano;
		String placa;
		
			System.out.println("Digite o fabricante do veiculo: ");
			fabricante = sc.nextLine();						
			System.out.println("Digite o modelo do veiculo: ");
			modelo = sc.nextLine();		
			System.out.println("Digite o ano do veiculo: ");
			ano = sc.nextInt();
			System.out.println("Digite a placa do veiculo: ");
			placa = sc.nextLine();	
		
			veiculo = new Veiculo(fabricante,modelo, ano, placa);
			listaVeiculos.add(veiculo);
			return veiculo;
	}

	public static void cadastrarCondutor() {
		Scanner sc = new Scanner(System.in);
		Condutor condutor;
		String nome;
		int idade;		
		String categoria;
		
		
			System.out.println("Digite o nome do condutor: ");
			nome = sc.nextLine();						
			System.out.println("Digite a idade do condutor: ");
			idade = sc.nextInt();		
			System.out.println("Digite a categoria do condutor: ");
			categoria = sc.nextLine();	
			
			condutor = new Condutor(nome, idade, categoria);
			condutor.toString();	
			listaCondutores.add(condutor);
}			
	
	
	public static void emitirMulta() {	
		Scanner sc = new Scanner(System.in);
		String data;
		String hora;		
		String tipoInfracao;
		int pontos;
		Condutor condutor;
		String condutorNome;
		Multa multa;
		
			System.out.println("Digite a data da multa: ");
			data = sc.next();						

			System.out.println("Digite a hora da multa: ");
			hora = sc.next();		

			System.out.println("Digite o tipo de infra��o: ");
			tipoInfracao = sc.next();	
	
			System.out.println("Digite a quantidade de pontos na carteira: ");
			pontos = sc.nextInt();
			
			System.out.println("Digite o condutor: ");
			condutorNome = sc.next();
			
			System.out.println("Digite o fabricante do veiculo: ");
			condutorNome = sc.next();

			System.out.println("Digite o modelo: ");
			condutorNome = sc.next();

			Veiculo veiculo = cadastrarVeiculo();
			
			multa = new Multa(data,hora,tipoInfracao,pontos, condutorNome, veiculo);
			listaMultas.add(multa);
		}		
	
	public static void listarMultas(ArrayList<Multa> multas) {
		for (Multa multa : multas) {
			System.out.println(multa.toString());
		}
	}
	public static void listarCondutores(ArrayList<Condutor> condutores) {
		for (Condutor condutor : condutores) {
			System.out.println(condutor.toString());
		}
	}
	public static void listarVeiculos(ArrayList<Veiculo> veiculos) {
		for (Veiculo veiculo: veiculos) {
			System.out.println(veiculo.toString());
		}
	}
}
