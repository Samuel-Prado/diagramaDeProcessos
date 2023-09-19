package domain;

import java.util.List;

public class Vara {

    private Integer codigo;

    private String nome;

    private Tribunal tribunal;

    private List<Processo> processos;

    public Vara(Integer codigo, String nome, Tribunal tribunal) {
        this.codigo = codigo;
        this.nome = nome;
        this.tribunal = tribunal;
    }

    public Integer getCodigo() {
        return codigo;
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

    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "Vara [codigo=" + codigo + ", nome=" + nome + ", tribunal=" + tribunal + ", processos=" + processos
                + "]";
    }

    
}
