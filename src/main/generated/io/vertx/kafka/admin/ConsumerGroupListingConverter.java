package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import io.vertx.core.spi.json.JsonCodec;

/**
 * Converter and Codec for {@link io.vertx.kafka.admin.ConsumerGroupListing}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.ConsumerGroupListing} original class using Vert.x codegen.
 */
public class ConsumerGroupListingConverter implements JsonCodec<ConsumerGroupListing, JsonObject> {

  public static final ConsumerGroupListingConverter INSTANCE = new ConsumerGroupListingConverter();

  @Override public JsonObject encode(ConsumerGroupListing value) { return (value != null) ? value.toJson() : null; }

  @Override public ConsumerGroupListing decode(JsonObject value) { return (value != null) ? new ConsumerGroupListing(value) : null; }

  @Override public Class<ConsumerGroupListing> getTargetClass() { return ConsumerGroupListing.class; }

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, ConsumerGroupListing obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "groupId":
          if (member.getValue() instanceof String) {
            obj.setGroupId((String)member.getValue());
          }
          break;
        case "simpleConsumerGroup":
          if (member.getValue() instanceof Boolean) {
            obj.setSimpleConsumerGroup((Boolean)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(ConsumerGroupListing obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(ConsumerGroupListing obj, java.util.Map<String, Object> json) {
    if (obj.getGroupId() != null) {
      json.put("groupId", obj.getGroupId());
    }
    json.put("simpleConsumerGroup", obj.isSimpleConsumerGroup());
  }
}
