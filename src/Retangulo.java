public class Retangulo {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea (){
        return this.base * this.altura;

    }

    double calcularPerimetro(){
        return (2 * this.base) + (2 * this.altura);
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O retangulo de base %.2f e altura %.2f, tem a area de %.2f e o perimetro de %.2f", this.base, this.altura, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
