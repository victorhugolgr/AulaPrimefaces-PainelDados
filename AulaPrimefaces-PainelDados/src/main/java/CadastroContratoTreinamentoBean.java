import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroContratoTreinamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private BigDecimal valorContrato;
	private String metodoPagamento;
	private String formaPagamento;
	private List<String> cursos;

	public void Cadastrar() {

	}

	public BigDecimal getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCidadeContrato() {
		return cidadeContrato;
	}

	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

}
