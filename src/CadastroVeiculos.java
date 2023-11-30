// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;
public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Deseja inserir uma Moto (M) ou um Carro (C)?");
        char tipoVeiculo = scanner.next().charAt(0);

        if (tipoVeiculo == 'M' || tipoVeiculo == 'm') {
            System.out.println("Inserir dados para Moto:");
            Moto moto = new Moto("", 0, 0);
            moto.insertData();
            veiculos.add(moto);
        } else if (tipoVeiculo == 'C' || tipoVeiculo == 'c') {
            System.out.println("Inserir dados para Carro:");
            Carro carro = new Carro("", 0, 0);
            carro.insertData();
            veiculos.add(carro);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("\nRelatório de Veículos:");
        double totalPrecoAntes = 0;
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
            totalPrecoAntes += veiculo.getPreco();
            System.out.println("----------------------");
        }

        System.out.println("\nTotal de preços antes dos ajustes: " + totalPrecoAntes);

        // Ajustes
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getPreco() != veiculo.getPreco()) {
                    System.out.println("Moto reajustada!");
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getPreco() != veiculo.getPreco()) {
                    System.out.println("Carro ajustado!");
                }
            }
        }

        // Calcular novo total de preços após os ajustes
        double totalPrecoDepois = 0;
        for (Veiculo veiculo : veiculos) {
            totalPrecoDepois += veiculo.getPreco();
        }

        System.out.println("\nTotal de preços após os ajustes: " + totalPrecoDepois);
    }
}