public class TrianguloEquilatero extends Figura {
    //Atributos
    private float base;
    private float altura;
    //Contructores
    public TrianguloEquilatero(){
    }
    public TrianguloEquilatero(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    //Implementacion de la herencia
    public float calcularPerimetro(){
        perimetro=base*3;
        return perimetro;
    }
    public float calcularArea(){
        area=(base*altura)/2;
        return area;
    }

}
