import java.util.ArrayList;
import java.util.Scanner;
public class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String m, double p) {
        modelo = m;
        preco = p;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }
}
