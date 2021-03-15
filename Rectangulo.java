public class Rectangulo extends Figura {
    //Atributos
    protected float base;
    protected float altura;
    //Constructores
    public Rectangulo(){

    }
    public Rectangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    //Implementacion de la herencia 
    public float calcularPerimetro(){
        perimetro=(base*2)+(altura*2);
        return perimetro;
    }
    public float calcularArea(){
        area=base*altura;
        return area;
    }
    //Setters
    public void setBase(float base){
        this.base=base;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    //getters
    public float getBase(){
        return base;
    } 
    public float getAltura(){
        return altura;
    }
}
