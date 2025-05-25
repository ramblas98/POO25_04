
package tp4_ej3;

public class Triangulo extends Figura {
    
    private double base;
    private double ladoA;
    private double ladoB;

    public Triangulo() {
    }
    
    public Triangulo(double base, double ladoA, double ladoB) {
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getBase() {
        return base;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public double Perimetro() {
        
        return base + ladoA + ladoB;
        
    }

    @Override
    public double Area() {
        
        double s = Perimetro() / 2;
        return Math.sqrt(s * (s - base) * (s - ladoA) * (s - ladoB));
        
    }
    
    public TipoTriangulo DeterminarTipo() {
        
        double[] lados = {base, ladoA, ladoB};
        java.util.Arrays.sort(lados); // Ordenamos: lados[2] es el mayor
        boolean esRectangulo = Math.abs(Math.pow(lados[2], 2) - (Math.pow(lados[0], 2) + Math.pow(lados[1], 2))) < 0.0001;

        if (esRectangulo) {
            return TipoTriangulo.Rectangulo;
        }
        
        if (this.base == this.ladoA && this.base == this.ladoB && this.ladoA == this.ladoB) {
            
            return TipoTriangulo.Equilatero;
            
        } else if (this.ladoA == this.ladoB) {
            
            return TipoTriangulo.Isoceles;
            
        } else {
            
            return TipoTriangulo.Escaleno;
            
        }
        
    }
    
}
