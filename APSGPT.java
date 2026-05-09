import java.util.Scanner;

public class APSGPT {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        boolean continuar = true;

        System.out.println("=== SISTEMA DE AUDITORIA DE SEGURANÇA - DATA CORP ===");
        System.out.println("Responsável técnica: Pryscilla");

        // Estrutura WHILE: Mantém o programa rodando até você decidir sair
        while (continuar) {
            System.out.println("\n--- MENU DE MANUTENÇÃO SEMANAL ---");
            System.out.println("1. Segurança do Estação de Trabalho");
            System.out.println("2. Segurança de Rede e Senhas");
            System.out.println("0. Encerrar Auditoria e Sair");
            System.out.print("Escolha a área para auditar: ");
            opcao = entrada.nextInt();

            // Estrutura SWITCH: Seleciona o setor da empresa
            switch (opcao) {
                case 1:
                    auditEstacao(entrada);
                    break;
                case 2:
                    auditRede(entrada);
                    break;
                case 0:
                    System.out.println("Saindo do sistema... Relatório gerado com sucesso.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        entrada.close();
    }

    // Método para Auditoria de Estação
    public static void auditEstacao(Scanner entrada) {
        int nota = 0;
        int resp;

        System.out.println("\n--- CHECKLIST: ESTAÇÃO DE TRABALHO ---");
        
        System.out.print("O computador está com o bloqueio de tela automático ativo? (1-Sim / 0-Não): ");
        resp = entrada.nextInt();
        if (resp == 1) nota += 50; // Estrutura IF para somar nota

        System.out.print("O antivírus está atualizado e rodando? (1-Sim / 0-Não): ");
        resp = entrada.nextInt();
        if (resp == 1) nota += 50;

        gerarDiagnostico(nota);
    }

    // Método para Auditoria de Rede
    public static void auditRede(Scanner entrada) {
        int nota = 0;
        int resp;

        System.out.println("\n--- CHECKLIST: REDE E SENHAS ---");
        
        System.out.print("O Wi-Fi utiliza criptografia WPA3 ou superior? (1-Sim / 0-Não): ");
        resp = entrada.nextInt();
        if (resp == 1) nota += 50;

        System.out.print("A política de troca de senhas a cada 90 dias é seguida? (1-Sim / 0-Não): ");
        resp = entrada.nextInt();
        if (resp == 1) nota += 50;

        gerarDiagnostico(nota);
    }

    // Função para imprimir o diagnóstico final com base na nota
    public static void gerarDiagnostico(int nota) {
        System.out.println("\n--- DIAGNÓSTICO FINAL ---");
        System.out.println("Nota de Segurança: " + nota + "/100");

        if (nota == 100) {
            System.out.println("STATUS: Segurança Máxima. Parabéns, Pryscilla!");
        } else if (nota >= 50) {
            System.out.println("STATUS: Segurança Média. Recomenda-se ajustes imediatos.");
        } else {
            System.out.println("STATUS: CRÍTICO! Risco iminente de vazamento de dados.");
        }
        System.out.println("--------------------------");
    }
}