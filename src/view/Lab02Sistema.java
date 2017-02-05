/* Autor: André Xavier
 * Projeto: Laboratório 2
 */

package view;

import java.util.Scanner;
import model.Lab02ContaCorrente;

public class Lab02Sistema {
	
		static Scanner entrada = new Scanner(System.in);
		static Lab02ContaCorrente C1 = new Lab02ContaCorrente();
				
		public static void main(String[] args) {
									
			menu();
		}
     	public static void menu() {

			    System.out.println("|1 - Cadastramento |");
				System.out.println("|2 - Saque         |");
				System.out.println("|3 - Deposito      |");
				System.out.println("|4 - Imprimir      |");
				System.out.println("|9 - Fim           |");
								
				int numMenu;
				System.out.println("Digite o numero da função: ");
				numMenu = entrada.nextInt();
	
				switch (numMenu) {
					 case 1 :
						 execCadastramento();
						 break;
					 case 2:
						 execSaque();
	 					 break;
					 case 3:
						 execDeposito();
						 break;
					 case 4:
						 execImprimir();
						 break;
					 case 9:
						 System.out.println("!Fim!\n");
						 break;
					  default:
						 System.out.println("\n!Numero Incorreto!");
						 menu();
				
			}
			}

     	public static void execCadastramento(){
			
     				System.out.println("Digite o número da Agencia: ");
				    C1.setNumAge(entrada.nextInt());
				    System.out.println("Digite o número da Conta: ");
				    C1.setNumConta(entrada.nextInt());
				    System.out.println("Digite o Nome do Cliente: ");
				    C1.setNome(entrada.next());
				    System.out.println("Digite o Saldo Inicial: ");
				    C1.setSaldo(entrada.nextDouble());
				     
				    System.out.println("\nNumero da Agencia : "+ C1.getNumAge());
				    System.out.println("Numero da Conta   : "+ C1.getNumConta());
				    System.out.println("Nome do Cliente   : "+ C1.getNome());
				    System.out.println("Saldo             : "+ C1.getSaldo()+" \n");
				     
				    System.out.println("Confirma cadastramento (S/N): ");
								
				    String confirma = entrada.next();
				     
				    if (confirma.equals("S")||confirma.equals("s")){
				    
				    System.out.println("Cadastramento Realizado \n");
				    	 
				    }else{
				    System.out.println("Cadastramento Cancelado \n");
				     
			    	}	
				     
				    menu();
				     
					}
				     
 public static void execSaque(){
			
     				int numAgencia;
     				int numConta;
     				double saqueConta; 
									
					 System.out.println("Digite o número da Agencia: ");
				     numAgencia=entrada.nextInt();
				     System.out.println("Digite o número da Conta: ");
				     numConta=entrada.nextInt();
				     do {
				     System.out.println("Digite o Valor do Saque: ");
				     saqueConta = entrada.nextDouble();
				    } while (saqueConta <= 0.0);
				    
				    
				     
				     
				     System.out.println("Numero da Agencia : "+ numAgencia);
				     System.out.println("Numero da Conta   : "+ numConta);
				     System.out.println("Valor do Saque    : "+ saqueConta+" \n");
				     
				     System.out.println("Confirma o Saque (S/N): ");
								
				     String confirma = entrada.next();
				     
				     if (confirma.equals("S")||confirma.equals("s")){
				    	if(numAgencia==C1.getNumAge()&&numConta==C1.getNumConta()){
				    	C1.sacar(saqueConta);
				    	System.out.println("Saque Realizado \n");
				    	}else{
				    		System.out.println("Conta Inexistente \n");
				    	}
				     }else{
				    	 System.out.println("Saque Cancelado \n");
				     
			    	 }	
				     
				     menu();
				     
					}

public static void execDeposito(){
	
     					int numAgencia;
     					int numConta;
     					double depositoConta; 
							
			 System.out.println("Digite o número da Agencia: ");
		     numAgencia=entrada.nextInt();
		     System.out.println("Digite o número da Conta: ");
		     numConta=entrada.nextInt();
		     do {
			     System.out.println("Digite o Valor do Deposito: ");
			     depositoConta = entrada.nextDouble();
		    			} while (depositoConta <= 0.0);
		     
		     System.out.println("Numero da Agencia : "+ numAgencia);
		     System.out.println("Numero da Conta   : "+ numConta);
		     System.out.println("Valor do Deposito    : "+ depositoConta+" \n");
		     
		     System.out.println("Confirma o Deposito (S/N): ");
						
		     String confirma = entrada.next();
		     
		     if (confirma.equals("S")||confirma.equals("s")){
		    
		    	 if(numAgencia==C1.getNumAge()&&numConta==C1.getNumConta()){
				    	C1.depositar(depositoConta);
				    	System.out.println("Deposito Realizado \n");
				    	
				    	}else{
				    		System.out.println("Conta Inexistente \n");
				    	}
		    		    	 
		     }else{
		    	 System.out.println("Deposito Cancelado \n");
		     
	    	 }	
		     
		     menu();
		     
			}			
     				public static void execImprimir(){
     					C1.imprimir();
     					menu();
     				}
    						
}