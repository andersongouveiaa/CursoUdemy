public class Programador extends Funcionarios{
    @Override
    public void aumentaSalario() {
        setSalario(getSalario()*1.2);
    }
}