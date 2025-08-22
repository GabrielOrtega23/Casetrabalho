/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diadasemana;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Diadasemana {

    public static void main(String[] args) {
       // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibe mensagem solicitando a entrada do usuário
       
        System.out.println("        DIAS DA SEMANA");
       
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");
        
        System.out.print("Digite um número de 1 a 7: ");
        
        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();
        
       
        
  
        
        // Usa a estrutura switch-case para determinar o dia da semana correspondente
        switch (numero) {
            case 1:
                // Se o número for 1, exibe Domingo
                System.out.println("📅 Dia correspondente: Domingo");
               
                break;
                
            case 2:
                // Se o número for 2, exibe Segunda-feira
                System.out.println("📅 Dia correspondente: Segunda-feira");
              
                break;
                
            case 3:
                // Se o número for 3, exibe Terça-feira
                System.out.println("📅 Dia correspondente: Terça-feira");
              
                break;
                
            case 4:
                // Se o número for 4, exibe Quarta-feira
                System.out.println("📅 Dia correspondente: Quarta-feira");
               
                break;
                
            case 5:
                // Se o número for 5, exibe Quinta-feira
                System.out.println("📅 Dia correspondente: Quinta-feira");
                
                break;
                
            case 6:
                // Se o número for 6, exibe Sexta-feira
                System.out.println("📅 Dia correspondente: Sexta-feira");
              
                break;
                
            case 7:
                // Se o número for 7, exibe Sábado
                System.out.println("📅 Dia correspondente: Sábado");
               
                break;
                
            default:
                // Se o número for diferente de 1 a 7, exibe mensagem de erro
                System.out.println("❌ Dia inválido");
                System.out.println("   Por favor, digite apenas números de 1 a 7.");
        }
        
        
    }
}
    

