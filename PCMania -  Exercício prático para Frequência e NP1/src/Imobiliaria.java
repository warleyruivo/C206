public class Imobiliaria {

    //Construtor
    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    //Variaveis
    String nome;
    String telefone;
    String cidade;

    Apartamento[] apartamento = new Apartamento[30];

    void addApartamento(Apartamento apto) {
        for (int i = 0; i < apartamento.length; i++) {
            if(apartamento[i] == null)
                apto = apartamento[i];
        }
    }

    void ajustaAluguel() {
        for (int i = 0; i < apartamento.length; i++) {
            if(apartamento[i] != null)
                apartamento[i].aluguel += apartamento[i].aluguel * 0.05;
        }
    }

    int mediaArea() {
        double media = 0;
        for (int i = 0; i < apartamento.length; i++) {
            if (apartamento[i] != null)
                if (apartamento[i].numQuartos <= 2) {
                    media = apartamento[i].area / apartamento[i].numQuartos;
            }
        }
        return (int) media;
    }


    void mostraInfo()
    {
        System.out.println("Nome da imobiliaria: "+nome);
        System.out.println("Telefone da imobiliaria: "+telefone);
        System.out.println("Cidade da imobiliaria: "+cidade);
    }
}