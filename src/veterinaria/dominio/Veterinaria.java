package veterinaria.dominio;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Mascota> pacientes;

    public  Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado){
        if ((sexo.equalsIgnoreCase("Macho")&& edad>12 && !esterilizado)
                ||(sexo.equalsIgnoreCase("Hembra")&& edad>18 && !esterilizado)){
            return new MascotaApta(nombre,sexo,edad,esterilizado);
        }else if (esterilizado){
            return new MascotaEsterilizada(nombre,sexo,edad,esterilizado);
        }else {
            return new MascotaNoApta(nombre,sexo,edad,esterilizado);
        }
    }
    public List<MascotaApta> getPacientesAOperar(){
        List<MascotaApta> mascotaList=new ArrayList<>();
        for (Mascota mascota:this.pacientes) {
            if (mascota instanceof MascotaApta){
                if (!mascota.isEsterilizado()){
                    mascotaList.add((MascotaApta) mascota);
                }
            }
        }
        return mascotaList;
    }
    public void operar(){
        for (Mascota mascota:this.pacientes) {
            if (mascota instanceof MascotaApta){
                ((MascotaApta) mascota).operar();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Mascota> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Mascota> pacientes) {
        this.pacientes = pacientes;
    }
}