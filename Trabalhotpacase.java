/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhotpacase;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Trabalhotpacase {

    public static void main(String[] args) {
         // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibe mensagem solicitando a entrada do usuário
        
        System.out.println("   FRUTAS POR NÚMERO");
       
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Banana");
        System.out.println("3 - Mexerica");
        
        System.out.print("Digite um número de 1 a 3: ");
        
        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();
        
   
        // Usa a estrutura switch-case para determinar a fruta correspondente
        switch (numero) {
            case 1:
                // Se o número for 1, exibe Maçã
                System.out.println("Fruta correspondente: Maçã");
               
                break;
                
            case 2:
                // Se o número for 2, exibe Banana
                System.out.println("Fruta correspondente: Banana");
               
                break;
                
            case 3:
                // Se o número for 3, exibe Laranja
                System.out.println("Fruta correspondente: Laranja");
               
                break;
                
            default:
                // Se o número for diferente de 1, 2 ou 3, exibe mensagem de erro
                System.out.println("Fruta inválida");
                break;
                
        }
    }
}
