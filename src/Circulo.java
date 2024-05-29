public class Circulo {

    double calculoArea, calculoPerimetro;

    public Circulo(double raio){
        this.calculoArea = raio;
        this.calculoPerimetro = raio;
    }

    public double calcularArea(){
        this.calculoArea = Math.PI * Math.pow(this.calculoArea, 2);
        return  calculoArea;
    }

    public double calcularPerimetro(){
        this.calculoPerimetro = 2 * Math.PI * this.calculoPerimetro;

        return calculoPerimetro;
    }

    public String resumoCirculo(int numero){
        String resumo = String.format("\nA área do circulo é: %.2f\nO perímetro do circulo é: %.2f\n", this.calculoArea, this.calculoPerimetro);

        if (resumo.length() %2 ==0){
            return resumo.toUpperCase();
        }
            return resumo.toLowerCase();
    }
}
