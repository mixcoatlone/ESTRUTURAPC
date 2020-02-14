
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRUNO
 */
public class Comidas {
 
    public enum Bebidas {

        PEPSI("Pepsi", 4.0), SUCO("suco", 3.0), AGUA("agua", 3.5);

        private double preco;
        private String nome;

        public double getPreco() {
            return preco;
        }

        public String getNome() {
            return nome;
        }

        Bebidas(String nome, double preco) {
            this.preco = preco;
            this.nome = nome;
        }
    }
          public enum Comida {

        SANDUICHE("Sanduiche", 4.0), HOTDOG("HotDog", 3.0), XBURGER("X-Burger", 3.5);
        
        
        private String nome;
        private double preco;
        

        public double getPreco() {
            return preco;
        }

        public String getNome() {
            return nome;
        }

        private Comida(String nome,double preco ) {
            this.preco = preco;
            this.nome = nome;
        }
    }
    public static void menu(){

        System.out.println("\tBebidas");
        System.out.println("1."+Bebidas.PEPSI.getNome()+"R$"+Bebidas.PEPSI.getPreco());
        System.out.println("2."+Bebidas.SUCO.getNome()+"R$"+Bebidas.SUCO.getPreco());
        System.out.println("3."+Bebidas.AGUA.getNome()+"R$"+Bebidas.AGUA.getPreco());

        System.out.println("\tBebidas");
        System.out.println("4."+Comida.SANDUICHE.getNome()+"R$"+Comida.SANDUICHE.getPreco());
        System.out.println("5."+Comida.HOTDOG.getNome()+"R$"+Comida.HOTDOG.getPreco());
        System.out.println("6."+Comida.XBURGER.getNome()+"R$"+Comida.XBURGER.getPreco());

        System.out.println("0. Sair");
        System.out.println("Escolha sua opção: ");

        
        
      
    }

    public static double preco(int opcao){

        switch (opcao){

            case 1:
                return Bebidas.PEPSI.getPreco();
            case 2:
                return Bebidas.SUCO.getPreco();
            case 3:
                return Bebidas.AGUA.getPreco();
            case 4:
                return Comida.SANDUICHE.getPreco();
            case 5:
                return Comida.HOTDOG.getPreco();
            case 6:
                return Comida.XBURGER.getPreco();
                default:
                    return 0.0;

        }


    }

    public static void main(String[] args) {
     double tottal = 0.0;
     int opcao = 0;
     
     
       //Comida comida = Enum.valueOf(Comida.class,"SANDUICHE");
       //System.out.println(comida);
       
       //atraves do values recuperar todos os valores
       for(Comida com : Comida.values()){
           System.out.println(com);
       }
        
        Scanner entrada = new Scanner(System.in);
        do {
            menu();
            opcao = entrada.nextInt();
            tottal+=preco(opcao);
            System.out.println("Opçao escolhida: "+opcao);
            System.out.println("Valor de sua conta: "+tottal+"\n");


        }while (opcao != 0);
    }
}
