package domain;

import java.util.Date;

public class Custo {
    
    private Integer codigo;

    private Processo processo;

    private Date data;

    private Double valor;

    private String descricao;

    public Custo(Integer codigo, Processo processo, Date data, Double valor, String descricao) {
        this.codigo = codigo;
        this.processo = processo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Custo [codigo=" + codigo + ", processo=" + processo + ", data=" + data + ", valor=" + valor
                + ", descricao=" + descricao + "]";
    }

}
