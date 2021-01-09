package org.imrofli.godfall.data;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = NameUnion.Deserializer.class)
@JsonSerialize(using = NameUnion.Serializer.class)
public class NameUnion {
    public List<String> stringArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<NameUnion> {
        @Override
        public NameUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            NameUnion value = new NameUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                case START_ARRAY:
                    value.stringArrayValue = jsonParser.readValueAs(new TypeReference<List<String>>() {});
                    break;
                default: throw new IOException("Cannot deserialize NameUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<NameUnion> {
        @Override
        public void serialize(NameUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.stringArrayValue != null) {
                jsonGenerator.writeObject(obj.stringArrayValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("NameUnion must not be null");
        }
    }
}
