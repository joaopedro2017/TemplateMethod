package model;

public abstract class Pessoa {

    private String nome;
    private double salarioBruto;
    private double beneficios;

    public abstract double calcularBeneficios();

    public abstract double calcularInss();

    public double calcularSalarioLiquido() {
        return calcularBeneficios() + calcularInss();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

}
