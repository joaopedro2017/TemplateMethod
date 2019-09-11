package model;

public class Gerente extends Pessoa {

    @Override
    public double calcularBeneficios() {
        return super.getBeneficios() * 0.95;
    }

    @Override
    public double calcularInss() {
        return super.getSalarioBruto() * 0.88;
    }

}
