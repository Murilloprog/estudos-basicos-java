package quartasemana.enu_m;

public enum EstadoBrasileiro {  
    SAO_PAULO ("SP","São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 9),
	PIAUI ("PI", "Piauí", 8),
	MARANHAO ("MA","Maranhão", 7),
    CEARA ("CE", "Ceará", 6);
	
	private String nome;
	private String sigla;
	private int ibge;

	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
        this.ibge = ibge; 
	}
    public int getIbge() {
        return ibge;
    }
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
    
}
