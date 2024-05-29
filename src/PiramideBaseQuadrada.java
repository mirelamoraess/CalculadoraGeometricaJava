public class PiramideBaseQuadrada {

    private double arestaBase;
    private double altura;

    public PiramideBaseQuadrada(double arestaBase, double altura) {
        this.arestaBase = arestaBase;
        this.altura = altura;
    }

    public double calcularVolume() {
        return (arestaBase * arestaBase * altura) / 3;
    }

    public double calcularAreaSuperficial() {
        double areaLateral = 4 * arestaBase * apotema();
        double areaBase = arestaBase * arestaBase;
        return areaLateral + areaBase;
    }

    private double apotema() {
        return Math.sqrt(altura * altura + (arestaBase / 2) * (arestaBase / 2));
    }

    public String resumoPiramideBaseQuadrada(int valor) {
        String resumo = String.format("A pirâmide de base quadrada, com uma altura de %.2f e aresta da base de %.2f tem o volume de %.2f e a área superficial de %.2f", altura, arestaBase, calcularVolume(), calcularAreaSuperficial());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}