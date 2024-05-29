public class HexagonoRegular {

    double ladoHex;

    public HexagonoRegular(double lado) {
        this.ladoHex = lado;
    }

    double calcularArea (){
        return  6 * this.ladoHex * 0.75;
    }

    double calcularPerimetro(){
        return this.ladoHex * 6;
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O hexagono regular de lado %.2f tem a area de %.2f e o perimetro de %.2f", this.ladoHex, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
