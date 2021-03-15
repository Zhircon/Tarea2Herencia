//Agni Zahir Yañez Vences
//@zhircon 
//Xalapa Ver, 14/03/2021
public abstract class Figura{
    //Atributos
    protected float perimetro;
    protected float area;
    //Contructores
    public Figura(){
    };
    //Metodos
    public abstract float calcularPerimetro();
    public abstract float calcularArea(); 
    public float getPerimetro(){
        return perimetro;
    };
    public float getArea(){
        return area;
    };
} 