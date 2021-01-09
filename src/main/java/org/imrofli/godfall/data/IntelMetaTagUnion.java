package org.imrofli.godfall.data;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = IntelMetaTagUnion.Deserializer.class)
@JsonSerialize(using = IntelMetaTagUnion.Serializer.class)
public class IntelMetaTagUnion {
    public List<IntelMetaTagEnum> enumArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<IntelMetaTagUnion> {
        @Override
        public IntelMetaTagUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            IntelMetaTagUnion value = new IntelMetaTagUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                case START_ARRAY:
                    value.enumArrayValue = jsonParser.readValueAs(new TypeReference<List<IntelMetaTagEnum>>() {});
                    break;
                default: throw new IOException("Cannot deserialize IntelMetaTagUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<IntelMetaTagUnion> {
        @Override
        public void serialize(IntelMetaTagUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumArrayValue != null) {
                jsonGenerator.writeObject(obj.enumArrayValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("IntelMetaTagUnion must not be null");
        }
    }
}
