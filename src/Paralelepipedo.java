public class Paralelepipedo {

    double comprimento;
    double largura;
    double altura;

    public Paralelepipedo(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    double calcularVolume(){
        return this.comprimento * this.altura * this.largura;
    }

    double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }

    String resumoParalelepipedo(int valor) {
        String resumo = String.format("O paralelepipedo  de comprimento %.2f, largura de %.2f e altura %.2f, tem o volume de %.2f e a area Superficial de %.2f", this.comprimento, this.largura, this.altura,this.calcularVolume(), this.calcularAreaSuperficial());

        if (valor % 2 == 0) {
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
