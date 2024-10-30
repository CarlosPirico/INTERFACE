package app;
import models.*;

public class Main {
    public static void main(String[] args) {
        // Instanciando objeto Funcionário Assalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado();
        System.out.println("Funcionário Assalariado");
        System.out.println("Bônus: R$ " + funcionarioAssalariado.calcularBonus() + "\n");

        // Instanciando objeto Funcionário Horista
        Funcionario funcionarioHorista = new FuncionarioHorista(50, 2000);
        System.out.println("Funcionário Horista");
        System.out.println("Bônus: R$ " + funcionarioHorista.calcularBonus() + "\n");
    }
}
