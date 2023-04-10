package Projeto_cadastro;
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        //Receber e apresentar dados do cadastro de um produto com java scanner
        
        Scanner sc = new Scanner(System.in);
        System.out.println("^ Cadastro de produtos ^");
        System.out.println("Digite o nome do seu produto:");
        String nome = sc.nextLine();
        
        System.out.println("Digite a categoria do seu produto:");
        String categoria = sc.nextLine();
        
        System.out.println("Digite o preço do seu produto:");
        int preco = sc.nextInt();
        
        System.out.println("Nome digitado:" +nome
        +"\nCategoria: " +categoria
        +"\nPreço:" +preco + " reais");
        
    }
}