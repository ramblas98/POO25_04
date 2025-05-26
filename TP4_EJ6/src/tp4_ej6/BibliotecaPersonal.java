
package tp4_ej6;

public class BibliotecaPersonal {
    
    private Lectura[] lecturas;
    private int cantLec;

    public BibliotecaPersonal() {
    }

    public BibliotecaPersonal(Lectura[] lecturas, int cantLec) {
        this.lecturas = lecturas;
        this.cantLec = cantLec;
    }
    
     public BibliotecaPersonal(int capacidad) {
        this.lecturas = new Lectura[capacidad];
        this.cantLec = 0;
    }

    
    public int getCantLec() {
        return cantLec;
    }
    
    public void AgregarLectura(Lectura l) {
        
        for (int i = 0; i < this.cantLec; i++) {
            
            if (this.lecturas[i].getTitulo().equalsIgnoreCase(l.getTitulo())) {
                
                System.out.println("Esta Lectura ya existe.");
                return;
                
            }
        }

        this.lecturas[cantLec++] = l;
        
    }
    
    public void ElminarLectura(String m) {
        
        for (int i=0; i<this.cantLec; i++) {
            
            if (this.lecturas[i].getTitulo().equals(m) || this.lecturas[i].getAutor().equals(m)) {
                
                for (int j=i; j<this.cantLec-1; j++) {
                    
                    this.lecturas[j] = this.lecturas[j+1];
                    
                }
                
                this.cantLec--;
                
                break;
                
            }
            
        }
        
        System.out.println("La Obra No Existe...");
        
    }
    
    public Lectura LecturaMayor() {
        
        if (this.cantLec == 0) return null;
        
        int may = this.lecturas[0].getPuntuacion();
        Lectura mayor = null;
        
        for (int i=1; i<this.cantLec; i++) {
            
            if (this.lecturas[i].getPuntuacion() > may) {
                
                may = this.lecturas[i].getPuntuacion();
                mayor = this.lecturas[i];
                
            }
            
        }
        
        return mayor;
        
    }
    
    public Lectura LecturaMenor() {
        
         if (cantLec == 0) return null;
        
        int men = this.lecturas[0].getPuntuacion();
        Lectura menor = null;
        
        for (int i=1; i<this.cantLec; i++) {
            
            if (this.lecturas[i].getPuntuacion() < men) {
                
                men = this.lecturas[i].getPuntuacion();
                menor = this.lecturas[i];
                
            }
            
        }
        
        return menor;
        
    }
    
    public void ResumenGeneral() {
        
        for (int i=0; i<this.cantLec; i++) {
            
             System.out.println(lecturas[i].getTitulo() + ": " + lecturas[i].Resumen());
            
        }
        
    }
    
    public int TiempoTotal() {
        
        int total = 0;
        
        for (int i=0; i<this.cantLec; i++) {
            
            total += this.lecturas[i].TiempoEstimadoLectura();
            
        }
        
        return total;
        
    }
    
}
