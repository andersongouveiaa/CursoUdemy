import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionarios funcionario1 = new Gerente();
        Funcionarios funcionario2 = new Programador();

        funcionario1.setNome("Renato");
        funcionario1.setSalario(10000.00);

        funcionario2.setNome("Rodrigo");
        funcionario2.setSalario(10000.00);

        ArrayList <Funcionarios> funcionarios= new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        for(Funcionarios f : funcionarios){
            System.out.println(f);
            f.aumentaSalario();
            System.out.println(f);
        }

    }
}