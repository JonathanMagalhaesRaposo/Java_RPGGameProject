package Guerreiros;
public class GuerreiroNv1 extends Guerreiro{
    
    private boolean inteligencia = true;

    public boolean getInteligencia(){
        return inteligencia;
    }
    public void setInteligencia(Boolean inteligencia){
        this.inteligencia = inteligencia;
    }
    public void InfoGuerreiroNv1(){
        super.InfoGuerreiro();
        System.out.printf("Inteligencia.......: %b.%n", inteligencia);

    }

}
