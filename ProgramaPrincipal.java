public class ProgramaPrincipal {
    public static void main(String[] args){
        Figura circulo=new Circulo(45.0F);
        Figura cuadrado=new Cuadrado(3f);
        Figura trianguloequilatero = new TrianguloEquilatero(3F,2F);
        Figura trapecio = new Trapecio(3F,2F,1,4);
        Figura poligono =new Poligono(5,5F,3.4F);
        System.out.println("Circulo Area: "+circulo.calcularArea()+" Circulo Perimetro"+circulo.calcularPerimetro());
        System.out.println("Cuadrado Area: "+cuadrado.calcularArea()+" Circulo Perimetro"+cuadrado.calcularPerimetro());
        System.out.println("TrianguloEquilatero Area: "+trianguloequilatero.calcularArea()+" TrianguloEquilatero Perimetro"+trianguloequilatero.calcularPerimetro());
        System.out.println("Trapecio Area: "+trapecio.calcularArea()+" Trapecio Perimetro"+trapecio.calcularPerimetro());
        System.out.println("Poligono Area: "+poligono.calcularArea()+" Poligono Perimetro"+poligono.calcularPerimetro());
    }
    
}
