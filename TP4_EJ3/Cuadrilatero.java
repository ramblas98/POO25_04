abstract class Cuadrilatero extends Figura{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double ladoD;

    @Override
    final double area(){
        return 0;
    }

    @Override
    final double perimetro(){
        return 0;
    }
    /*
     * Al usar la palabra reservada final en los metodos, esto provoca que las clases
     * hijas no puedan reescribir los metodos de la clase padre
     */
}
