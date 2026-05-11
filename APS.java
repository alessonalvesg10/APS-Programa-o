import java.util.Scanner;

public class APS {
    // Cores de texto
    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CIANO = "\u001B[36m";
    
    // Estilos
    public static final String NEGRITO = "\u001B[1m";
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int notaTotal = 0;
        int contador = 1;
        boolean trava = true;
        Scanner vox = new Scanner(System.in);
        
       // esse titulo maneiro eu fiz no site "TAAG"
        System.out.println(CIANO + "_________        ___.                    _________                                                       \r\n" + //
                        "\\_   ___ \\___.__.\\_ |__   ___________   /   _____/ ____   ____  __ ______________    ____   ____ _____   \r\n" + //
                        "/    \\  \\<   |  | | __ \\_/ __ \\_  __ \\  \\_____  \\_/ __ \\ / ___\\|  |  \\_  __ \\__  \\  /    \\_/ ___\\\\__  \\  \r\n" + //
                        "\\     \\___\\___  | | \\_\\ \\  ___/|  | \\/  /        \\  ___// /_/  >  |  /|  | \\// __ \\|   |  \\  \\___ / __ \\_\r\n" + //
                        " \\______  / ____| |___  /\\___  >__|    /_______  /\\___  >___  /|____/ |__|  (____  /___|  /\\___  >____  /\r\n" + //
                        "        \\/\\/          \\/     \\/                \\/     \\/_____/                   \\/     \\/     \\/     \\/ " + RESET);

        System.out.println("Responda: '1' para SIM ou '2' para NÃO");
        System.out.println("     Vamos Seguir para o Quiz");

        while (trava) {
            int resposta;
            switch (contador) {
                case 1:
                    System.out.println("1-) Você usa a mesma senha para tudo? 1- SIM ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) {
                        System.out.println(AZUL + NEGRITO + "O uso de senhas diferentes melhora a segurança de todas as suas contas" + RESET);
                        notaTotal += 20;
                    } else if (resposta == 1) {
                        System.out.println(VERMELHO + NEGRITO + "Cuidado o uso de senhas iguais pra inumeras contas compremete a segurança de todas suas contas" + RESET);
                    }
                    break;
                case 2:
                    System.out.println("2-) Você clica em links de desconhecidos? 1- SIM ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) { 
                        System.out.println(AZUL + NEGRITO + "O cuidado com links desconhecido e necessario pra manter seu sistema seguro" + RESET);
                    notaTotal += 20;
                    }else if (resposta == 1) {
                        System.out.println(VERMELHO + NEGRITO + "Cuidado clicar em links desconhecidos e um dos caminhos mais rapidos pra comprometer seu sistema" + RESET);
                    }
                    break;
                case 3:
                    System.out.println("3-) Seu e-mail tem verificação de duas etapas? 1- SIM ou 2-NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 1) {
                        System.out.println(AZUL + NEGRITO + "A verificação de duas etapas soma mais uma barreira de segurança ao seu email" + RESET);
                    notaTotal += 20;
                    } else if (resposta == 2) {
                        System.out.println(VERMELHO + NEGRITO + "A falta de verificação de duas etapas compromete a segurança plena do seu email" + RESET);
                    }
                    break;
                case 4:
                    System.out.println("4-) Seu Firewall está sempre ligado?  1- Sim ou 2- NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 1) {
                        System.out.println(AZUL + NEGRITO +"O Firewall e otimo pra monitorar o trafego de dados da sua Rede" + RESET);
                        notaTotal += 20; 
                    } else if (resposta == 2) {
                        System.out.println(VERMELHO + NEGRITO + "A falta de firewall compromete o trafego do seus dados e deixa seu sistema vulneravel" + RESET);  
                    }
                    break;
                case 5:
                    System.out.println("5-) Você frequenta sites não confiáveis? 1- SIM ou 2 NÃO");
                    resposta = vox.nextInt();
                    if (resposta == 2) {
                        System.out.println(AZUL + NEGRITO + "O trafego seguro pela internet e necessario para manter seu sistema limpo e seguro" + RESET); 
                        notaTotal += 20;
                    } else if (resposta == 1) {
                        System.out.println(VERMELHO + NEGRITO + "O trafego por sites não confiaves pode comprometer a segurança do seu sistema cuidado !!" + RESET);
                    }
                    trava = false; 
                    break;
                default:
                    trava = false;
                    break;
            } 
            contador++; //ISSO AQ FELIPE FAZ O CONTADOR FUNCIONAR, PEGUEI DE BASE O SLIDE DO SLIDE ESTRUTURA DE REPETIÇÃO LA NO MODDLE (N SEI PQ TOU GRITANDO)
            //POR EXEMPLO FAZ O IF DE CADA CASE CALCULAR, TIPO RESPOSTA == 3, O CONTADOR FAZ O RESPOSTA == 2 ADICIONAR MAIS 1 POR ISSO QUE TEM 2 +(CONTADOR++)
            //INCLUSIVE SE VC VER TEM 2 ARQUIVOS ESSE QUE FOI EU Q FIZ E O OUTRO Q FOI O CHATGPT, USEI DO CHATGPT PRA
        }
        System.out.println(" =-=-=ANALISE DE CYBERSEGURANÇA=-=-=");
        System.out.println("NOTA DE SEGURANÇA: " + notaTotal + " pontos.");

        if (notaTotal >= 80) {
            System.out.println( VERDE + NEGRITO + "STATUS: Segurança Alta. Está seguro dos hackers!" + RESET);
        } else if (notaTotal >= 60) {
            System.out.println( AMARELO + NEGRITO + "STATUS: Segurança Média. Sua Segurança está no limite." + RESET);
        } else {
            System.out.println(VERMELHO + NEGRITO + "STATUS: Segurança Baixa! CUIDADO RISCO DE SER HACKEADO." + RESET);
        }
        vox.close();
    }
}
