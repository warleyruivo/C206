import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Imobiliaria imobiliaria = new Imobiliaria("Pedrao","9999","SRS");

        Apartamento apartamento = new Apartamento();
        apartamento.numQuartos = 4;
        apartamento.area = 200;
        apartamento.aluguel = 600;
        apartamento.endereco = "Rua 123";

        Apartamento apartamento1 = new Apartamento();
        apartamento1.numQuartos = 1;
        apartamento1.area = 100;
        apartamento1.aluguel = 400;
        apartamento1.endereco = "Rua 122";

        imobiliaria.addApartamento(apartamento);
        imobiliaria.addApartamento(apartamento1);

        apartamento.mostraInfo();
        apartamento1.mostraInfo();

        imobiliaria.ajustaAluguel();

        imobiliaria.mediaArea();

        imobiliaria.mostraInfo();

    }
}