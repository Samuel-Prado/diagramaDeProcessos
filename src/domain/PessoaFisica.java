package domain;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(Integer codigo, String nome, String email, String cpf) {
        super(codigo, nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica [cpf=" + cpf + "]";
    }

     


}