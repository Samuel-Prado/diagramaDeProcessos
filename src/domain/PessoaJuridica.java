package domain;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(Integer codigo, String nome, String email, String cnpj) {
        super(codigo, nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaJuridica [cnpj=" + cnpj + "]";
    }

    
    

    
}
