package Guerreiros;
import java.util.Random;

public class Guerreiro {

    Random random = new Random();

    public static String nomeguerreiro;
    public static int vida = 200;
    public static int valorataquefisico = 20;
    private int ataquefisico = random.nextInt(valorataquefisico);
    private int destreza = 10;
        
    public String getNomeGuerreiro(){
        return nomeguerreiro;
    }

    public int getAtaqueFisico(){
        return ataquefisico;
    }

    public void setAtaqueFisico(int ataquefisico){
        this.ataquefisico = ataquefisico;
    }

    public int getVida(){
        if(vida < 0){
            vida = 0;
        }
        return vida;
    }

    public int getDestreza(){
        return destreza;
    }

    public int getValorAtaqueFisico(){
        return valorataquefisico;
    }

    public void InfoGuerreiro(){
        System.out.printf("Dados do %s:%n",nomeguerreiro);
        System.out.printf("Vida...............: %d.%n", vida);
        System.out.printf("Ataque físico .....: %d.%n", valorataquefisico);
        System.out.printf("Destreza...........: %d.%n", destreza);
    }
}


    

