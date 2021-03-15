public class Trapecio extends Figura {
    //Attributos
    private float baseMayor;
    private float baseMenor;
    private float altura;
    private float medidaLado;
    //Constructores
    public Trapecio(){
    }
    public Trapecio(float baseMayor,float baseMenor,float altura,float medidaLado){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
        this.medidaLado=medidaLado;
    }
    //Implementacion de la herencia
    public float calcularPerimetro(){
        return baseMayor+baseMenor+(medidaLado*2);
    }
    public float calcularArea(){
        return ((baseMayor+baseMenor)/2)*altura;
    }
    //Setters
    public void setBaseMayor(float baseMayor){
        this.baseMayor=baseMayor;
    }
    public void setBaseMenor(float baseMenor){
        this.baseMenor=baseMenor;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public void setMedidaLado(float medidaLado){
        this.medidaLado=medidaLado;
    }
    //Getters
    public float getBaseMayor(){
        return baseMayor;
    }
    public float getBaseMenor(){
        return baseMenor;
    }
    public float getAltura(){
        return altura;
    }
    public float getMedidaLado(){
        return medidaLado;
    }
}
