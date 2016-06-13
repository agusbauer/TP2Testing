package tp2;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class ServerGeneratorSupplier extends ParameterSupplier{ 
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature arg0) throws Throwable {
		Deserialization deserialization = new Deserialization("salidaKorat.txt");
		ArrayList<Server> deserializedServers = deserialization.deserialize();
		if(deserializedServers == null){
			System.out.println("Deserializacion de servers retorna null");
			return null;
		}
		List<PotentialAssignment> servers = new ArrayList<PotentialAssignment>();	
		for (int i = 0; i < deserializedServers.size(); i++) {			
			servers.add(PotentialAssignment.forValue(Integer.toString(i), deserializedServers.get(i)));
		}
		return servers;
	} 
}


