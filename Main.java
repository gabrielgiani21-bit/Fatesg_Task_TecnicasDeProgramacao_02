
package locadorabicicleta;

public class LocadoraBicicleta {

       private String marca;

       private String modelo;

       private String cor;

       private double velocidade;

       private boolean alugada;

       

       public LocadoraBicicleta(String marca, String modelo, String cor, double velocidade, boolean alugada) {

       this.marca = marca;

       this.modelo = modelo;

       this.cor = cor;

       this.velocidade = velocidade;

       this.alugada = alugada;                

       

       }       

       

       public void alugar(){

           if (!alugada) { 

               alugada = true;

               System.out.println("A bicicleta " + modelo + " foi alugada");

           }else{

               System.out.println("A bicicleta " + modelo + " não foi alugada");

           }

       }   

       

       public void devolver(){

           if (alugada) {

               alugada = true;

               System.out.println("A bicicleta " + modelo + " foi devolvida");

           }

       }

       

       public void velocidadeAtual (double incremento) {

           this.velocidade += incremento;

           System.out.println("A velocidade atual da " + modelo + " é " + velocidade + "km/hr");

       }

       

       

       public static void main(String [] args) {

          LocadoraBicicleta bike1 = new LocadoraBicicleta( "A", "1", "preta", 5.5, true);

          LocadoraBicicleta bike2 = new LocadoraBicicleta( "B", "2", "vermelha", 0.0, false);

          

          System.out.println("-teste1-");

          bike1.alugar();

          bike1.velocidadeAtual(5.5);

          

          System.out.println("-teste2");

          bike2.alugar();

          bike2.devolver();

       }

} 

