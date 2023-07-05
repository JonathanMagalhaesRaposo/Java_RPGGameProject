package Bosses;

import java.util.Random;

public class Boss1 {

    Random random = new Random();

    public static int vida = 300;
    public static int valorataquefisico = 20;
    protected int ataquefisico = random.nextInt(valorataquefisico);
    protected int destreza = 8;

    public int getBossAtaqueFisico() {
        return ataquefisico;
    }

    public void setBossAtaqueFisico(int ataquefisico) {
        this.ataquefisico = ataquefisico;
    }

    public int getBossVida() {
        if (vida < 0) {
            vida = 0;
        }
        return vida;
    }

    public int getBossDestreza() {
        return destreza;
    }

    public void setBossDestreza(int destreza) {
        this.destreza = destreza;
    }

}
