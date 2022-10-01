import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Criar lista

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "amarelo"));
            add(new Gato("Jon", 12, "marrom"));
        }};

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);
        System.out.println("Ordem Aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem Natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem por Idade: ");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("Ordem por Cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordenar por Nome, Cor e Idade: ");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements  Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0)return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());

        /*int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());

        if(nome != 0){
            return nome;
        }else if (cor != 0){;
            return cor;
        }else{
            return Integer.compare(gato1.getIdade(), gato2.getIdade());
        }*/






    }
}
