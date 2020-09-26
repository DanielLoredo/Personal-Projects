package inventariobite;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Libro {
 
    private int id;
    private String titulo;
    private String autor;
    private String ubicacion;
    private String lector;
    private String tipo;

    public Libro(int id, String titulo, String autor, String ubicacion, String lector, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ubicacion = ubicacion;
        this.lector = lector;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    void guardarLibro(PrintWriter Pw) {
        Pw.println(id);
        Pw.println(titulo);
        Pw.println(autor);
        Pw.println(ubicacion);
        Pw.println(lector);
        Pw.println(tipo);
    }

    public Libro obtenerLibro(BufferedReader Br) {
        
        int folio;
        String tit,aut,ubi,lec,tip;
        
        try{
            
            folio = Integer.parseInt(Br.readLine());
            tit = Br.readLine();
            aut = Br.readLine();
            ubi = Br.readLine();
            lec = Br.readLine();
            tip = Br.readLine();
            
            return new Libro(folio,tit,aut,ubi,lec,tip);
            
        }catch (Exception e){
            
        }return null;
    }

    
    
    
}
