import java.util.Random;
import Bosses.Boss1;
import Bosses.Boss2;
import Guerreiros.Guerreiro;
import Guerreiros.GuerreiroNv1;
import Magos.Mago;
import Magos.MagoNv1;

public class Combates {

    Random random = new Random();
    Guerreiro guerreiro = new Guerreiro();
    GuerreiroNv1 guerreironv1 = new GuerreiroNv1();
    Boss1 boss1 = new Boss1();
    Boss2 boss2 = new Boss2();
    Mago mago = new Mago();
    MagoNv1 magonv1 = new MagoNv1();

    public void CombateBoss1(){
        int contador = 1;
        while(boss1.getBossVida() > 0 && (guerreiro.getVida() > 0 || mago.getVida() >0)){
            System.out.printf("O turno %d começou!%n", contador);
            contador++;
            mago.setAtaquemagico(random.nextInt(Mago.valorataquemagico));
            boss1.setBossAtaqueFisico(random.nextInt(Boss1.valorataquefisico));
            guerreiro.setAtaqueFisico(random.nextInt(Guerreiro.valorataquefisico));             
            if(guerreiro.getAtaqueFisico() <= boss1.getBossDestreza()){
                System.out.println("O Boss desviou do ataque!");
            }else{
                Boss1.vida = Boss1.vida - guerreiro.getAtaqueFisico();
                System.out.printf("A vida do Boss caiu para %d%n",boss1.getBossVida());
            }
            if(boss1.getBossAtaqueFisico() <= guerreiro.getDestreza()){
                System.out.println("O Herói desviou do ataque!");
            }else{
                Guerreiro.vida = Guerreiro.vida - boss1.getBossAtaqueFisico();
                System.out.printf("A vida do Herói caiu para %d%n",guerreiro.getVida());
            }
            Boss1.vida = Boss1.vida - mago.getAtaquemagico();
            System.out.printf("A vida do Boss caiu para: %d%n", boss1.getBossVida());
            Mago.vida = Mago.vida - boss1.getBossAtaqueFisico();
            System.out.printf("A vida do Mago caiu para: %d%n", mago.getVida());
        }
        if(boss1.getBossVida() > 0){
            System.out.println("\nO Boss venceu!");
            System.out.printf("A vida do Boss está: %d%n",boss1.getBossVida());
        }
        if(guerreiro.getVida() > 0){
            System.out.printf("\nParabens %s! Você venceu a batalha!%n%n",Guerreiro.nomeguerreiro);
            guerreiro.InfoGuerreiro();
        }else{
            System.out.println("Game over! Você morreu :(");
        }
        if(mago.getVida()> 0){
            System.out.println("\nSeu amigo mago sobreviveu!\n");
            mago.InfoMago();
        }else{
            System.out.println(("Seu amigo mago morreu! :("));
        }
    }

    public void CombateBoss2(){
        int contador = 1;
        while(boss2.getBossVida() > 0 && (guerreironv1.getVida() > 0 || magonv1.getVida() >0)){
            System.out.printf("O turno %d começou!%n", contador);
            contador++;
            magonv1.setAtaquemagico(random.nextInt(MagoNv1.valorataquemagico));
            boss2.setBossAtaqueFisico(random.nextInt(Boss2.valorataquefisico));
            guerreironv1.setAtaqueFisico(random.nextInt(Guerreiro.valorataquefisico));
            while(boss2.getBossArmadura() > 0){
                if(guerreironv1.getAtaqueFisico() <= boss2.getBossDestreza()){
                    System.out.println("O Boss desviou do seu ataque!");
                }else{
                    boss2.setBossArmadura(boss2.getBossArmadura() - guerreironv1.getAtaqueFisico());
                    System.out.printf("A armadura do Boss caiu para %d, devido ao seu ataque.%n",boss2.getBossArmadura());
                }
                if(boss2.getBossAtaqueFisico() <= guerreironv1.getDestreza()){
                    System.out.println("O Herói desviou do ataque!");
                }else{
                    GuerreiroNv1.vida = GuerreiroNv1.vida - boss2.getBossAtaqueFisico();
                    System.out.printf("A vida do Herói caiu para %d%n",guerreiro.getVida());
                }
                boss2.setBossArmadura(boss2.getBossArmadura() - magonv1.getAtaquemagico());
                System.out.printf("A armadura do Boss caiu para: %d, devido ao ataque mágico.%n", boss2.getBossArmadura());
                boss2.setBossArmadura(boss2.getBossArmadura() - magonv1.getAtaqueFogo());
                System.out.printf("A armadura do Boss caiu para: %d, devido ao ataque de fogo.%n", boss2.getBossArmadura());
                MagoNv1.vida = MagoNv1.vida - boss2.getBossAtaqueFisico();
                System.out.printf("A vida do Mago caiu para: %d%n", magonv1.getVida());
                if(boss2.getBossArmadura() == 0){
                    System.out.println("Vocês destruiram a armadura do Boss!");
                }
            }
            if(guerreironv1.getAtaqueFisico() <= boss2.getBossDestreza()){
                System.out.println("O Boss desviou do seu ataque!");
            }else{
                Boss2.vida = Boss2.vida - guerreironv1.getAtaqueFisico();
                System.out.printf("A vida do Boss caiu para %d, devido ao seu ataque.%n",boss1.getBossVida());
            }
            if(boss2.getBossAtaqueFisico() <= guerreironv1.getDestreza()){
                System.out.println("O Herói desviou do ataque!");
            }else{
                GuerreiroNv1.vida = GuerreiroNv1.vida - boss2.getBossAtaqueFisico();
                System.out.printf("A vida do Herói caiu para %d%n",guerreiro.getVida());
            }
            Boss2.vida = Boss2.vida - magonv1.getAtaquemagico();
            System.out.printf("A vida do Boss caiu para: %d, devido ao ataque mágico.%n", boss2.getBossVida());
            Boss2.vida = Boss2.vida - magonv1.getAtaqueFogo();
            System.out.printf("A vida do Boss caiu para: %d, devido ao ataque de fogo.%n", boss2.getBossVida());
            MagoNv1.vida = MagoNv1.vida - boss2.getBossAtaqueFisico();
            System.out.printf("A vida do Mago caiu para: %d%n", magonv1.getVida());
        }
        if(boss2.getBossVida() > 0){
            System.out.println("\nO Boss venceu!");
            System.out.printf("A vida do Boss está: %d%n",boss2.getBossVida());
        }
        if(guerreironv1.getVida() > 0){
            System.out.printf("\nParabens %s! Você venceu a batalha!%n%n",GuerreiroNv1.nomeguerreiro);
            guerreironv1.InfoGuerreiro();
        }else{
            System.out.println("Game over! Você morreu :(");
        }
        if(magonv1.getVida()> 0){
            System.out.println("\nSeu amigo mago sobreviveu!\n");
            magonv1.InfoMago();
        }else{
            System.out.println(("Seu amigo mago morreu! :("));
        }
    }
}
