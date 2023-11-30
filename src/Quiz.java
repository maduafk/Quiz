// Aluna: Maria Eduarda Silva Viana / turma: ESN2
// Professor: Brenno Pimenta

import java.util.Scanner;

class Quiz {
    public static void main(String[] args) {
        int numeroAcertos = 0;
        int numeroErros;
        System.out.println("Quiz sobre Inteligência Artificial");
        System.out.println("OBS: IA é a abreviação usada de Inteligência Artificial.");

        // métodos das questões
        numeroAcertos += questao1();
        numeroAcertos += questao2();
        numeroAcertos += questao3();
        numeroAcertos += questao4();
        numeroAcertos += questao5();
        numeroAcertos += questao6();
        numeroAcertos += questao7();
        numeroAcertos += questao8();
        numeroAcertos += questao9();
        numeroAcertos += questao10();
        numeroAcertos += questao11();
        numeroAcertos += questao12();
        numeroAcertos += questao13();
        numeroAcertos += questao14();
        numeroAcertos += questao15();

        numeroErros = 15 - numeroAcertos;

        System.out.println("Fim do Quiz! De 15 perguntas, você acertou: " + numeroAcertos + " e errou: " + numeroErros);

        // gabarito
        System.out.println("Gabarito:");
        System.out.println("Questão 1: B");
        System.out.println("Questão 2: B");
        System.out.println("Questão 3: D");
        System.out.println("Questão 4: B");
        System.out.println("Questão 5: B");
        System.out.println("Questão 6: A");
        System.out.println("Questão 7: D");
        System.out.println("Questão 8: B");
        System.out.println("Questão 9: C");
        System.out.println("Questão 10: A");
        System.out.println("Questão 11: B");
        System.out.println("Questão 12: C");
        System.out.println("Questão 13: D");
        System.out.println("Questão 14: A");
        System.out.println("Questão 15: A");
    }

