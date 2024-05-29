public class TrianguloEquilatero {

     double ladoTriangulo;

    public TrianguloEquilatero(double lado) {
        this.ladoTriangulo = lado;
    }

    double calcularArea (){
        return  this.ladoTriangulo * 0.75;
    }

    double calcularPerimetro(){
        return this.ladoTriangulo * 3;
    }

    String retornaResumoForma(int valor) {
        String resumo = String.format("O triangulo equilatero de lado %.2f, tem a area de %.2f e o perimetro de %.2f", this.ladoTriangulo, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
