
public class Paciente implements Comparable<Paciente> {
	
	private String nombre;
	private String descripcionSintoma;
	private String codigoEmergencia;
	
	public Paciente(String nom, String sintoma, String emergencia) {
		
		nombre = nom;
		descripcionSintoma = sintoma;
		codigoEmergencia = emergencia;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getSintoma() {
		return descripcionSintoma;
	}
	
	public String getEmergencia() {
		return codigoEmergencia;
	}

	@Override
	public int compareTo(Paciente emergencia) {
		// TODO Auto-generated method stub
		return codigoEmergencia.compareTo(emergencia.getEmergencia());
	}
	
	public String toString() {
		return nombre + ", " + descripcionSintoma + ", " + codigoEmergencia;
	}

	
}
