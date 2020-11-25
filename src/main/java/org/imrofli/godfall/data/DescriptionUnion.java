package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = DescriptionUnion.Deserializer.class)
@JsonSerialize(using = DescriptionUnion.Serializer.class)
public class DescriptionUnion {
    public List<String> stringArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<DescriptionUnion> {
        @Override
        public DescriptionUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            DescriptionUnion value = new DescriptionUnion();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                case START_ARRAY:
                    value.stringArrayValue = jsonParser.readValueAs(new TypeReference<List<String>>() {});
                    break;
                default: throw new IOException("Cannot deserialize DescriptionUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<DescriptionUnion> {
        @Override
        public void serialize(DescriptionUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.stringArrayValue != null) {
                jsonGenerator.writeObject(obj.stringArrayValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
