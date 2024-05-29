public class Cilindro {

    double raio;
    double alturaCilindro;
    final double PI = Math.PI;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.alturaCilindro = altura;
    }
    
    double calcularVolume(){
        return this.PI * Math.pow(this.raio,2);
    }

    double calcularAreaSuperficial(){
        return (2 * this.PI * this.raio * this.alturaCilindro) + (2 * this.PI * Math.pow(this.raio,2));
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O cilindro de raio %.2f tem o volume de %.2f e a area superficial de %.2f", this.raio, this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
