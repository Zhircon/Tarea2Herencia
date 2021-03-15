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
        perimetro=radio*3.1416F;
        return perimetro;
    }
    public float calcularArea(){
        area=(radio*radio)*3.1416F;
        return area;
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
