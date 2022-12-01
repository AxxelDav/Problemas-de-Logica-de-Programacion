package ejercicio47;

public class Usuario {
    private String nombre;
    private String aficion;

    public Usuario(String nombre, String aficion) {
        this.nombre = nombre;
        this.aficion = aficion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAficion() {
        return aficion;
    }

    public void setAficion(String aficion) {
        this.aficion = aficion;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", aficion='" + aficion + '\'' +
                '}';
    }
}
