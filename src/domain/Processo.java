package domain;

import java.util.Date;
import java.util.List;

public class Processo {
    
    private Integer numero;

    private Vara vara;

    private Vara tribunal;

    private Pessoa cliente;

    private Pessoa parteContraria;

    private Date abertura;

    private Date conclusao;

    List<Audiencia> audiencias;

    List<Custo> custos;

    public Processo(Integer numero, Vara vara, Vara tribunal, Pessoa cliente, Pessoa parteContraria, Date abertura,
            Date conclusao) {
        this.numero = numero;
        this.vara = vara;
        this.tribunal = tribunal;
        this.cliente = cliente;
        this.parteContraria = parteContraria;
        this.abertura = abertura;
        this.conclusao = conclusao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public Vara getTribunal() {
        return tribunal;
    }

    public void setTribunal(Vara tribunal) {
        this.tribunal = tribunal;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getParteContraria() {
        return parteContraria;
    }

    public void setParteContraria(Pessoa parteContraria) {
        this.parteContraria = parteContraria;
    }

    public Date getAbertura() {
        return abertura;
    }

    public void setAbertura(Date abertura) {
        this.abertura = abertura;
    }

    public Date getConclusao() {
        return conclusao;
    }

    public void setConclusao(Date conclusao) {
        this.conclusao = conclusao;
    }

    public List<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }

    public List<Custo> getCustos() {
        return custos;
    }

    public void setCustos(List<Custo> custos) {
        this.custos = custos;
    }

    @Override
    public String toString() {
        return super.toString() + "Processo [numero=" + numero + ", vara=" + vara + ", tribunal=" + tribunal + ", cliente=" + cliente
                + ", parteContraria=" + parteContraria + ", abertura=" + abertura + ", conclusao=" + conclusao
                + ", audiencias=" + audiencias + ", custos=" + custos + "]";
    }

    
}
