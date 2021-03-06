// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Nostrum.proto

package com.hifun.soul.proto.common;

public final class Nostrums {
  private Nostrums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NostrumOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 propertyId = 1;
    boolean hasPropertyId();
    int getPropertyId();
    
    // required int64 endTime = 2;
    boolean hasEndTime();
    long getEndTime();
    
    // required int32 propertyAmendRate = 3;
    boolean hasPropertyAmendRate();
    int getPropertyAmendRate();
    
    // required int32 propertyAmendMethod = 4;
    boolean hasPropertyAmendMethod();
    int getPropertyAmendMethod();
  }
  public static final class Nostrum extends
      com.google.protobuf.GeneratedMessage
      implements NostrumOrBuilder {
    // Use Nostrum.newBuilder() to construct.
    private Nostrum(Builder builder) {
      super(builder);
    }
    private Nostrum(boolean noInit) {}
    
    private static final Nostrum defaultInstance;
    public static Nostrum getDefaultInstance() {
      return defaultInstance;
    }
    
    public Nostrum getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Nostrums.internal_static_com_hifun_soul_proto_common_Nostrum_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Nostrums.internal_static_com_hifun_soul_proto_common_Nostrum_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 propertyId = 1;
    public static final int PROPERTYID_FIELD_NUMBER = 1;
    private int propertyId_;
    public boolean hasPropertyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPropertyId() {
      return propertyId_;
    }
    
    // required int64 endTime = 2;
    public static final int ENDTIME_FIELD_NUMBER = 2;
    private long endTime_;
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getEndTime() {
      return endTime_;
    }
    
    // required int32 propertyAmendRate = 3;
    public static final int PROPERTYAMENDRATE_FIELD_NUMBER = 3;
    private int propertyAmendRate_;
    public boolean hasPropertyAmendRate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getPropertyAmendRate() {
      return propertyAmendRate_;
    }
    
    // required int32 propertyAmendMethod = 4;
    public static final int PROPERTYAMENDMETHOD_FIELD_NUMBER = 4;
    private int propertyAmendMethod_;
    public boolean hasPropertyAmendMethod() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getPropertyAmendMethod() {
      return propertyAmendMethod_;
    }
    
    private void initFields() {
      propertyId_ = 0;
      endTime_ = 0L;
      propertyAmendRate_ = 0;
      propertyAmendMethod_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPropertyId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPropertyAmendRate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPropertyAmendMethod()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, propertyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, endTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, propertyAmendRate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, propertyAmendMethod_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, propertyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, endTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, propertyAmendRate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, propertyAmendMethod_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Nostrums.Nostrum parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Nostrums.Nostrum prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hifun.soul.proto.common.Nostrums.NostrumOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Nostrums.internal_static_com_hifun_soul_proto_common_Nostrum_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Nostrums.internal_static_com_hifun_soul_proto_common_Nostrum_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Nostrums.Nostrum.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        propertyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        endTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        propertyAmendRate_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        propertyAmendMethod_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Nostrums.Nostrum.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Nostrums.Nostrum getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Nostrums.Nostrum.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Nostrums.Nostrum build() {
        com.hifun.soul.proto.common.Nostrums.Nostrum result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Nostrums.Nostrum buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Nostrums.Nostrum result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Nostrums.Nostrum buildPartial() {
        com.hifun.soul.proto.common.Nostrums.Nostrum result = new com.hifun.soul.proto.common.Nostrums.Nostrum(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.propertyId_ = propertyId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.endTime_ = endTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.propertyAmendRate_ = propertyAmendRate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.propertyAmendMethod_ = propertyAmendMethod_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Nostrums.Nostrum) {
          return mergeFrom((com.hifun.soul.proto.common.Nostrums.Nostrum)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Nostrums.Nostrum other) {
        if (other == com.hifun.soul.proto.common.Nostrums.Nostrum.getDefaultInstance()) return this;
        if (other.hasPropertyId()) {
          setPropertyId(other.getPropertyId());
        }
        if (other.hasEndTime()) {
          setEndTime(other.getEndTime());
        }
        if (other.hasPropertyAmendRate()) {
          setPropertyAmendRate(other.getPropertyAmendRate());
        }
        if (other.hasPropertyAmendMethod()) {
          setPropertyAmendMethod(other.getPropertyAmendMethod());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPropertyId()) {
          
          return false;
        }
        if (!hasEndTime()) {
          
          return false;
        }
        if (!hasPropertyAmendRate()) {
          
          return false;
        }
        if (!hasPropertyAmendMethod()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              propertyId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              endTime_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              propertyAmendRate_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              propertyAmendMethod_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 propertyId = 1;
      private int propertyId_ ;
      public boolean hasPropertyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPropertyId() {
        return propertyId_;
      }
      public Builder setPropertyId(int value) {
        bitField0_ |= 0x00000001;
        propertyId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPropertyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        propertyId_ = 0;
        onChanged();
        return this;
      }
      
      // required int64 endTime = 2;
      private long endTime_ ;
      public boolean hasEndTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getEndTime() {
        return endTime_;
      }
      public Builder setEndTime(long value) {
        bitField0_ |= 0x00000002;
        endTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTime_ = 0L;
        onChanged();
        return this;
      }
      
      // required int32 propertyAmendRate = 3;
      private int propertyAmendRate_ ;
      public boolean hasPropertyAmendRate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getPropertyAmendRate() {
        return propertyAmendRate_;
      }
      public Builder setPropertyAmendRate(int value) {
        bitField0_ |= 0x00000004;
        propertyAmendRate_ = value;
        onChanged();
        return this;
      }
      public Builder clearPropertyAmendRate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        propertyAmendRate_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 propertyAmendMethod = 4;
      private int propertyAmendMethod_ ;
      public boolean hasPropertyAmendMethod() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getPropertyAmendMethod() {
        return propertyAmendMethod_;
      }
      public Builder setPropertyAmendMethod(int value) {
        bitField0_ |= 0x00000008;
        propertyAmendMethod_ = value;
        onChanged();
        return this;
      }
      public Builder clearPropertyAmendMethod() {
        bitField0_ = (bitField0_ & ~0x00000008);
        propertyAmendMethod_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.Nostrum)
    }
    
    static {
      defaultInstance = new Nostrum(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.Nostrum)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_Nostrum_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_Nostrum_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rNostrum.proto\022\033com.hifun.soul.proto.co" +
      "mmon\"f\n\007Nostrum\022\022\n\npropertyId\030\001 \002(\005\022\017\n\007e" +
      "ndTime\030\002 \002(\003\022\031\n\021propertyAmendRate\030\003 \002(\005\022" +
      "\033\n\023propertyAmendMethod\030\004 \002(\005B\'\n\033com.hifu" +
      "n.soul.proto.commonB\010Nostrums"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_Nostrum_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_Nostrum_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_Nostrum_descriptor,
              new java.lang.String[] { "PropertyId", "EndTime", "PropertyAmendRate", "PropertyAmendMethod", },
              com.hifun.soul.proto.common.Nostrums.Nostrum.class,
              com.hifun.soul.proto.common.Nostrums.Nostrum.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
