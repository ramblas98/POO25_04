package tp4_ej1;


public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    @Override
    public double area(){
        double semip = (this.ladoA+this.ladoB+this.ladoC)/2;
        return (Math.sqrt(semip*(semip-this.ladoA)*(semip-this.ladoB)*(semip-this.ladoC)));
    }
    
    @Override
    public double perimetro(){
        return (this.ladoA+this.ladoB+this.ladoC);
    }
    
    public boolean esEscaleno(){
        return (this.ladoA!=this.ladoB&&this.ladoA!=this.ladoC&&this.ladoB!=this.ladoC);
    }
    
    public boolean esIsosceles(){
        return(this.ladoA==this.ladoB&&this.ladoC!=this.ladoA||this.ladoB==this.ladoC&&this.ladoA!=this.ladoC||this.ladoA==this.ladoC&&this.ladoB!=this.ladoC);
    }
    
    public boolean esEquilatero(){
        return(this.ladoA==this.ladoB&&this.ladoB==this.ladoC);
    }
    
    public void tipoTriangulo(){
        if(this.esEscaleno()){
           System.out.println("Es un trangulo escaleno");
        }
        else{
            if(this.esIsosceles()){
                System.out.println("Es un trangulo isosceles");
            }
            else{
                System.out.println("Es un trangulo equilatero");
            }
        }
    }
    
}

