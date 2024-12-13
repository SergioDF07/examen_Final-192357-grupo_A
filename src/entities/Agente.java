package entities;

public class Agente extends Entidad {
    public String habilidadEspecial;
    private String misionAsignada;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }


    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void entrenar(String habilidadEspecial, int incremento) {
        incremento = 2;
        habilidadEspecial += incremento;
        System.out.println("habilidad " + this.habilidadEspecial + " aumentada en " + incremento);
    }


    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }


    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
