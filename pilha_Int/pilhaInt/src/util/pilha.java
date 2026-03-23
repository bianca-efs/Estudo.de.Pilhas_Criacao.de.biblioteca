package util;

public class pilha {
	No topo;
	public boolean pilhaVazia ( ) {
		return topo == null;
	}
	
	public void push (int e) {
		No elemento = new No();
		elemento.dado = e;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop ( ) {
		if (pilhaVazia()) {
			throw new RuntimeException("Não há elementos para desempilhar");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top ( ) {
		if (pilhaVazia()) {
			throw new RuntimeException("Não há elementos na pilha");
		}
		return topo.dado;
	}
	
	public int tamanho() {
	    int cont = 0;
	    No aux = topo;

	    while (aux != null) {
	        cont++;
	        aux = aux.proximo;
	    }

	    return cont;
	}
	
	public int max() {
		
		if (pilhaVazia()) {
	        throw new RuntimeException("Pilha vazia");
	    }
		
		pilha aux = new pilha();
		int maior = pop();
		aux.push(maior);
		
		while (!pilhaVazia()) {
			
			int vlr = pop();
			
			if (vlr > maior) {
				maior = vlr;
			}
			
			aux.push(vlr);
		}
		
		while (!aux.pilhaVazia()) {
			
			push(aux.pop());
		}
		
		
		return maior;	
		
	}
	
}
