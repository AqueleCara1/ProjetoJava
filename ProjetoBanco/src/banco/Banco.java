package banco;
import modelos.Conta;


public class Banco {
    
public static void main(String[] args){
    Conta a = new Conta("Conta 1");
    Conta b = new Conta("Conta 2");
    a.depositar(200);
    System.out.println(a.toString());
    a.sacar(50);
    System.out.println(a.toString());
    a.sacar(500);
    System.out.println(a.toString());
}

}
