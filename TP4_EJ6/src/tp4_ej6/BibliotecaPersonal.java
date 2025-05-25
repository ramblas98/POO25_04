
package tp4_ej6;

public class BibliotecaPersonal {
    
    private Lectura[] lecturas;
    private int cantLec;

    public BibliotecaPersonal() {
    }
    
    public int getCantLec() {
        return cantLec;
    }
    
    public void AgregarLectura(Lectura l) {
        
        int ban = 0;
        
        for (int i=0; i<this.cantLec; i++) {
            
            if (this.lecturas[i].getTitulo().equals(l.getTitulo())) {
                
                ban = 1;
                break;
                
            }
            
        }
        
        if (ban != 1) {
            
            this.lecturas[cantLec] = l;
            this.cantLec++;
            
        } else {
            
            System.out.println("Esta Lectura Ya Existe..");
            
        }
        
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
            
            System.out.println(this.lecturas[i].Resumen());
            
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
