package veterinaria.dominio;

public abstract class Mascota {
    private String nombre;
    private String sexo;
    private int edad;
    private boolean esterilizado;

    public Mascota(String nombre, String sexo, int edad, boolean esterilizado) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = esterilizado;
    }

    public String getNombre() {
        return nombre;
    }


    public String getSexo() {
        return sexo;
    }


    public int getEdad() {
        return edad;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
