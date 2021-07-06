package utils;

/**
 * @author Jefferson
 **/
import model.Atendimento;
import java.util.Comparator;

public class AtendimentoComparator {
    public static Comparator<Atendimento> byNome() {
        return new Comparator<Atendimento>() {
            @Override
            public int compare(Atendimento o1, Atendimento o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };
    }

    public static Comparator<Atendimento> byCpf() {
        return new Comparator<Atendimento>() {
            @Override
            public int compare(Atendimento o1, Atendimento o2) {
                return o1.getCpf().compareTo(o2.getCpf());
            }
        };
    }

    public static Comparator<Atendimento> byPlano() {
        return new Comparator<Atendimento>() {
            @Override
            public int compare(Atendimento o1, Atendimento o2) {
                return o1.getTipo().compareTo(o2.getTipo());
            }
        };
    }
}
