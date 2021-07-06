package utils;

import model.Atendimento;
import model.SenhaTipo;
import java.util.Random;
/**
 * @author Jefferson
 **/
public class Utils {
    public static String[] nomes = {"CHUCK","SARAH","JOHN","ELLEN","DEVON","MORGAN"};
    public static Atendimento[] atendimento = {
        new Atendimento("009", "CHUCK BARTOWISK", SenhaTipo.PADRAO),
        new Atendimento("011", "SARAH WALKER", SenhaTipo.PRIORITARIA),
        new Atendimento("007", "JOHN CASEY", SenhaTipo.PADRAO),
        new Atendimento("006", "ELLEN BARTOWISK", SenhaTipo.PRIORITARIA),
        new Atendimento("008", "DEVON WOODCOMB", SenhaTipo.PADRAO),
        new Atendimento("010", "MORGAN GRIMES", SenhaTipo.PRIORITARIA),   
    };
    
    public static int rdn(int max) {
        return rdn(0, max);
    }
    
    public static int rdn(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
