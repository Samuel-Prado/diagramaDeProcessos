package domain;

import java.util.List;

public class Tribunal {

    private Integer codigo;

    private String nome;
    
    private List<Processo> proceessos; 

    private List<Vara> varas;

    public Tribunal(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<Processo> getProceessos() {
        return proceessos;
    }

    public void setProceessos(List<Processo> proceessos) {
        this.proceessos = proceessos;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vara> getVaras() {
        return varas;
    }

    public void setVaras(List<Vara> varas) {
        this.varas = varas;
    }

    @Override
    public String toString() {
        return "Tribunal [codigo=" + codigo + ", nome=" + nome + "]";
    }

    
}
