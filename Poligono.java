public class Poligono extends Figura {
    //Atributos
    private int lados;
    private float medidaLado;
    private float apotema;
    //Contructores
    public Poligono(){
    }
    public Poligono(int lados,float medidaLado,float apotema){
        this.lados=lados;
        this.medidaLado=medidaLado;
        this.apotema=apotema;
    }
    //Implementacion de la herencia
    public float calcularPerimetro(){
        perimetro=lados*medidaLado;
        return perimetro;
        
    }
    public float calcularArea(){
        area=(perimetro*apotema/2);
        return area;
    }
}
