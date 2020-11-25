package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = AnyUnion.Deserializer.class)
@JsonSerialize(using = AnyUnion.Serializer.class)
public class AnyUnion {
    public List<AnyElement> enumArrayValue;
    public AllEnum enumValue;

    static class Deserializer extends JsonDeserializer<AnyUnion> {
        @Override
        public AnyUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            AnyUnion value = new AnyUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = AllEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_ARRAY:
                    value.enumArrayValue = jsonParser.readValueAs(new TypeReference<List<AnyElement>>() {});
                    break;
                default: throw new IOException("Cannot deserialize AnyUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<AnyUnion> {
        @Override
        public void serialize(AnyUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumArrayValue != null) {
                jsonGenerator.writeObject(obj.enumArrayValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("AnyUnion must not be null");
        }
    }
}
