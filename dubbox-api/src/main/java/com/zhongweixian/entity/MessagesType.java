// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.zhongweixian.entity;

/**
 * Protobuf enum {@code src.main.proto.MessagesType}
 */
public enum MessagesType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *普通文本消息
   * </pre>
   *
   * <code>TEXT = 0;</code>
   */
  TEXT(0),
  /**
   * <pre>
   *链接消息
   * </pre>
   *
   * <code>LINK_TEXT = 1;</code>
   */
  LINK_TEXT(1),
  /**
   * <pre>
   *图片链接消息
   * </pre>
   *
   * <code>LINK_IMGAE = 2;</code>
   */
  LINK_IMGAE(2),
  /**
   * <pre>
   *支付消息
   * </pre>
   *
   * <code>LINK_PAY = 3;</code>
   */
  LINK_PAY(3),
  /**
   * <pre>
   *红包消息
   * </pre>
   *
   * <code>RED_PAY = 4;</code>
   */
  RED_PAY(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *普通文本消息
   * </pre>
   *
   * <code>TEXT = 0;</code>
   */
  public static final int TEXT_VALUE = 0;
  /**
   * <pre>
   *链接消息
   * </pre>
   *
   * <code>LINK_TEXT = 1;</code>
   */
  public static final int LINK_TEXT_VALUE = 1;
  /**
   * <pre>
   *图片链接消息
   * </pre>
   *
   * <code>LINK_IMGAE = 2;</code>
   */
  public static final int LINK_IMGAE_VALUE = 2;
  /**
   * <pre>
   *支付消息
   * </pre>
   *
   * <code>LINK_PAY = 3;</code>
   */
  public static final int LINK_PAY_VALUE = 3;
  /**
   * <pre>
   *红包消息
   * </pre>
   *
   * <code>RED_PAY = 4;</code>
   */
  public static final int RED_PAY_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessagesType valueOf(int value) {
    return forNumber(value);
  }

  public static MessagesType forNumber(int value) {
    switch (value) {
      case 0: return TEXT;
      case 1: return LINK_TEXT;
      case 2: return LINK_IMGAE;
      case 3: return LINK_PAY;
      case 4: return RED_PAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessagesType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessagesType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessagesType>() {
          public MessagesType findValueByNumber(int number) {
            return MessagesType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.zhongweixian.entity.Chat.getDescriptor()
        .getEnumTypes().get(4);
  }

  private static final MessagesType[] VALUES = values();

  public static MessagesType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessagesType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:src.main.proto.MessagesType)
}

