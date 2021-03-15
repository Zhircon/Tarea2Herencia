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
        return (base*2)+(altura*2);
    }
    public float calcularArea(){
        return base*altura;
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
