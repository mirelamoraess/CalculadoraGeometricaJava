public class TranguloEquilatero {

    double calculoArea, calculoPerimetro;

    public TranguloEquilatero(double ladoTriangulo){
        this.calculoArea = ladoTriangulo;
        this.calculoPerimetro = ladoTriangulo;
    }

    public double calcularArea(){
        this.calculoArea = (Math.sqrt(3)/4) * Math.pow(this.calculoArea, 2);

        return calculoArea;
    }

    public double calcularPerimetro(){
        this.calculoPerimetro = calculoPerimetro*3;

        return calculoPerimetro;
    }

    public String resumoTrianguloEquilatero(int numero){
        String resumo = String.format("\nA área do triângulo equilátero é: %.2f\nO perímetro do triângulo equilátero é: %.2f\n", this.calculoArea, this.calculoPerimetro);

        if (resumo.length() %2==0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
