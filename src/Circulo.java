public class Circulo {

    double raio;
    final double PI = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }
    double calcularArea() {
        return this.PI*Math.pow(this.raio,2);
    }

    double calcularPerimetro(){
        return 2 * this.PI * this.raio;
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O circulo de raio %.2f tem a area de %.2f e o perimetro de %.2f", this.raio, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }


}

