public class Romboide extends Rectangulo{
    //Atributos
    private float lado;
    //Construcor
    public Romboide(float lado,float base,float altura){
        super(lado,base);
        this.lado=lado;
    }
    public Romboide(){        
    }
    public float calcularPerimetro(){
        perimetro=(lado*2)+(base*2);
        return perimetro;
    }
    //Setters
    public void setLado(float lado){
        this.lado=lado;
    }
    //Getters
    public float getLado(){
        return lado;
    }
}
