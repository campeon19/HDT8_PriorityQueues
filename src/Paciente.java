
public class Paciente implements pacienteInterface {
	
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
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
