import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import domain.Audiencia;
import domain.Custo;
import domain.Pessoa;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Processo;
import domain.Tribunal;
import domain.Vara;

public class App {
	public static void main(String[] args) throws Exception {

		Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2023");
		Date data2 = new SimpleDateFormat("dd/MM/yyyy").parse("19/09/2023");
		Date data3 = new SimpleDateFormat("dd/MM/yyyy").parse("23/12/2023");
		Date data4 = new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2023");

		Pessoa pessoa = new Pessoa(1, "Samuel Prado Soares", "samuel@gmail.com");
		Pessoa pessoa1 = new Pessoa(2, "Victor Afonso Fernandes", "afonso@gmail.com");

		PessoaFisica pessoaFisica = new PessoaFisica(pessoa.getCodigo(), pessoa.getNome(), pessoa.getEmail(),
				"320.543.415-23");
		PessoaJuridica pessoaJuFisica = new PessoaJuridica(pessoa1.getCodigo(), pessoa1.getNome(), pessoa1.getEmail(),
				"0493.3703.4801-40");

		Tribunal tribunal = new Tribunal(1, "TRF-1");

		Vara vara = new Vara(1, "trabalho", tribunal);

		Processo processo = new Processo("102324-2523.21", vara, tribunal, pessoaFisica, pessoaJuFisica, data1, data2);

		Audiencia audiencia = new Audiencia(data3,
				"Foi que o advogado da parte contrária recomendou que o juiz arquive as acusações contra seu cliente com base nas evidências apresentadas durante a audiência e na alegação de legítima defesa.",
				processo);

		Custo custo = new Custo(data4, "Segunda via de documentos.", 150.50, processo);

		pessoa.setProcessos(Arrays.asList(processo));
		pessoa1.setProcessos(Arrays.asList(processo));

		tribunal.setVaras(Arrays.asList(vara));
		tribunal.setProceessos(Arrays.asList(processo));

		vara.setProcessos(Arrays.asList(processo));

		processo.setAudiencias(Arrays.asList(audiencia));
		processo.setCustos(Arrays.asList(custo));

		System.out.println(pessoaFisica);
		System.out.println(pessoaJuFisica);
		System.out.println(tribunal);
		System.out.println(vara);
		System.out.println(processo);
		System.out.println(audiencia);
		System.out.println(custo);
	}
}
