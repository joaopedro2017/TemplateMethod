package model;

public class Desenvolvedor extends Pessoa {

    @Override
    public double calcularBeneficios() {
        return super.getBeneficios() * 0.90;
    }

    @Override
    public double calcularInss() {
        return super.getSalarioBruto() * 0.92;
    }

}
