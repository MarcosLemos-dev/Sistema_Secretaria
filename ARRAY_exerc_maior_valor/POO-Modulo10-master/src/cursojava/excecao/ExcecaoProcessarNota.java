package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception{
 public ExcecaoProcessarNota(String erro) {// construi o construtor da classe filha passa o parametro erro 
	// TODO Auto-generated constructor stub
	 super(erro);//este construtor esta passando para o construtor da classe exception
}
}
