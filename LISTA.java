main.java

public class Main
{
	public static void main(String[] args) {
	No n;
	Lista l = new Lista();
	
	
	n = new No(5);
	l.insereNoFinal(n);
	n = new No(6);
	l.insereNoFinal(n);
		
	l.imprimeLista();	
		
	}
}

no.java

public class No{
    int dado;
    No proximo;
    
    
public No(int i){
    dado = i;
    proximo = null;
}

public void imprime(){
	   System.out.println("Atual: " + dado);
  
        
	  }
    
    
}    
    
LISTA.java

public class Lista{
    No inicio;
    
    
    
    
public Lista(){
    inicio = null;
}    
    
public void insereNoFinal(No aux){
    if (vazia()){
        inicio = aux;
    }
    else {
        No atual;
        atual = inicio;
        while (atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = aux;
    }
    
}   

public boolean vazia (){
    if (inicio == null){
        return true;
    }
    else{
        return false;
    }
}

public void imprimeLista (){
    No atual;
    atual = inicio;
    while(atual != null){
    atual.imprime();
    atual = atual.proximo;
    }
}

}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
