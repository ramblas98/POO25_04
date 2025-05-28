
package tp4_ej5;

public abstract class Auto {
    
    private double combustible;
    private double km;

    protected void agregarCombustible(double unidades) {
        this.combustible += unidades;
    }

    protected boolean consumirCombustible(double unidades) {
        if (combustible >= unidades) {
            combustible -= unidades;
            return true;
        }
        return false;
    }

    protected void sumarKm(double kms) {
        this.km += kms;
    }

    protected double getCombustible() {
        return combustible;
    }

    protected double getKm() {
        return km;
    }

    public abstract void cargar(double importe);
    public abstract void recorrer(double kilometros);
    public abstract double consumo(double kilometros);
    public abstract double precioUnidadCombustible();
    
}