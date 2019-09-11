package model;

public class Gerente {

    private String nome;
    private double salarioBruto;
    private double beneficios;

    public Gerente() {
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

    public double calcularBeneficios() {
        return getBeneficios() * 0.95;
    }

    public double calcularInss() {
        return getSalarioBruto() * 0.88;
    }

    public double calcularSalarioLiquido() {
        return calcularBeneficios() + calcularInss();
    }

}
