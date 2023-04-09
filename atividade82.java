


// programa de soluções computacionais.
// Lista 2 ( atividade 8, segunda lista)
//Aluno: João Victor Maia Leite
//RA: 323124931


import java.util.Scanner;

public class atividade82 {
    public static void main(String[] args) throws Exception {
        
// Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7


Scanner input = new Scanner(System.in);

System.out.println("Digite altura");
double altura = input.nextDouble();

// altura homem

double pesoideal1 = (72.7*altura) - 58 ; 

System.out.println("Peso ideal"+ pesoideal1);

// altura mulher 

double pesoideal2 = (62.1*altura) - 44.7; 

System.out.println("peso ideal da mulher" + pesoideal2);

}

}







        
    