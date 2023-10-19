import java.util.Date;

public class Produto()
{
  private int id;
  private int valor;
  private String nome;

  public Produto(int id,int valor,String nome)
  {
    this.id=id;
    this.valor=valor;
    this.nome=nome;
  }
  public String getNome()
  {
	return nome;
  }
 public int getId()
 {
	 return id;
 }
 public int getValor()
 {
	 return valor;
 }
  
}
