package Magos;
import java.util.Random;
public class Mago {
    
    Random random = new Random();

    public static int valorataquemagico = 40;
    private int ataquemagico = random.nextInt(valorataquemagico);
    public static int vida = 150;

    public int getAtaquemagico(){
        return ataquemagico;
    }
    public void setAtaquemagico(int ataquemagico){
        this.ataquemagico = ataquemagico;
    }
    public int getVida(){
        if(vida < 0){
            vida = 0;
        }
        return vida;
    }
    public int getValorAtaqueMagico(){
        return valorataquemagico;
    }
    public void InfoMago(){
            System.out.println("Dados do mago:");
            System.out.printf("Vida...............: %d.%n", vida);
            System.out.printf("Ataque físico......: %d.%n", valorataquemagico);
            System.out.println("Destreza...........: 0");
        }
}
