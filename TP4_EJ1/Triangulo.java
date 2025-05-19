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

    public Triangulo(){}

    
    public boolean esEquilatero(){
        if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC ){
            return true;
        }else{
            return false;
        }
    }

    public boolean esIsosceles(){
        if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            return true;
        }else{
            return false;
        }
    }

    public boolean esEscaleno(){
        if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
            return true;
        }else{
            return false;
        }
    }

    public boolean esRectangulo(){
        double hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
        if(hipotenusa == (Math.PI/2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
    }

    
}
