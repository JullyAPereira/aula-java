package listasimplesencadeada;

public class listasimples {

	nosimples primeiro, ultimo;
	int numeronos;
	listasimples(){
		primeiro = ultimo = null;
		numeronos = 0;
		
	}
	
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
}
