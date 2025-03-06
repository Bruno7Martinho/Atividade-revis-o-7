/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro carro = new Carro();

        // Solicitando e definindo o modelo do carro
        System.out.print("Digite o modelo do carro: ");
        carro.setModelo(ler.nextLine());

        // Solicitando e definindo o consumo do carro em km por litro
        System.out.print("Digite o consumo do carro (km por litro): ");
        carro.setConsumoPorKm(ler.nextDouble());

        // Solicitando a distância da viagem
        System.out.print("Digite a distância da viagem (em km): ");
        double distancia = ler.nextDouble();

        // Solicitando o preço do combustível
        System.out.print("Digite o preço do combustível (em R$ por litro): ");
        double precoCombustivel = ler.nextDouble();

        // Calculando o consumo total e o custo da viagem
        double consumoTotal = carro.calcularConsumoTotal(distancia);
        double custoViagem = carro.calcularCustoViagem(distancia, precoCombustivel);

        // Exibindo os resultados
        System.out.println("\n--- Resultados da Viagem ---");
        System.out.println("Modelo do Carro: " + carro.getModelo());
        System.out.println("Consumo total de combustível (litros): " + consumoTotal);
        System.out.println("Custo total da viagem (R$): " + custoViagem);
    }
    
}
