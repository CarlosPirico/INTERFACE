package models;

public class FuncionarioAssalariado implements Funcionario {
    @Override
    //Método calcula valor do bônus
    public double calcularBonus() {
        return 5000.00;
    }
}
 	