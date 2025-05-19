public class Triangulo extends Figura{
    private double ladoA; //base / ladoA
    private double ladoB; //altura / ladoB
    private double ladoC;

    @Override
    public double area(){
        return (ladoA*ladoB)/2;
    }

    @Override
    public double perimetro(){
        return ladoA + ladoB + ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    
}
