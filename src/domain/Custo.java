package domain;

import java.util.Date;

public class Custo {

    private Date data;

    private String descricao;
    
    private Double valor;

    private Processo processo;

    public Custo(Date data, String descricao, Double valor, Processo processo) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.processo = processo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    @Override
    public String toString() {
        return "Custo [data=" + data + ", descricao=" + descricao + ", valor=" + valor + ", processo=" + processo + "]";
    }

   

}
