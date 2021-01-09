package org.imrofli.godfall.data;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = LootQuantityRandomizedWhitelistTag.Deserializer.class)
@JsonSerialize(using = LootQuantityRandomizedWhitelistTag.Serializer.class)
public class LootQuantityRandomizedWhitelistTag {
    public List<Index> enumArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<LootQuantityRandomizedWhitelistTag> {
        @Override
        public LootQuantityRandomizedWhitelistTag deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            LootQuantityRandomizedWhitelistTag value = new LootQuantityRandomizedWhitelistTag();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                case START_ARRAY:
                    value.enumArrayValue = jsonParser.readValueAs(new TypeReference<List<Index>>() {});
                    break;
                default: throw new IOException("Cannot deserialize LootQuantityRandomizedWhitelistTag");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<LootQuantityRandomizedWhitelistTag> {
        @Override
        public void serialize(LootQuantityRandomizedWhitelistTag obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumArrayValue != null) {
                jsonGenerator.writeObject(obj.enumArrayValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("LootQuantityRandomizedWhitelistTag must not be null");
        }
    }
}
