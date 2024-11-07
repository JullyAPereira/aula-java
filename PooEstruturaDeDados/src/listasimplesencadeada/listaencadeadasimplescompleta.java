package listasimplesencadeada;
import javax.swing.JOptionPane;


public class listaencadeadasimplescompleta {

	nosimples primeiro, ultimo;
	int numeronos;
	
	listaencadeadasimplescompleta() {
		primeiro = ultimo = null;
		
	}
	
	//Procedimento insereNoFim
	void inserenofim (nosimples novono) {
		novono.prox = null;
		if (primeiro == null) {
			primeiro = novono;
		}
		if (ultimo != null) {
			ultimo.prox = novono;
			ultimo = novono;
			numeronos++;
		}
	}
	
	
	//Procedimento insereinicio
	void inserenoinicio (nosimples novono) {
		if (primeiro != null) {
			novono.prox = primeiro;
			primeiro = novono;
		}
		
		else if(primeiro == null) {
		primeiro = novono;
		ultimo = novono;
	}}
	
	void inserenoposicao(nosimples novono, int posicao) {
		nosimples tempono = primeiro;
		int numeronos = contarnos();
		int posaux;
		if (posicao == 0) {
			novono.prox = primeiro;
			if(primeiro == ultimo) {
				ultimo = novono;
			}
			primeiro = novono;
		} else if(posicao <= numeronos) {
			posaux = 1;
			while ((tempono != null)&&(posicao > posaux)) {
				tempono = tempono.prox;
				posaux++;
			}
			novono.prox = tempono.prox;
			tempono.prox = novono;
		}else if (posicao>numeronos) {
			ultimo.prox = novono;
			ultimo = novono;
		}
		
	}
	private int contarnos() {
		return 0;
		}
	
	//funcao buscar no
	nosimples buscano (int buscavalor) {
		int i = 0;
		nosimples tempono = primeiro;
		while (tempono != null) {
			if(tempono.valor == buscavalor) {
				JOptionPane.showMessageDialog( null, "no"+ tempono.valor + "posiçãp:"+i);
				return tempono;
			}
			i++;
			tempono =tempono.prox;
		
		}
		return null;
		
	}
	//Excluir
	void excluino (int valor) {
		nosimples tempono = primeiro;
		nosimples noanterior = null;
		
		while((tempono.prox != null)&&(tempono.valor != valor)) {
			noanterior = tempono;
			tempono = tempono.prox;
		}
	if(tempono.valor != valor) {
	System.out.println("valor nao encontrado ");
	
	}else if ((tempono!= null)&&(tempono!= ultimo)) {
		noanterior.prox = noanterior.prox.prox;
		tempono = noanterior;
		
	}else if (tempono==primeiro) {
		tempono = tempono.prox;
		primeiro = tempono;
	}else if (tempono == ultimo) {
		tempono = noanterior;
		tempono.prox = null;
		ultimo = tempono;
	}
	}
	
	//Exibir
	void exibeliste() {
		nosimples tempono = primeiro;
		int i = 0;
		while (tempono != null) {
			System.out.println("posicao:"+i +"valor:"+tempono.valor);
			tempono = tempono.prox;
			i++;
		}
				
	}
}
