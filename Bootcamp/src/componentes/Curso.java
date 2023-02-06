package componentes;

public class Curso extends Conteudo {
    
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    //Curso cargaHoraria
    public int getData() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: {" +
                "'Titulo: " + getTitulo() + '\'' +
                ",'Descricao: " + getDescricao() + '\'' +
                ",'cargaHoraria: " + cargaHoraria +
                " horas'}";
    }
}
