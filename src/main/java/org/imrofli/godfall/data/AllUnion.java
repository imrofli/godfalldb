package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;

@JsonDeserialize(using = AllUnion.Deserializer.class)
@JsonSerialize(using = AllUnion.Serializer.class)
public class AllUnion {
    public Boolean boolValue;
    public AllEnum enumValue;

    static class Deserializer extends JsonDeserializer<AllUnion> {
        @Override
        public AllUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            AllUnion value = new AllUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = AllEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                default: throw new IOException("Cannot deserialize AllUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<AllUnion> {
        @Override
        public void serialize(AllUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
