/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerencia.banco;

import java.util.Scanner;


class contaBancaria{
    public String nome;
    public String sobrenome;
    public String cpf;
    public double saldo;

    
    public contaBancaria (String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    
    public double consultaSaldo(){
    return saldo;
    }
    public void depositar (double valor){
        saldo += valor;
        System.out.println("Deposito de R$ +" + valor + "realizado com Sucesso");
    }
    
    public void sacar (double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("saque realizado com sucesso");
        } else {
            System.out.println("saldo insulficiente para realizar o saque");
        }
    }
    
    public void exibirMenu(){
        Scanner scanner = new Scanner (System.in);
        int opcao;
        
        do {
            System.out.println("\n-----Menu-----");
            System.out.println("1. consulta saldo");
            System.out.println("2. Realizar o Deposito");
            System.out.println("3. Realizar o saque");
            System.out.println("4. Encerrar");
            System.out.println("Qual opção que voce Deseja escolher:");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1:
                  System.out.println("saldo R$ " + consultaSaldo());
                  break;
                
                case 2:
                  System.out.println("Digiter o valor do deposito");
                  double valorDeposito = scanner.nextDouble();
                  depositar(valorDeposito);
                  break;
                  
                case 3:
                  System.out.println("Digiter o valor do saque");
                  double valorSaque = scanner.nextDouble();
                  sacar(valorSaque);
                  break;

                case 4:
                  System.out.println("Encerrando");
                  break;
                  
                  default:
                    System.out.println("Opção errada");
            }      
            
        } while (opcao != 4);
        
        scanner.close();
        
    }

}

public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Seija Bem-vindo ao sistema bancario");
        
        System.out.println("Qual e o teu nome");
        String nome = Scanner.nextLine();
        
         System.out.println("Qual e o teu sobrenome");
        String sobrenome = Scanner.nextLine();
        
         System.out.println("Qual e o teu CPF");
        String cpf = Scanner.nextLine();
        
        contaBancaria conta = new contaBancaria(nome, sobrenome, cpf);
        
        conta.exibirMenu();
        
        System.out.println("Obrigado por acreditar do nosso serviço");
        Scanner.close();
    }
   
}
