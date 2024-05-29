public class Cone {

    double raio;
    double altura;

    final double PI = Math.PI;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    double calcularVolume() {
        return 0.33 * this.PI * Math.pow(this.raio,2) * this.altura;
    }

    double calcularAreaSuperficial(){
        return this.PI * this.raio * Math.sqrt(Math.pow(this.altura,2)+ Math.pow(this.raio,2));
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O cone de raio %.2f tem o volume de %.2f e a area superficial de %.2f", this.raio, this.calcularVolume(), this.calcularAreaSuperficial());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
