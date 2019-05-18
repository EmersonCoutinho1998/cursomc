package com.emerson.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;


import com.emerson.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern= "dd/MM/yyyy")
	private Date dataVencimento;
	@JsonFormat(pattern= "dd/MM/yyyy")
	private Date dataPagamentos;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamentos = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamentos() {
		return dataPagamentos;
	}

	public void setDataPagamentos(Date dataPagamentos) {
		this.dataPagamentos = dataPagamentos;
	}
	
	
	
}