    //inicio das questões
    public static int questao1() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println(" QUESTÃO 1");
        Questao questao1 = new Questao();
        questao1.pergunta = "Quais das definições a seguir é a correta sobre o que é uma IA ?";
        questao1.opcaoA = "A - É um grupo de robôs que querem dominar o mundo.";
        questao1.opcaoB = "B - É um ramo da ciência da computação que se concentra no desenvolvimento de sistemas e algoritmos capazes de realizar tarefas que normalmente exigem inteligência humana.";
        questao1.opcaoC = "C - São pessoas que se acham inteligentes mas são superficiais.";
        questao1.opcaoD = "D - É uma rede social.";
        questao1.correta = "B";
        questao1.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }

    public static int questao2() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 2");
        Questao questao2 = new Questao();
        questao2.pergunta = "O que faz o teste de Turing?";
        questao2.opcaoA = "A - Testa aplicativos para ver se estão comprometidos.";
        questao2.opcaoB = "B - Testa a capacidade de um computador de exibir comportamento inteligente equivalente ao de um ser humano, ou indistinguível deste.";
        questao2.opcaoC = "C - Auxilia na criação de programas.";
        questao2.opcaoD = "D - É um teste de personalidade.";
        questao2.correta = "B";
        questao2.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao2.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }

    public static int questao3() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 3");
        Questao questao3 = new Questao();
        questao3.pergunta = "Como são feitas as IA?";
        questao3.opcaoA = "A - Pelo chat GPT.";
        questao3.opcaoB = "B - Por computadores feitos para criar IAs.";
        questao3.opcaoC = "C - Por jogos da steam.";
        questao3.opcaoD = "D - Pela a combinação de grandes volumes de dados digitais e algoritmos inteligentes";
        questao3.correta = "D";
        questao3.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao3.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao4() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 4");
        Questao questao4 = new Questao();
        questao4.pergunta = "Quais são os principais tipos de aprendizado em IA?";
        questao4.opcaoA = "A - Aprendizado de máquina e aprendizado humano.";
        questao4.opcaoB = "B - Aprendizado supervisionado e não supervisionado.";
        questao4.opcaoC = "C - Aprendizado por reforço e aprendizado não supervisionado.";
        questao4.opcaoD = "D - Aprendizado cognitivo e aprendizado lógico.";
        questao4.correta = "B";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao5() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 5");
        Questao questao4 = new Questao();
        questao4.pergunta = "Quais são alguns exemplos de aplicações de IA na vida cotidiana?";
        questao4.opcaoA = "A - IAs fazendo entregas de ifood.";
        questao4.opcaoB = "B - Chatbots, reconhecimento de fala, sistemas de recomendação...";
        questao4.opcaoC = "C - IAs fazendo cirurgias neurológicas.";
        questao4.opcaoD = "D - Não há exemplo.";
        questao4.correta = "B";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao6() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 6");
        Questao questao4 = new Questao();
        questao4.pergunta = "Como a IA está contribuindo para a sustentabilidade?";
        questao4.opcaoA = "A - Otimizando processos industriais, gerenciando melhor os recursos naturais, prevendo padrões climáticos, desenvolvendo tecnologias energéticas mais eficientes e impulsionanando a eficiência energética em muitos setores..";
        questao4.opcaoB = "B - Parando o Aquecimendo global.";
        questao4.opcaoC = "C - Destruindo industrias.";
        questao4.opcaoD = "D - Limpando as cidades.";
        questao4.correta = "A";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao7() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 7");
        Questao questao4 = new Questao();
        questao4.pergunta = "Como a IA pode ajudar na segurança cibernética?";
        questao4.opcaoA = "A - Não existe como a IA ajudar na segurança cibernética.";
        questao4.opcaoB = "B - Roubando dados das pessoas.";
        questao4.opcaoC = "C - Hackeando todas as pessoas e sabendo o que fazem na internet.";
        questao4.opcaoD = "D - Pode ser usada para identificar padrões de comportamento suspeitos em redes, detectar ameaças e ataques cibernéticos, e fortalecer as defesas digitais por meio da detecção rápida e da resposta automatizada a ameaças.";
        questao4.correta = "D";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao8() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 8");
        Questao questao4 = new Questao();
        questao4.pergunta = "Quais são os riscos da IA?";
        questao4.opcaoA = "A - Revolução das máquinas.";
        questao4.opcaoB = "B - Além dos riscos éticos, outros desafios incluem a dependência excessiva de tecnologia, possíveis falhas de segurança, perda de empregos.";
        questao4.opcaoC = "C - Não há riscos.";
        questao4.opcaoD = "D - Espalhar muita desinformação.";
        questao4.correta = "B";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao9() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 9");
        Questao questao4 = new Questao();
        questao4.pergunta = "Qual dos tipos de IA a seguir são verdadeiros ao classificar os tipos de IA.";
        questao4.opcaoA = "A - IA sem noção.";
        questao4.opcaoB = "B - IA burra.";
        questao4.opcaoC = "C - IA superinteligência.";
        questao4.opcaoD = "D - IA muito fraca.";
        questao4.correta = "C";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao10() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 10");
        Questao questao4 = new Questao();
        questao4.pergunta = "Quais são as implicações da IA no mercado de trabalho?";
        questao4.opcaoA = "A - Substituição de empregos.";
        questao4.opcaoB = "B - Ataques cyberneticos.";
        questao4.opcaoC = "C - Greve.";
        questao4.opcaoD = "D - Nenhuma das alternativas..";
        questao4.correta = "A";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao11() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 11");
        Questao questao4 = new Questao();
        questao4.pergunta = "Quais são as preocupações sobre a privacidade de dados relacionadas à IA?";
        questao4.opcaoA = "A - Hackear computadores para ter mais dados.";
        questao4.opcaoB = "B - A coleta e o uso de grandes quantidades de dados pessoais podem levantar questões sobre privacidade.";
        questao4.opcaoC = "C - Aprendizado não supervisionado.";
        questao4.opcaoD = "D - Nenhuma das opções acima.";
        questao4.correta = "B";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao12() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 12");
        Questao questao4 = new Questao();
        questao4.pergunta = "Qual é o tipo de IA que tem capacidades semelhantes às humanas?";
        questao4.opcaoA = "A - IA Fraca.";
        questao4.opcaoB = "B - IA Supertinteligência.";
        questao4.opcaoC = "C - IA Forte.";
        questao4.opcaoD = "D - IA Cognitiva.";
        questao4.correta = "C";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao13() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 13");
        Questao questao4 = new Questao();
        questao4.pergunta = "Qual é o principal método de aprendizado de máquina em que um algoritmo é treinado usando pares de entrada e saída?";
        questao4.opcaoA = "A -  Aprendizado Profundo.";
        questao4.opcaoB = "B - Aprendizado por Reforço.";
        questao4.opcaoC = "C - Aprendizado por reforço e aprendizado não supervisionado.";
        questao4.opcaoD = "D - Aprendizado Supervisionado.";
        questao4.correta = "D";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao14() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 14");
        Questao questao4 = new Questao();
        questao4.pergunta = "Qual dos seguintes não é um exemplo de aplicação de inteligência artificial?";
        questao4.opcaoA = "A - Planilhas Eletrônicas.";
        questao4.opcaoB = "B - Reconhecimento Facial.";
        questao4.opcaoC = "C - Recomendações de Compras Online.";
        questao4.opcaoD = "D - Carros Autônomos.";
        questao4.correta = "A";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }
    public static int questao15() {
        int cont = 0;
        System.out.println("=========================================================================");
        System.out.println("Questão 15");
        Questao questao4 = new Questao();
        questao4.pergunta = "Qual é uma das principais preocupações éticas em relação à IA?";
        questao4.opcaoA = "A - Privacidade de dados.";
        questao4.opcaoB = "B - Eficiência energética.";
        questao4.opcaoC = "C - Desigualdade de gênero.";
        questao4.opcaoD = "D - Acesso à internet.";
        questao4.correta = "A";
        questao4.exibirQuestao();
        String respostaUsuario = lerResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");
        return cont;
    }

    // leitura da resposta do usuario
    public static String lerResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta (A, B, C ou D): ");
            resp = ler.next().toUpperCase();
        } while (!respostaValida(resp));
        return resp;
    }
    // verificação da resposta
    public static boolean respostaValida(String resp) {
        return resp.equals("A") || resp.equals("B") || resp.equals("C") || resp.equals("D");
    }

    // classe das questôes do quiz
    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String correta = "";

        // verificação da resposta/2
        public boolean isCorreta(String resposta) {
            return resposta.equals(this.correta);
        }
        //opçoes
        public void exibirQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println();
        }
    }
}
