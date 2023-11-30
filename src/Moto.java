import java.util.ArrayList;
import java.util.Scanner;
class Moto extends Veiculo {
    private int ano;

    public Moto(String n, double p, int a) {
        super(n, p);
        ano = a;
    }

    @Override
    public double getPreco() {
        return (ano >= 2008) ? super.getPreco() * 1.1 : super.getPreco();
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o modelo da moto:");
        modelo = scanner.next();
        System.out.println("Informe o ano da moto:");
        ano = scanner.nextInt();
        System.out.println("Informe o preço da moto:");
        preco = scanner.nextDouble();
    }
}