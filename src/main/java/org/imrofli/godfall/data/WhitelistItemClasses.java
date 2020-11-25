package org.imrofli.godfall.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = WhitelistItemClasses.Deserializer.class)
@JsonSerialize(using = WhitelistItemClasses.Serializer.class)
public class WhitelistItemClasses {
    public List<ItemType> enumArrayValue;
    public ItemType enumValue;

    static class Deserializer extends JsonDeserializer<WhitelistItemClasses> {
        @Override
        public WhitelistItemClasses deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            WhitelistItemClasses value = new WhitelistItemClasses();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = ItemType.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_ARRAY:
                    value.enumArrayValue = jsonParser.readValueAs(new TypeReference<List<ItemType>>() {});
                    break;
                default: throw new IOException("Cannot deserialize WhitelistItemClasses");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<WhitelistItemClasses> {
        @Override
        public void serialize(WhitelistItemClasses obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.enumArrayValue != null) {
                jsonGenerator.writeObject(obj.enumArrayValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("WhitelistItemClasses must not be null");
        }
    }
}
