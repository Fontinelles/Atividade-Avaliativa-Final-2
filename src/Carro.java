import java.util.ArrayList;
import java.util.Scanner;
class Carro extends Veiculo {
    private double km;

    public Carro(String n, double p, double k) {
        super(n, p);
        km = k;
    }

    @Override
    public double getPreco() {
        return (km > 100000) ? super.getPreco() * 0.92 : super.getPreco();
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o modelo do carro:");
        modelo = scanner.next();
        System.out.println("Informe a quilometragem do carro:");
        km = scanner.nextDouble();
        System.out.println("Informe o preço do carro:");
        preco = scanner.nextDouble();
    }
}