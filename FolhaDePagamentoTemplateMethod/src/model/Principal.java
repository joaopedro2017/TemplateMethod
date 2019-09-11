package model;

public class Principal {

    public static void main(String[] args) {

        Desenvolvedor gerente = new Desenvolvedor();
        gerente.setBeneficios(500);
        gerente.setSalarioBruto(800);

        System.out.println("Gerente salario Liquido: " + gerente.calcularSalarioLiquido());

    }

}
