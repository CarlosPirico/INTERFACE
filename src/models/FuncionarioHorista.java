package models;

public class FuncionarioHorista implements Funcionario {
	private double salario;
    private int horasTrabalhadas;

    public FuncionarioHorista(double salarioPorHora, int horasTrabalhadas) {
        this.salario = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //Método calcula valor do bônus
    @Override
    public double calcularBonus() {
        double totalAnual = salario * horasTrabalhadas;
        return totalAnual * 0.10; 
    }
}
	