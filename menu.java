import java.time.LocalDateTime;
import java.util.*;

public class Menu 
{
	private ArrayList<Produtos> produtos = new ArrayList();
	private int opcao = 0;
	
	public void Processamento() 
  {
    		int valor;
   		int quant;
		String nome = "";
		int id;
		Scanner sc = new Scanner(System.in);
		char resposta = 'S';
		
	
		
		do 
     		{
			System.out.println("Digite a opção:");
			System.out.println("1- Incluir produto no carrinho: ");
			System.out.println("2- Adicionar produto ao carrinho: ");
			System.out.println("3- Listar o carrinho: ");
			System.out.println("4- Sair ");
				
			opcao = sc.nextInt();
				
			System.out.println("opção é: " + opcao);
				
			switch(opcao)
			{
				case 1:
					IncluirProduto();
					break;
				case 2:
					AdicionarProduto();
					break;
				case 3:
					ListarCarrinho();
					break;
					
				case 4:
					System.exit(0);
					break;
					
				default:
					System.out.println("Opção inválida!!!");
			}
				
				
			} while(opcao!=4);
				
					
	}
	public Boolean IncluirProduto() 
 	 {
		int valor;
		String nome="";
		int id;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		nome = sc.next();
		System.out.println("Digite o valor do produto (somente os numeros): ");
		valor = sc.next();
		System.out.println("Digite seu id: ");
		id = sc.next();
			
		Produto produto = new Produto(nome,id,valor);
			
		produtos.add(produto);
    		System.out.println("Produto incluido!");
		
		return true;
	}
	public Boolean AdicionarProduto()
	  {
		int quant;
    		int prodId;
    
	 	System.out.println("Digite o id do produto a ser adicionado ao carrinho:");
    		prodId=sc.next();
		if(buscarProduto()!=true)
		{
			System.out.println("Produto não existe!!Retornando ao menu");
			return false;
		}
		else
		{
			
		
			System.out.println("Digite a quantidade:");
			quant=sc.next();
			
		
		}
    
    		return true;
 	}

	public void ListarCarrinho() 
  	{
		
		
	}

}
