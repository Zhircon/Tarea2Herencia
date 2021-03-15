public class Cuadrado extends Figura {
    //Atributos
    private float lado;
    //Constructores
    public Cuadrado(){

    }
    public Cuadrado(float lado){
        this.lado=lado;
    }
    //Implementacion de metodos heredados
    public float calcularPerimetro(){
        perimetro=lado*4
        return perimetro;
    }
    public float calcularArea(){
        area=lado*lado;
        return area;
    }
    //Setters
    public void setLado(float lado){
        this.lado=lado;
    }
    //getters
    public float getLado(){
        return lado;
    }
}
