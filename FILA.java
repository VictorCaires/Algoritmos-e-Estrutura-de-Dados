MAIN.java

public class Main
{
	
  public static void main(String[] args) {
    TadFilaPessoa f = new TadFilaPessoa();
    TadFilaPessoa idoso = new TadFilaPessoa();
    TadFilaPessoa naoidoso = new TadFilaPessoa();
    
    Pessoa p = new Pessoa(82, 'M', "Vince Carter(A)");
    Pessoa p2 = new Pessoa(68, 'M', "Neymar(B)");
    Pessoa p3 = new Pessoa(38, 'M', "Fred Mercury(E)");
    Pessoa p4 = new Pessoa(20, 'F', "James Harden(F)");
    Pessoa p5 = new Pessoa(72, 'M', "Ibrahimovic(C)");
    Pessoa p6 = new Pessoa(52, 'M', "Vin Diesel(G)");
    Pessoa p7 = new Pessoa(37, 'M', "Lebron James(H)");
    Pessoa p8 = new Pessoa(32, 'M', "Stephen Curry(I)");
    Pessoa p9 = new Pessoa(43, 'F', "Michael Jordan(J)");
    Pessoa p10 = new Pessoa(62, 'M', "Muhammed Ali(D)");
    

    f.enfila(p);
    f.enfila(p2);
    f.enfila(p3);
    f.enfila(p4);
    f.enfila(p5);
    f.enfila(p6);
    f.enfila(p7);
    f.enfila(p8);
    f.enfila(p9);
    f.enfila(p10);
    f.desmembra(idoso,naoidoso);
  
                    
    while (idoso.conta() > 0 || naoidoso.conta() > 0){
       if (idoso.conta()>0) System.out.println(idoso.desenfila().nome);
       if (idoso.conta()>0) System.out.println(idoso.desenfila().nome);
       System.out.println(naoidoso.desenfila().nome);
       
       
   }


    }
}



TADFILAPESSOA.java

public class TadFilaPessoa{
    
    int fim;
    int inicio;
    int capacidade = 100;
    Pessoa dados[];

     
    public TadFilaPessoa(){
        this.fim = -1;
        this.inicio = -1;
        this.dados = new Pessoa[capacidade];
    }


	  public boolean enfila (Pessoa p) {
      if(!cheia()){
        fim++;
	      dados[fim] = p;
        return true;
      }
      return false;
	   }

   
    public Pessoa desenfila (){
      Pessoa p = null;
      if(!vazia()){
        inicio++;
        p = dados[inicio];
        }
      return p;
    }


    public void imprime () {
	    for (int i= inicio+1; i<=fim ; i++){
	        dados[i].imprime();
        }
	  }
      
    void desmembra(TadFilaPessoa idoso, TadFilaPessoa naoidoso){
        for (int i= inicio+1; i<=fim ; i++){
            if (dados[i].idade >= 60){
                idoso.enfila(desenfila());
            }else{
                
                naoidoso.enfila(desenfila());
            }  
        }
    }
      
    
	   public boolean cheia() {
	       return (fim == capacidade);
	   }

    
     public boolean vazia(){
       return (fim <= inicio);
     }

    
    public int conta(){
      return (fim - inicio);
    }
	
}

TPESSOA.java

class Pessoa{
    int idade;
    char sexo;
    String nome;


public Pessoa(int i, char s, String n){
    idade = i;
    sexo = s;
    nome = n;
    
}

void imprime(){
    System.out.println("Nome: "+nome+" Idade: "+idade+" Sexo: "+sexo);
    
 }
}






