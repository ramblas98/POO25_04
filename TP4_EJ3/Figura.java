abstract class Figura {


    abstract double area();

    public boolean mismaArea(Figura f){
        if(this.area() == f.area()){
            return true;
        }else{
            return false;
        }
    }

    abstract double perimetro();

    /*
     * Al hacer una clase abstracta con metodos abstracto esto provoca que sus subclases sean obligadas 
     * a usar todos los metodos de la clase padre
     */
}
