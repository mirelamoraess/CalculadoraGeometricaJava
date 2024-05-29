public class Quadrado {

    double calculoArea, calculoPerimetro;

    public Quadrado(double lado){
        this.calculoArea = lado;
        this.calculoPerimetro = lado;
    }

    public double calcularArea(){
       this.calculoArea = calculoArea*calculoArea;
       return calculoArea;
    }

    public double calcularPerimetro(){
        this.calculoPerimetro = calculoPerimetro*4;
        return calculoPerimetro;
    }

    public String resumoQuadrado(int numero){
        String resumo = String.format("\nA área do quadrado é: %.2f\nO Perímetro é: %.2f\n", calculoArea, calculoPerimetro);

        if (resumo.length() %2 != 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
