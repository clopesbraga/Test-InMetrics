package br.com.BaseTestes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CarregaConexaoWeb {
	

		private String [] produtorarray,diretorarray,filmearray,respostas;
		private int  i;
		private String resposta;
		private final String DIRETOR="George Lucas";
		private final String PRODUTOR="Rick McCallum";
		private final String USER_AGENT = "Mozilla/5.0";
		
		
		// METODO PARA BUSCAR NO SITE A LISTA DE FILMES
		public void sendGet() throws Exception {
		
			String url = "https://swapi.co/api/films/?format=json";
			 
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			con.setRequestMethod("GET");
	 
			//CHAMADA PARA INCLUS�O DO HEADER
			con.setRequestProperty("User-Agent", USER_AGENT);
	 
			int responseCode = con.getResponseCode();
			
			//CAMPO ONDE A VARIAVEL RESPOSTA RECEBE AS INFORMA��ES DA TELA 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			
			try{
				
				// JASON RECEBE A RESPOSTA 
				 JSONObject objJSON = new JSONObject(response.toString());
	                
				 	// SER� VERFICARDO TUDO QUE ESTIVER NO CAMPO "RESULTS"
	                JSONArray arrayListFilmes = objJSON.getJSONArray("results");
	                
	                //OS VALORES SER�O DIVIDAS ENTRE AS VARIAVEIS 
	                diretorarray  = new String[arrayListFilmes.length()];
	                produtorarray = new String[arrayListFilmes.length()];
	                filmearray    = new String[arrayListFilmes.length()];
	                
	                // CONDICIONAL QUE VERIFICA A ARRAY AT� ATINGIR O FINAL DELA
	                for (i = 0; i < arrayListFilmes.length(); i++) {
	                	
	                	diretorarray[i]  =  arrayListFilmes.getJSONObject(i).getString("director");
	                	produtorarray[i] =  arrayListFilmes.getJSONObject(i).getString("producer");
	                	filmearray[i]    =  arrayListFilmes.getJSONObject(i).getString("title");
	 	              
	                	/* SE OS VALORES FOREM COMPATIVEIS COM NOME DO DIRETOR E PRODUTOR
	                	   APARECER� O FILME EM QUE ELES TRABALHARAM*/
	                	if(diretorarray[i].equals(DIRETOR)&& produtorarray[i].equals(PRODUTOR)){
	                		
	                		System.out.println(resposta=filmearray[i].toString());
	                	}
	                   
	                 	                  
	                }
					            
	                
			}catch(JSONException e){
				
				e.printStackTrace();
				
			}
			
			
				//return resposta;
				
		}
}
		
    
