package br.com.ExcucaoTestes;



import br.com.BaseTestes.CarregaConexaoWeb;

public class TestListaFilmes {
	
	
	public static void main(String[] args) throws Exception {
 
		  // CHAMADO DO METODO
		  CarregaConexaoWeb carregaWeb = new CarregaConexaoWeb();
		
		  //IMPRIME O RESULTADO DO M�TODO NA TELA
		  carregaWeb.sendGet();
	
 
	}
	

}
