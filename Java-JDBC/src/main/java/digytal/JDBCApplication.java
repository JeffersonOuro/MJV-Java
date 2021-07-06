package digytal;

import digytal.dao.CadastroDao;
import digytal.dao.CadastroJpaDao;
import digytal.model.Cadastro;

public class JDBCApplication {
	//https://produto.mercadolivre.com.br/MLB-1508139395-planilha-excel-para-cadastro-de-clientes-e-fornecedores-_JM?matt_tool=70509262&matt_word=&matt_source=google&matt_campaign_id=12408848785&matt_ad_group_id=119017168518&matt_match_type=&matt_network=g&matt_device=c&matt_creative=500385009285&matt_keyword=&matt_ad_position=&matt_ad_type=pla&matt_merchant_id=337607914&matt_product_id=MLB1508139395&matt_product_partition_id=296321646450&matt_target_id=pla-296321646450&gclid=Cj0KCQjw2tCGBhCLARIsABJGmZ4pJM5fRDbEw4rACndRpLnPOPPWEOhDEcsja3sc6bIzZgXVC7baJYIaApGTEALw_wcB
	static CadastroDao dao = new CadastroDao();
	
	public static void main(String[] args) {
		
		testeCadastroJPA();
	}
	private static void testeCadastroJPA() {
		CadastroJpaDao jpaDao = new CadastroJpaDao();
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("TOMAS JEFFERSON");
		cadastro.setTelefone(98098976543l);
		
		jpaDao.incluir(cadastro);
	}
	
	
}
