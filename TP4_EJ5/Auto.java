package TP4_EJ5;

public abstract class Auto {
   public static double precioNafta = 127.0;
   public static double precioDiesel = 155.0;
   public static double precioGNC = 70.0;

   protected double combustible;
   protected double km;

   public abstract void cargar(double importe);
   public abstract void recorrer(double km);
   public abstract double consumo(double km);
   public abstract double precioUnidadCombustible();

   public Auto(){}

   public Auto(double combustible, double km){
    this.combustible = combustible;
    this.km = km;
   }
}
