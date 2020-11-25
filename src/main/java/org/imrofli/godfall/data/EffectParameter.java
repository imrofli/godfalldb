package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;

@JsonDeserialize(using = EffectParameter.Deserializer.class)
@JsonSerialize(using = EffectParameter.Serializer.class)
public class EffectParameter {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<EffectParameter> {
        @Override
        public EffectParameter deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            EffectParameter value = new EffectParameter();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize EffectParameter");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<EffectParameter> {
        @Override
        public void serialize(EffectParameter obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
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
