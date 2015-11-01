package es.ficonlan.web.backend.jersey.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import es.ficonlan.web.backend.model.registration.Registration.RegistrationState;

/**
 * @author Miguel Ángel Castillo Bellagona
 */
public class JsonRegistrationStateDeserializer extends JsonDeserializer<RegistrationState> {

	@Override
	public RegistrationState deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext) throws IOException, JsonProcessingException {
		String type = jsonparser.getText();
		if(type.toLowerCase().contentEquals("inQueue")) 	return RegistrationState.inQueue;
		if(type.toLowerCase().contentEquals("paid")) 		return RegistrationState.paid;
		if(type.toLowerCase().contentEquals("registered")) 	return RegistrationState.registered;
		return null;
	}

}
