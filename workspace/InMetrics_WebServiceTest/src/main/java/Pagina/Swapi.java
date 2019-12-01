package Pagina;

import Config.BaseTeste;

public class Swapi extends BaseTeste{
	
	public void CarregarPagina() throws Exception{
		
		MensagemAcesso();
		
	}
	
	public void CarregaLista(){
		
		
		try {
			PesquisarLista();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void Resultado(){
		
		
	}

}
