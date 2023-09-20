package domain;

import java.util.Date;

public class Audiencia {
    
    private Date data;

    private String recomendacao;

    private Processo processo;

    public Audiencia(Date data, String recomendacao, Processo processo) {
        this.data = data;
        this.recomendacao = recomendacao;
        this.processo = processo;
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

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return "Audiencia [data=" + data + ", recomendacao=" + recomendacao + ", processo=" + processo + "]";
    }

}