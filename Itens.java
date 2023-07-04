import java.util.Scanner;
import Guerreiros.Guerreiro;
import Magos.Mago;

public class Itens {

    Scanner scanner = new Scanner(System.in);

    Guerreiro guerreiro = new Guerreiro();
    Mago mago =new Mago();
    Combates combates = new Combates();
    Historia historia = new Historia();

    public static int dinheiro = 200;
    private int defesa = 50;//Este item custa $50
    private int ataquefisico = 5;//Este item custa $50
    private int ataquemagico = 10;//Este item custa $50
    private String loja ="Escolha o numero da opção desejada:\n1-Aumenta a sua vida em 50. Este item custa $50.\n2-Aumenta o seu ataque fisico em 5. Este item custa $50.\n3-Aumenta a vida do mago em 50. Este item custa $50.\n4-Aumenta o ataque mágico do mago em 10. Este item custa $50.\n";

    public void ItemDefesaGuerreiro(){
        dinheiro = dinheiro - 50;
        if(dinheiro <= 0){
            dinheiro = 0;
            System.out.println("Não é possível adquirir o item com o dinheiro disponível.");
            System.out.println("Digite 2 para iniciar o combate!");
        }else{
            Guerreiro.vida = Guerreiro.vida + defesa;
            System.out.printf("A sua vida aumentou para: %d%n", guerreiro.getVida());
            System.out.printf("Quer comprar outro item?\nVocê possui %d em dinheiro.\nDigite o número desejado:\n1- Sim, quero comprar outro item.\n2- Não, quero ir para o combate!%n",dinheiro);
        }
    }

    public void ItemAtaqueFisico(){
        dinheiro = dinheiro - 50;
        if(dinheiro <= 0){
            dinheiro = 0;
            System.out.println("Não é possível adquirir o item com o dinheiro disponível.");
            System.out.println("Digite 2 para iniciar o combate!");
        }else{
            Guerreiro.valorataquefisico = Guerreiro.valorataquefisico + ataquefisico;
            System.out.printf("O seu ataque fisico aumentou para %d%n", guerreiro.getValorAtaqueFisico());
            System.out.printf("Quer comprar outro item?\nVocê possui %d em dinheiro.\nDigite o número desejado:\n1- Sim, quero comprar outro item.\n2- Não, quero ir para o combate!%n",dinheiro);
        }
    }

    public void ItemDefesaMago(){
        dinheiro = dinheiro - 50;
        if(dinheiro <= 0){
            dinheiro = 0;
            System.out.println(("Não é possível adquirir o item com o dinheiro disponível."));
            System.out.println("Digite 2 para iniciar o combate!");
        }else{
            Mago.vida = Mago.vida + defesa;
            System.out.printf("A vida do mago aumentou para %d%n", mago.getVida());
            System.out.printf("Quer comprar outro item?\nVocê possui %d em dinheiro.\nDigite o número desejado:\n1- Sim, quero comprar outro item.\n2- Não, quero ir para o combate!%n",dinheiro);
        }
    }

    public void ItemAtaqueMagico(){
        dinheiro = dinheiro - 50;
        if(dinheiro <= 0){
            dinheiro=0;
            System.out.println(("Não é possível adquirir o item com o dinheiro disponível."));
            System.out.println("Digite 2 para iniciar o combate!");
        }else{
            Mago.valorataquemagico = Mago.valorataquemagico + ataquemagico;
            System.out.printf("O ataque magico do mago aumentou para %d%n", mago.getValorAtaqueMagico());
            System.out.printf("Quer comprar outro item?\nVocê possui %d em dinheiro.\nDigite o número desejado:\n1- Sim, quero comprar outro item.\n2- Não, quero ir para o combate!%n",dinheiro);
        }
    }

    public void EscolherItensLoja(){
        int resposta = scanner.nextInt();;
        if(resposta != 1 && resposta != 2 && resposta !=3 && resposta !=4){
            System.out.println("Número inválido! Digite o número correspondente ao desejado:");
            System.out.println(loja);
            EscolherItensLoja();
        }
        if(resposta == 1){
            ItemDefesaGuerreiro();   
            int resposta1 = scanner.nextInt();
            while (resposta1 != 1 && resposta1 != 2){ 
                System.out.println("Opção inválida! Digite uma opção válida.");
                System.out.print(historia.menu1);
                System.out.printf("Você possui %d em dinheiro.%n",dinheiro);
                System.out.print(historia.menu2);
                resposta1 = scanner.nextInt();
            }
            if(resposta1 == 1){
                System.out.println(loja);
                EscolherItensLoja();
            }
        }
        if(resposta == 2){
            ItemAtaqueFisico();
            int resposta2 = scanner.nextInt();
            while (resposta2 != 1 && resposta2 != 2){ 
                System.out.println("Opção inválida! Digite uma opção válida.");
                System.out.print(historia.menu1);
                System.out.printf("Você possui %d em dinheiro.%n",dinheiro);
                System.out.print(historia.menu2);
                resposta2 = scanner.nextInt();
            }          
            if(resposta2 == 1){
                System.out.println(loja);
                EscolherItensLoja();
            }
        }
        if(resposta == 3){
            ItemDefesaMago();
            int resposta3 = scanner.nextInt();
            while (resposta3 != 1 && resposta3 != 2){ 
                System.out.println("Opção inválida! Digite uma opção válida.");
                System.out.print(historia.menu1);
                System.out.printf("Você possui %d em dinheiro.%n",dinheiro);
                System.out.print(historia.menu2);
                resposta3 = scanner.nextInt();
            }
            if(resposta3 == 1){
                System.out.println(loja);
                EscolherItensLoja();
           }
        }
        if(resposta == 4){
            ItemAtaqueMagico();
            int resposta4 = scanner.nextInt();
            while (resposta4 != 1 && resposta4 != 2){ 
                System.out.println("Opção inválida! Digite uma opção válida.");
                System.out.print(historia.menu1);
                System.out.printf("Você possui %d em dinheiro.%n",dinheiro);
                System.out.print(historia.menu2);
                resposta4 = scanner.nextInt();
            }
            if(resposta4 == 1){
                System.out.println(loja);
                EscolherItensLoja();
            }
        }
                        
    }

    public int getDinheiro(){
        return dinheiro;
    }

    public String getLoja(){
        return loja;
    }
   
}
