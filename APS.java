import java.util.Scanner;

public class APS {
    public static void main(String[] args) {
        int notaTotal = 0;
        int contador = 1;
        boolean trava = true;
        Scanner vox = new Scanner(System.in);

        System.out.println("-=-=Verificação de Cyber Segurança=-=-");
        System.out.println("Responda: '1' para SIM ou '2' para NÃO");
        System.out.println("     Vamos Seguir para o Quiz");

        while (trava) {
            int resposta;
            switch (contador) {
                case 1:
                    System.out.println("1-) Você usa a mesma senha para tudo? 1- SIM ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) notaTotal += 20; 
                    break;
                case 2:
                    System.out.println("2-) Você clica em links de desconhecidos? 1- SIM ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) notaTotal += 20; 
                    break;
                case 3:
                    System.out.println("3-) Seu e-mail tem verificação de duas etapas? 1- SIM ou 2-NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 1) notaTotal += 20;
                    break;
                case 4:
                    System.out.println("4-) Seu Firewall está sempre ligado?  1- Sim ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 1) notaTotal += 20; 
                case 5:
                    System.out.println("5-) Você frequenta sites não confiáveis? 1- SIM ou 2 NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) notaTotal += 20; 
                    trava = false; 
                    break;
                default:
                    trava = false;
                    break;
            } 
            contador++; //ISSO AQ FELIPE FAZ O CONTADOR FUNCIONAR, PEGUEI DE BASE O SLIDE DO SLIDE ESTRUTURA DE REPETIÇÃO LA NO MODDLE (N SEI PQ TOU GRITANDO)
            //POR EXEMPLO FAZ O IF DE CADA CASE CALCULAR, TIPO RESPOSTA == 3, O CONTADOR FAZ O RESPOSTA == 2 ADICIONAR MAIS 1 POR ISSO QUE TEM 2 +(CONTADOR++)
            //INCLUSIVE SE VC VER TEM 2 ARQUIVOS ESSE QUE FOI EU Q FIZ E O OUTRO Q FOI O CHATGPT, USEI DO CHATGPT PRA COMPARAR
        }
        System.out.println(" =-=-=ANALISE DE CYBERSEGURANÇA=-=-=");
        System.out.println("NOTA DE SEGURANÇA: " + notaTotal + " pontos.");

        if (notaTotal >= 80) {
            System.out.println("STATUS: Segurança Alta. Está seguro dos hackers!");
        } else if (notaTotal >= 60) {
            System.out.println("STATUS: Segurança Média. Sua Segurança está no limite.");
        } else {
            System.out.println("STATUS: Segurança Baixa! CUIDADO RISCO DE SER HACKEADO.");
        }
        vox.close();
    }
}
