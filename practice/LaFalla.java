package ChainOfResponsability.practice;

public class LaFalla {
    private String titulo;
    private String severidad;
    private String descripcion;

    public LaFalla(String titulo, String ci, String age) {
        this.titulo = titulo;
        this.severidad = ci;
        this.descripcion = age;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void showInfo(){
        System.out.println("severidad:"+ severidad);
        System.out.println("titulo:"+ titulo);
        System.out.println("descripcion:"+ descripcion);
    }
}
