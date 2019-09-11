/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author John Peter
 */
public class Estagiario extends Pessoa {

    @Override
    public double calcularBeneficios() {
        return super.getBeneficios() * 0.85;
    }

    @Override
    public double calcularInss() {
        return super.getSalarioBruto();
    }

}
