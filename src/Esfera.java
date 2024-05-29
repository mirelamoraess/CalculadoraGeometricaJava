public class Esfera {

    double raio;
    final double PI = Math.PI;

    public Esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolume(){
        return 1.33 *(Math.pow(this.raio,3));
    }

    double calcularAreaSuperficial(){
        return (4 * this.PI) * (Math.pow(this.raio, 2));
    }

    String resumoEsfera(int valor) {
        String resumo = String.format("A esfera de raio %.2f tem o volume de %.2f e a area superficial de %.2f", this.raio, this.calcularVolume(), this.calcularAreaSuperficial());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
