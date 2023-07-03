package Bosses;
public class Boss2 extends Boss1 {

    private int armadura = 100;
    
    public int getBossArmadura(){
        if(armadura < 0){
            armadura = 0;
        }
        return armadura;
    }
    public void setBossArmadura(int armadura){
        this.armadura = armadura;
    }
    public void InfoBoss2(){
        System.out.println("Dados do Monstro:");
        System.out.printf("Vida...............: %d.%n", vida = 600);
        System.out.printf("Ataque físico .....: %d.%n", valorataquefisico = 60);
        System.out.printf("Destreza...........: %d.%n", destreza = 10);
        System.out.printf("Armadura...........: %d.%n%n", armadura);
    }
}