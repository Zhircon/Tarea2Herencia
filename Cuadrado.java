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
        return lado*4;
    }
    public float calcularArea(){
        return lado*lado;
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
