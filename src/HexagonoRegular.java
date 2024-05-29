public class HexagonoRegular {
    double calculoArea, calculoPerimetro;

    public HexagonoRegular(double ladoHexagono){
        this.calculoArea = ladoHexagono;
        this.calculoPerimetro = ladoHexagono;
    }

    public double calcularArea(){
        return calculoArea;
    }

    public double calcularPerimetro(){
        return  calculoPerimetro;
    }

    public String resumoHexagono(int numero){
        String resumo = String.format("\nA área do hexagono é: %.2f\nO perímetro do hexagono é: %.2f\n", this.calculoArea, this.calculoPerimetro);

        if (resumo.length() %2 ==0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
