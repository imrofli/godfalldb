package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;

@JsonDeserialize(using = ConditionParamCategory.Deserializer.class)
@JsonSerialize(using = ConditionParamCategory.Serializer.class)
public class ConditionParamCategory {
    public Long integerValue;
    public BoonWhitelistTagElement enumValue;

    static class Deserializer extends JsonDeserializer<ConditionParamCategory> {
        @Override
        public ConditionParamCategory deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            ConditionParamCategory value = new ConditionParamCategory();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = BoonWhitelistTagElement.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                default: throw new IOException("Cannot deserialize ConditionParamCategory");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<ConditionParamCategory> {
        @Override
        public void serialize(ConditionParamCategory obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
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
