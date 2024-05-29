import java.util.Scanner;

import static sun.util.locale.LocaleUtils.isNumeric;

public class Main {
//fsimbols.com

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Bem vindo(a) " + nome);

        System.out.print("\nEscolha uma opção: \n1 - Formas Planas \n2 - Formas Espaciais\n");
        int opt = leia.nextInt();

        if (opt == 1) {
            System.out.print("\nEscolha uma opção: \n1 - Quadrado \n2 - Retângulo \n3 - Triângulo \n4 - Círculo \n5 - Hexágono \n6 - Sair\n");
            int opt2 = leia.nextInt();

            switch (opt2) {

                case 1:
                    while (true){
                        try{
                            System.out.println(nome + ", insira a medida do lado do quadrado: ");
                            double lado = leia.nextDouble();
                            if (lado <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");}
                            else{
                                Quadrado quadrado = new Quadrado(lado);
                                System.out.println(quadrado.calcularArea());
                                System.out.println(quadrado.calcularPerimetro());
                                System.out.println(quadrado.retornaResumoForma(10));}
                            }
                        catch (Exception e) {
                        System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                        leia.nextLine();
                        }
                    }



                case 2:
                    while (true) {
                        try {
                            System.out.println(nome + ", insira a medida da base do retângulo: ");
                            double base = leia.nextDouble();
                            System.out.println("Insira a medida da altura do retângulo: ");
                            double altura = leia.nextDouble();
                            if (base <= 0 || altura <= 0) {
                                throw new IllegalArgumentException("O número deve ser maior que zero.");
                            } else {
                                Retangulo retangulo = new Retangulo(base, altura);
                                System.out.println(retangulo.calcularArea());
                                System.out.println(retangulo.calcularPerimetro());
                                System.out.println(retangulo.retornaResumoForma(10));
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                            leia.nextLine();
                        }
                    }

                case 3:
                    while (true) {
                        try {
                            System.out.println(nome + ", insira a medida do lado do triângulo: ");
                            double ladoTriangulo = leia.nextDouble();
                            if (ladoTriangulo <= 0) {
                                throw new IllegalArgumentException("O número deve ser maior que zero.");
                            } else {
                                TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(ladoTriangulo);
                                System.out.println(trianguloEquilatero.calcularArea());
                                System.out.println(trianguloEquilatero.calcularPerimetro());
                                System.out.println(trianguloEquilatero.retornaResumoForma(10));
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                            leia.nextLine();
                        }
                    }


                case 4:
                    while (true) {
                        try {
                            System.out.println(nome + ", insira a medida do raio do círculo: ");
                            double raio = leia.nextDouble();
                            if (raio <= 0) {
                                throw new IllegalArgumentException("O número deve ser maior que zero.");
                            } else {
                                Circulo circulo = new Circulo(raio);
                                System.out.println(circulo.calcularArea());
                                System.out.println(circulo.calcularPerimetro());
                                System.out.println(circulo.retornaResumoForma(10));
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                            leia.nextLine();
                        }
                    }


                case 5:
                    while (true) {
                        try {
                            System.out.println(nome + ", insira a medida do lado do hexágono: ");
                            double ladoHex = leia.nextDouble();
                            if (ladoHex <= 0) {
                                throw new IllegalArgumentException("O número deve ser maior que zero.");
                            } else {
                                HexagonoRegular hexagonoRegular = new HexagonoRegular(ladoHex);
                                System.out.println(hexagonoRegular.calcularArea());
                                System.out.println(hexagonoRegular.calcularPerimetro());
                                System.out.println(hexagonoRegular.retornaResumoForma(10));
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                            leia.nextLine();
                        }
                    }


                case 6:
                    break;

            }}

            if (opt == 2) {
                System.out.print("Escolha uma opção: \n1 - Cubo \n2 - Paralelepípedo \n3 - Cilindro \n4 - Cone \n5 - Pirâmide de Base Quadrada \n6 - Esfera \n7 - Sair\n");
                int opt3 = leia.nextInt();

                switch (opt3) {
                    case 1:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira a medida do lado do cubo: ");
                                double lado = leia.nextDouble();
                                if (lado <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    Cubo cubo = new Cubo(lado);
                                    System.out.println(cubo.calcularVolume());
                                    System.out.println(cubo.calcularAreaSuperficial());
                                    System.out.println(cubo.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }


                    case 2:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira a medida do comprimento do paralelepípedo: ");
                                double comprimento = leia.nextDouble();

                                System.out.println("Insira a medida da largura: ");
                                double largura = leia.nextDouble();

                                System.out.println("Insira a medida da altura: ");
                                double altura = leia.nextDouble();
                                if (comprimento <= 0 || largura <= 0 || altura <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, largura, altura);
                                    System.out.println(paralelepipedo.calcularVolume());
                                    System.out.println(paralelepipedo.calcularAreaSuperficial());
                                    System.out.println(paralelepipedo.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }

                    case 3:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira a medida do raio do cilindro: ");
                                double raio = leia.nextDouble();

                                System.out.println("Insira a medida da altura: ");
                                double alturaCilindro = leia.nextDouble();
                                if (raio <= 0 || alturaCilindro <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    Cilindro cilindro = new Cilindro(raio, alturaCilindro);
                                    System.out.println(cilindro.calcularVolume());
                                    System.out.println(cilindro.calcularAreaSuperficial());
                                    System.out.println(cilindro.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }


                    case 4:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira a medida do raio do cone: ");
                                double raioCone = leia.nextDouble();

                                System.out.println("Insira a medida da altura: ");
                                double alturaCone = leia.nextDouble();
                                if (raioCone <= 0 || alturaCone <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    Cone cone = new Cone(raioCone, alturaCone);
                                    System.out.println(cone.calcularVolume());
                                    System.out.println(cone.calcularAreaSuperficial());
                                    System.out.println(cone.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }


                    case 5:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira a medida da aresta da base da pirâmide: ");
                                double arestaBase = leia.nextDouble();

                                System.out.println("Insira a medida da apotema: ");
                                double apotema = leia.nextDouble();

                                System.out.println("Insira a medida da altura: ");
                                double alturaPiramide = leia.nextDouble();
                                if (arestaBase <= 0 || apotema <= 0 || alturaPiramide <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    PiramideBaseQuadrada piramideBaseQuadrada = new PiramideBaseQuadrada(arestaBase, apotema, alturaPiramide);
                                    System.out.println(piramideBaseQuadrada.calcularVolume());
                                    System.out.println(piramideBaseQuadrada.calcularAreaSuperficial());
                                    System.out.println(piramideBaseQuadrada.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }

                    case 6:
                        while (true) {
                            try {
                                System.out.println(nome + ", insira o raio da esfera: ");
                                double raioEsfera = leia.nextDouble();
                                if (raioEsfera <= 0) {
                                    throw new IllegalArgumentException("O número deve ser maior que zero.");
                                } else {
                                    Esfera esfera = new Esfera(raioEsfera);
                                    System.out.println(esfera.calcularVolume());
                                    System.out.println(esfera.calcularAreaSuperficial());
                                    System.out.println(esfera.retornaResumoForma(10));
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida. Certifique-se de inserir um número positivo.");
                                leia.nextLine();
                            }
                        }


                    case 7:
                        break;
                }
            }
        }
    }
