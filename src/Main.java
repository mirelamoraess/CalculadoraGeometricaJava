import org.w3c.dom.css.CSSImportRule;

import javax.sound.midi.SysexMessage;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //criei o objeto scanner para ler a entrada dos dados
        Scanner leia = new Scanner(System.in);

        //declarei a varivél string
        String nome;
        int tipoFigura, tipoFiguraPlana, tipoFiguraEspacial;

        //entrada dos dados
        System.out.print("Entre com seu nome: ");
        nome = leia.next();

        while (true){

            try{
                System.out.print("\n ------ Entre com a opção da figura que deseja! ------ \n");
                System.out.print(" 1 - Figuras Planas\n 2 - Figuras Espaciais\n\n Entre com o número da opção:");
                tipoFigura = leia.nextInt();

                if (tipoFigura == 1) {
                    System.out.print(" \nBem-Vindo: " + nome + "\nEscolha umas das opções abaixo para calcúlo de figura plana");
                    System.out.print("\n 1 - Quadrado\n 2 - Retângulo\n 3 - Triângulo Equilátero\n 4 - Circulo\n 5 - Hexágono Regular\n 6 - Sair");
                    System.out.print("\n Entre com a opção: ");
                    tipoFiguraPlana = leia.nextInt();

                    switch (tipoFiguraPlana) {
                        case 1:
                            //declaração das varivel
                            double lado;

                            //entrada dos dados
                            System.out.print("Entre com o lado do quadrado: ");
                            lado = leia.nextDouble();

                            //criação do objeto e passadno parametro para construtor
                            Quadrado quadrado = new Quadrado(lado);
                            System.out.print("\nÁrea: " + quadrado.calcularArea());
                            System.out.print("\nPerímetro: " + quadrado.calcularPerimetro());
                            System.out.print(quadrado.resumoQuadrado(2));

                            break;
                        case 2:

                            //declaração das variaveis
                            double base, altura;

                            //entrada dos dados da base
                            System.out.print("Entre com a base: ");
                            base = leia.nextDouble();

                            //entrada dos dados da altura
                            System.out.print("Entre com a altura: ");
                            altura = leia.nextDouble();

                            //criação do objeto do tipo retangulo, passando parametro para construtor
                            Retangulo retangulo = new Retangulo(base, altura);

                            //saída, impresso na tela com a chamada dos metodos
                            System.out.print("\nÁrea: " + retangulo.calcularArea());
                            System.out.print("\nPerímetro: " + retangulo.calcularPerimetro());
                            System.out.print(retangulo.resumoRetangulo(3));

                            break;
                        case 3:

                            //declaração das variveis
                            double ladoTriangulo;

                            //entrada dos dados do usuário
                            System.out.print("Entre com o lado do triângulo equilatero: ");
                            ladoTriangulo = leia.nextDouble();

                            //criação do objeto, passando parametro
                            TranguloEquilatero triangulo = new TranguloEquilatero(ladoTriangulo);

                            //saída, impresso na tela com a chamada dos metodos
                            System.out.print("\nÁrea: " + triangulo.calcularArea());
                            System.out.print("\nPerímetro: " + triangulo.calcularPerimetro());
                            System.out.print(triangulo.resumoTrianguloEquilatero(2));
                            break;
                        case 4:

                            //declaração da variavel
                            double raio;

                            System.out.print("Entre com o raio do circulo: ");
                            raio = leia.nextDouble();

                            Circulo circulo = new Circulo(raio);

                            //saida impressa na tela com a chamada dos metodos
                            System.out.print("\nÁrea: " + circulo.calcularArea());
                            System.out.print("\nPerímetro: " + circulo.calcularPerimetro());
                            System.out.print(circulo.resumoCirculo(3));


                            break;
                        case 5:
                            //declaração de variavel
                            double ladoHexagono;

                            //input do usuário
                            System.out.print("Entre com o lado do hexagóno regular: ");
                            ladoHexagono = leia.nextDouble();

                            HexagonoRegular regular = new HexagonoRegular(ladoHexagono);

                            //saida impressa na tela com a chamada dos metodos
                            System.out.print("\nÁrea: " + regular.calcularArea());
                            System.out.print("\nPerímetro: " + regular.calcularPerimetro());
                            System.out.print(regular.resumoHexagono(2));

                        break;

                        case 6:

                            //mensagem para usuário
                            System.out.print(" Obrigada por usar nossa aplicação!");

                            //finaliza o programa
                            System.exit(0);
                        default:

                            //quando não entra com uma opção válida
                            System.out.print("Entre com uma opção válida!!");
                            continue;
                    }
                } else if(tipoFigura ==2){
                    System.out.print(" Bem-Vindo: " + nome + "\n\n Escolha umas das opções abaixo para calcúlo");
                    System.out.print("\n 1 - Cubo\n 2 - Paralelepípedo\n 3 - Esfera\n 4 - Pirâmide de Base Quadrada\n 5 - Cilindro\n 6 - Cone\n 7 - Sair");
                    System.out.print("\n Entre com a opção: ");
                    tipoFiguraEspacial = leia.nextInt();


                    switch (tipoFiguraEspacial) {
                        case 1: // Cubo
                            // Declaração das variáveis
                            double arestaCubo;

                            // Entrada dos dados
                            System.out.print("Entre com a aresta do cubo: ");
                            arestaCubo = leia.nextDouble();

                            // Criação do objeto Cubo
                            Cubo cubo = new Cubo(arestaCubo);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + cubo.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + cubo.calcularVolume());
                            System.out.print(cubo.resumoCubo(2));
                            break;

                        case 2: // Paralelepípedo
                            // Declaração das variáveis
                            double ladoA, ladoB, ladoC;

                            // Entrada dos dados
                            System.out.print("Entre com o lado A do paralelepípedo: ");
                            ladoA = leia.nextDouble();
                            System.out.print("Entre com o lado B do paralelepípedo: ");
                            ladoB = leia.nextDouble();
                            System.out.print("Entre com o lado C do paralelepípedo: ");
                            ladoC = leia.nextDouble();

                            // Criação do objeto Paralelepípedo
                            Paralelepipedo paralelepipedo = new Paralelepipedo(ladoA, ladoB, ladoC);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + paralelepipedo.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + paralelepipedo.calcularVolume());
                            System.out.print(paralelepipedo.resumoParalelepipedo(3));
                            break;

                        case 3: // Esfera
                            // Declaração da variável
                            double raioEsfera;

                            // Entrada dos dados
                            System.out.print("Entre com o raio da esfera: ");
                            raioEsfera = leia.nextDouble();

                            // Criação do objeto Esfera
                            Esfera esfera = new Esfera(raioEsfera);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + esfera.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + esfera.calcularVolume());
                            System.out.print(esfera.resumoEsfera(3));
                            break;

                        case 4: // Pirâmide de Base Quadrada
                            // Declaração das variáveis
                            double ladoBase, alturaPiramide;

                            // Entrada dos dados
                            System.out.print("Entre com o lado da base da pirâmide quadrada: ");
                            ladoBase = leia.nextDouble();
                            System.out.print("Entre com a altura da pirâmide: ");
                            alturaPiramide = leia.nextDouble();

                            // Criação do objeto PirâmideBaseQuadrada
                            PiramideBaseQuadrada piramideBaseQuadrada = new PiramideBaseQuadrada(ladoBase, alturaPiramide);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + piramideBaseQuadrada.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + piramideBaseQuadrada.calcularVolume());
                            System.out.print(piramideBaseQuadrada.resumoPiramideBaseQuadrada(3));
                            break;

                        case 5: // Cilindro
                            // Declaração das variáveis
                            double raioBaseCilindro, alturaCilindro;

                            // Entrada dos dados
                            System.out.print("Entre com o raio da base do cilindro: ");
                            raioBaseCilindro = leia.nextDouble();
                            System.out.print("Entre com a altura do cilindro: ");
                            alturaCilindro = leia.nextDouble();

                            // Criação do objeto Cilindro
                            Cilindro cilindro = new Cilindro(raioBaseCilindro, alturaCilindro);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + cilindro.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + cilindro.calcularVolume());
                            System.out.print(cilindro.retornaResumoForma(3));
                            break;
                        case 6:
                            // Declaração das variáveis
                            double raio, altura;

                            // Entrada dos dados
                            System.out.print("Entre com o raio da base do cone: ");
                            raio = leia.nextDouble();
                            System.out.print("Entre com a altura do cone: ");
                            altura = leia.nextDouble();

                            // Criação do objeto Cilindro
                            Cone cone = new Cone(raio, altura);

                            // Saída na tela com a chamada dos métodos
                            System.out.print("\nÁrea da superfície: " + cone.calcularAreaSuperficial());
                            System.out.print("\nVolume: " + cone.calcularVolume());
                            System.out.print(cone.retornaResumoForma(3));
                            break;
                        case 7:
                            System.out.print("Obrigada por usar nossa aplicação!");
                            System.exit(0);
                        default:
                            System.out.print("Entre com uma opção válida!!");
                            continue;
                    }
                }else {
                    System.out.print("Entre com um número válido!");
                }
            }catch (InputMismatchException e){
                System.out.print("Você entrou com caracter mas o programa só aceita número!Tente novamente");
                break;
            }
        continue;
        }
    }
}
