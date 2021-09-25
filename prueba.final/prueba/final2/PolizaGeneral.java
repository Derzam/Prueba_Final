package prueba.final2;

public class PolizaGeneral extends Main {
	private String nombre;
	private String descripcion;
	private String a�oVigencia;
	private String codigoPoliza;
	private int valorDePoliza;

	private static String codigoDescuento;
	private static String numeroDeSeguro;

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

	public String getA�oVigencia() {
		return a�oVigencia;
	}

	public void setA�oVigencia(String a�oVigencia) {
		this.a�oVigencia = a�oVigencia;
	}

	public String getCodigoPoliza() {
		return codigoPoliza;
	}

	public void setCodigoPoliza(String codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
		//
	}

	public int getValorDePoliza() {
		return valorDePoliza;
	}

	public void setValorDePoliza(int valorDePoliza) {
		this.valorDePoliza = valorDePoliza;
	}

	public static String getCodigoDescuento() {
		return codigoDescuento;
	}

	public static void setCodigoDescuento(String codigoDescuento) {
		PolizaGeneral.codigoDescuento = codigoDescuento;
	}

	public static String getNumeroDeSeguro() {
		return numeroDeSeguro;
	}

	public static void setNumeroDeSeguro(String numeroDeSeguro) {
		PolizaGeneral.numeroDeSeguro = numeroDeSeguro;
	}

	@Override
	public String toString() {
		return "PolizaGeneral [nombre=" + nombre + ", descripcion=" + descripcion + ", a�oVigencia=" + a�oVigencia
				+ ", codigoPoliza=" + codigoPoliza + ", valorDePoliza=" + valorDePoliza + "]";
	}
	

}
