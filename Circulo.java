public class Circulo extends Figura {
    //Atributos
    private float radio;
    //Contructores
    Circulo(){

    }
    Circulo(float radio){
        this.radio=radio;
    }
    //Implementacion de la herencia
    public float calcularPerimetro(){
        return radio*3.1416F;
    }
    public float calcularArea(){
        return (radio*radio)*3.1416F;
    }
    //setters
    public void setRadio(float radio){
        this.radio=radio;
    }
    //Getters
    public float getRadio(){
        return this.radio;
    }
}
