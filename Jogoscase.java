/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogoscase;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Jogoscase {

    public static void main(String[] args) {
       // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibe mensagem solicitando a entrada do usuário
       
        System.out.println("       JOGOS FAVORITOS");
        
        System.out.println("1 - God of War");
        System.out.println("2 - Doom");
        System.out.println("3 - Fortnite");
        System.out.println("4 - Call Of Duty");
        System.out.println("5 - FIFA");
       
        System.out.print("Digite um número de 1 a 5: ");
        
        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();
        
       
        
        
        
        // Usa a estrutura switch-case para determinar o jogo correspondente
        switch (numero) {
            case 1:
                // Se o número for 1, exibe God of War
                System.out.println(" Jogo selecionado: God of War");
               
                break;
                
            case 2:
                // Se o número for 2, exibe Doom
                System.out.println(" Jogo selecionado: Doom");
               
                break;
                
            case 3:
                // Se o número for 3, exibe Fortnite
                System.out.println(" Jogo selecionado: Fortnite");
               
                break;
                
            case 4:
                // Se o número for 4, exibe Call Of Duty
                System.out.println(" Jogo selecionado: Call Of Duty");
                
                break;
                
            case 5:
                // Se o número for 5, exibe FIFA
                System.out.println(" Jogo selecionado: FIFA");
               
                break;
                
            default:
                // Se o número for diferente de 1 a 5, exibe mensagem de erro
                System.out.println(" Jogo inválido");
                System.out.println("   Por favor, digite apenas números de 1 a 5.");
        }
        
       
    }
}
    

