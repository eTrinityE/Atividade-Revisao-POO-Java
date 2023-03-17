package poo;

public class CodigoPostal {
    private String indicativo;
    private String extensao;
    private String nomeDaZona;

    public CodigoPostal() {}

    public CodigoPostal(String indicativo, String extensao, String nomeDaZona) {
        this.indicativo = indicativo;
        this.extensao = extensao;
        this.nomeDaZona = nomeDaZona;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getNomeDaZona() {
        return nomeDaZona;
    }

    public void setNomeDaZona(String nomeDaZona) {
        this.nomeDaZona = nomeDaZona;
    }

    public void mostrar() {
        System.out.println(indicativo + "-" + extensao + " " + nomeDaZona);
    }
}

