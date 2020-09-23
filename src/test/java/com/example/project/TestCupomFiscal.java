package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCupomFiscal {

	private String BREAK = System.lineSeparator();

	@Test
	public void lojaCompleta() {
		rodarTestarRetorno("Arcos Dourados Com. de Alimentos LTDA" + BREAK + 
				"Av. Projetada Leste, 500 EUC F32/33/34" + BREAK + 
				"Br. Sta Genebra - Campinas - SP" + BREAK + 
				"CEP:13080-395 Tel (19) 3756-7408" + BREAK + 
				"Loja 1317 (PDP)" + BREAK + 
				"CNPJ: 42.591.651/0797-34" + BREAK + 
				"IE: 244.898.500.113" + BREAK);
	}

	@Test
	public void nomeVazio() {
		CupomFiscal.NOME_LOJA = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo nome da loja é obrigatório", e.getMessage());
		}
		CupomFiscal.NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	}
	
	@Test
	public void logradouroVazio() {
		CupomFiscal.LOGRADOURO = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo logradouro do endereço é obrigatório", e.getMessage());
		}
		CupomFiscal.LOGRADOURO = "Av. Projetada Leste";
	}

	@Test
	public void numeroZero() {
		CupomFiscal.NUMERO = 0;
		rodarTestarRetorno("Arcos Dourados Com. de Alimentos LTDA" + BREAK +
				"Av. Projetada Leste, s/n EUC F32/33/34" + BREAK +
				"Br. Sta Genebra - Campinas - SP" + BREAK +
				"CEP:13080-395 Tel (19) 3756-7408" + BREAK +
				"Loja 1317 (PDP)" + BREAK +
				"CNPJ: 42.591.651/0797-34" + BREAK +
				"IE: 244.898.500.113" + BREAK);

		CupomFiscal.NUMERO = 500;
	}
	
	@Test
	public void municipioVazio() {
		CupomFiscal.MUNICIPIO = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo município do endereço é obrigatório", e.getMessage());
		}
		CupomFiscal.MUNICIPIO = "Campinas";
	}

	@Test
	public void estadoVazio() {
		CupomFiscal.ESTADO = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo estado do endereço é obrigatório", e.getMessage());
		}
	    CupomFiscal.ESTADO = "SP";
	}
	
	@Test
	public void cnpjVazio() {
		CupomFiscal.CNPJ = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo CNPJ da loja é obrigatório", e.getMessage());
		}
	    CupomFiscal.CNPJ = "42.591.651/0797-34";
	}

	@Test
	public void inscricaoEstadualVazia() {
		CupomFiscal.INSCRICAO_ESTADUAL = "";
		try {
			CupomFiscal.dadosLoja();
		} catch (RuntimeException e) {
			assertEquals("O campo inscrição estadual da loja é obrigatório", e.getMessage());
		}
		CupomFiscal.INSCRICAO_ESTADUAL = "244.898.500.113";
	}
	
	@Test
	public void exercicio02_Customizado() {
		//Defina seus próprios valores para as variáveis a seguir 
		CupomFiscal.NOME_LOJA = "LOJAS AMERICANAS S.A.";
		CupomFiscal.LOGRADOURO = "R SACADURA CABRAL";
		CupomFiscal.NUMERO = 102;
		CupomFiscal.COMPLEMENTO = "";
		CupomFiscal.BAIRRO = "GAMBOA";
		CupomFiscal.MUNICIPIO = "RIO DE JANEIRO";
		CupomFiscal.ESTADO = "RJ";
		CupomFiscal.CEP = "20.221-160";
		CupomFiscal.TELEFONE = "(21) 2206-6708";
		CupomFiscal.OBSERVACAO = "47.11-3-02 Comercio varejista de mercadorias em geral";
		CupomFiscal.CNPJ = "33.014.556/0001-96";
		CupomFiscal.INSCRICAO_ESTADUAL = "85.687.08-5";
		
		//E atualize o texto esperado abaixo
		rodarTestarRetorno("LOJAS AMERICANAS S.A." + BREAK +
				"R SACADURA CABRAL, 102 " + BREAK +
				"GAMBOA - RIO DE JANEIRO - RJ" + BREAK +
				"CEP:20.221-160 Tel (21) 2206-6708" + BREAK +
				"47.11-3-02 Comercio varejista de mercadorias em geral" + BREAK +
				"CNPJ: 33.014.556/0001-96" + BREAK +
				"IE: 85.687.08-5" + BREAK);
	}

	private void rodarTestarRetorno(String expected) {

		// action
		String retorno = CupomFiscal.dadosLoja();

		// assertion
		assertEquals(expected, retorno);
	}
}
