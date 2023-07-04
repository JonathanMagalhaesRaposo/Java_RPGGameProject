package Magos;

public class MagoNv1 extends Mago {

    private int ataquefogo = 50;

    public int getAtaqueFogo(){
        return ataquefogo;
    }

    public void setAtaqueFogo(int ataquefogo){
        this.ataquefogo = ataquefogo;
    }

    public void InfoMagoNv1(){
        super.InfoMago();
        System.out.printf("Ataque de fogo.....: %d.%n", vida);
    }  
}
