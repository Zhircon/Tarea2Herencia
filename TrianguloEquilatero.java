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
        return base*3;
    }
    public float calcularArea(){
        return (base*altura)/2;
    }

}
