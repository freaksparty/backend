/*
 * Copyright 2020 Asociación Cultural Freak's Party
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.ficonlan.web.backend.jersey.util.serializer;

import java.io.IOException;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import es.ficonlan.web.backend.entities.Activity.ActivityType;

/**
 * @author Siro Gonz&aacute;lez <xiromoreira>
 */
public class JsonActivityTypeDeserializer extends JsonDeserializer<ActivityType> {	
	
	@Override
	public ActivityType deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext) 
			throws IOException, JsonProcessingException {
		String typeName = StringUtils.capitalize(jsonparser.getText());
		for(ActivityType type : ActivityType.values()) {
			if(typeName.contentEquals(type.name())) return type;
		}
		return null;
	}

}
