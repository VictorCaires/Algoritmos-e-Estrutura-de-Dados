MAIN.java

public class Main
{
	public static void main(String[] args) {
        TadPilha p = new TadPilha();
        String expressao = "53+4*";
        char aux;
        int a,b,resultado = 0;
        
        
        
        
   
        
        for(int i = 0; i < expressao.length(); i++){
            System.out.println(expressao.charAt(i));
            aux = expressao.charAt(i);

        if ((aux >= '0')&&(aux <= '9')){
            p.empilha(Character.getNumericValue(aux));
            
        
        }else{
            a = p.desempilha();
            b = p.desempilha();
            if (aux == '+') resultado = a+b;
            if (aux == '-') resultado = a-b;
            if (aux == '*') resultado = a*b;
            if (aux == '/') resultado = a/b;
            
            p.empilha(resultado);
            
        }
	 }//for
	 
	    resultado = p.desempilha();
	    System.out.println(expressao + " = " + resultado);
	}
}


TADPILHA.JAVA

public class TadPilha{
    int capacidade;
    int topo;
    int dados[];
    
    public boolean cheia(){
        return (capacidade == topo -1);    
    }    
    
   public void empilha (int d){
        if (!cheia ()){
            topo ++;
            dados[topo] =d;
        }
      }
      
    public TadPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
      
    }
    public TadPilha(){
        capacidade = 100;  
        topo = -1;
        dados = new int[100];
    }
    
    
    public void imprimir(){
        for(int i = 0; i<=topo; i++){
        System.out.println(dados[i]);
        }
    }
    public void imprimeAoContrario(){
       
        for(int i = topo; i >= 0 ; i--){
      
       
         System.out.println(dados[i]);
        }
    }
    

    public int desempilha (){
        int retorno = 0;
        if (!vazia ()){
            retorno = dados[topo];
            topo--;
        }
      return retorno;
    }
        public boolean vazia(){
        return (topo == -1);
    }
    
    
    
    
    
}


