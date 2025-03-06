/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

/**
 *
 * @author 7
 */
public class Carro {
    private String modelo;
    private double consumoPorKm;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
    
    public double calcularConsumoTotal(double distancia) {
        return distancia / consumoPorKm;
    }
    public double calcularCustoViagem(double distancia, double precoCombustivel) {
        double consumoTotal = calcularConsumoTotal(distancia);
        return consumoTotal * precoCombustivel;
    }


}
