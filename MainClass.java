import java.util.Scanner;
import Bosses.Boss2;
import Guerreiros.Guerreiro;
import Guerreiros.GuerreiroNv1;
import Magos.Mago;

public class MainClass{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        Historia historia = new Historia();
        Combates combates = new Combates();
        Itens itens = new Itens();
        Guerreiro guerreiro = new Guerreiro();
        GuerreiroNv1 guerreironv1 = new GuerreiroNv1();
        Mago mago = new Mago();
        Boss2 boss2 = new Boss2();
        
        System.out.println("Olá bravo guerreiro! Diga-nos qual é o seu nome?");
        Guerreiro.nomeguerreiro = scanner.nextLine();

        System.out.print(historia.primeiroparagrafo);
        System.out.print(historia.segundoparagrafo);
        System.out.println("Informações dos personagens:\n");

        guerreiro.InfoGuerreiro();
        mago.InfoMago();

        System.out.printf("%nVocê possui %d em dinheiro.%n%n",itens.getDinheiro());
        System.out.print(historia.menu1);
        System.out.print(historia.menu2);
        
        int resposta;
        resposta = scanner.nextInt();

        while (resposta != 1 && resposta != 2){      
            System.out.println("Opção inválida! Digite uma opção válida.");
            System.out.print(historia.menu1);
            System.out.printf("Você possui %d em dinheiro.%n",itens.getDinheiro());
            System.out.print(historia.menu2);
            resposta = scanner.nextInt();
        }
        if(resposta == 1){
            System.out.println(itens.getLoja());
            itens.EscolherItensLoja();
        }

        combates.CombateBoss1();

        if(guerreiro.getVida() > 0){
            System.out.println("Você recebeu a recompensa de $200.\n");
            Itens.dinheiro += 200;
            System.out.printf("Você possui um total de $%d%n%n", Itens.dinheiro);
        }

        Guerreiro.valorataquefisico = 20;
        Guerreiro.vida = 200;
        Mago.valorataquemagico = 40;
        Mago.vida = 150;

        System.out.println("O efeitos dos itens acabaram e vocês se recuperaram dos danos da batalha.");
        
        System.out.print(historia.terceiroparagrafo);
        System.out.print(historia.quartoparagrafo);
        System.out.print(historia.quintoparagrafo);
        System.out.print(historia.sextoparagrafo);

        boss2.InfoBoss2();

        System.out.print(historia.menu1);
        System.out.print(historia.menu2);

        int resposta1;
        resposta1 = scanner.nextInt();

        while (resposta1 != 1 && resposta1 != 2){      
            System.out.println("Opção inválida! Digite uma opção válida.");
            System.out.print(historia.menu1);
            System.out.printf("Você possui %d em dinheiro.%n",itens.getDinheiro());
            System.out.print(historia.menu2);
            resposta1 = scanner.nextInt();
        }
        if(resposta1 == 1){
            System.out.println(itens.getLoja());
            itens.EscolherItensLoja();
        }

        combates.CombateBoss2();

        if(guerreironv1.getVida() > 0){
            System.out.println("Você recebeu a recompensa de $800.\n");
            Itens.dinheiro += 800;
            System.out.printf("Você possui um total de $%d%n%n", Itens.dinheiro);
        }      
        scanner.close();
    }   
}