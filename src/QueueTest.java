import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testFactory() {
		QueueFactory<Paciente> factory = new QueueFactory<Paciente>();
		PriorityQueueInterface<Paciente> pacientes = factory.Queue(1);
		pacientes.add(new Paciente("Carlos", "Coronavirus", "B"));
		pacientes.add(new Paciente("Paola", "Gripe", "E"));
		pacientes.add(new Paciente("Pepito", "Tibia fracturada", "A"));
		assertEquals("A", pacientes.getFirst().getEmergencia());
	}

}
