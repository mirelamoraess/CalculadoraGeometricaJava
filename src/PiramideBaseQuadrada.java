public class PiramideBaseQuadrada {

    double arestaBase;
    double apotema;
    double altura;

    public PiramideBaseQuadrada(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    double calcularVolume(){
        return ((this.arestaBase * this.arestaBase) * this.altura) /3;
    }

    double calcularAreaSuperficial(){
        return (2 * this.arestaBase * this.apotema) + Math.pow(this.arestaBase,2);
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("A piramide  de base quadrada, com uma altura de  %.2f, aresta da base de %.2f e apotema de %.2f tem o volume de %.2f e a area superficial de %.2f", this.altura, this.arestaBase, this.apotema, this.calcularVolume(), this.calcularAreaSuperficial());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
