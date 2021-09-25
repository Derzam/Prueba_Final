package prueba.final2;

public class PolizaVip extends Main {
	private String nombre;
	private String descripcion;
	private String añoVigencia;
	private String codigoPoliza;
	private int valorDePoliza;

	private String Beneficio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAñoVigencia() {
		return añoVigencia;
	}

	public void setAñoVigencia(String añoVigencia) {
		this.añoVigencia = añoVigencia;
	}

	public String getCodigoPoliza() {
		return codigoPoliza;
	}

	public void setCodigoPoliza(String codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
	}

	public int getValorDePoliza() {
		return valorDePoliza;
	}

	public void setValorDePoliza(int valorDePoliza) {
		this.valorDePoliza = valorDePoliza;
	}

	public String getBeneficio() {
		return Beneficio;
	}

	public void setBeneficio(String beneficio) {
		Beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "PolizaVip [nombre=" + nombre + ", descripcion=" + descripcion + ", añoVigencia=" + añoVigencia
				+ ", codigoPoliza=" + codigoPoliza + ", valorDePoliza=" + valorDePoliza + ", Beneficio=" + Beneficio
				+ "]";
	}
	

}
