package domain;

import java.util.Date;

public class Audiencia {
    
    private Integer numero;

    private Date data;

    private String recomendacao;

    public Audiencia(Integer numero, Date data, String recomendacao) {
        this.numero = numero;
        this.data = data;
        this.recomendacao = recomendacao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    @Override
    public String toString() {
        return "Audiencia [numero=" + numero + ", data=" + data + ", recomendacao=" + recomendacao + "]";
    }
    
}
