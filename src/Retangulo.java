public class Retangulo {
    double base, altura, area, perimetro;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        area = base*altura;
        return area;
    }

    public double calcularPerimetro(){
        perimetro = (2*base) + (2*altura);
        return perimetro;
    }

    public String resumoRetangulo(int numero){
        String resumo = String.format("\nA área do retângulo é: %.2f\nO perímetro do retângulo: %.2f\n", area, perimetro);

        if (resumo.length() %2 ==0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
