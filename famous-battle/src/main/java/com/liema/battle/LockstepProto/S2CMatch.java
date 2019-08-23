// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package com.liema.battle.LockstepProto;

/**
 * Protobuf type {@code LockstepProto.S2CMatch}
 */
public  final class S2CMatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.S2CMatch)
    S2CMatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use S2CMatch.newBuilder() to construct.
  private S2CMatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private S2CMatch() {
    actors_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private S2CMatch(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              actors_ = new java.util.ArrayList<BattleActor>();
              mutable_bitField0_ |= 0x00000001;
            }
            actors_.add(
                input.readMessage(BattleActor.parser(), extensionRegistry));
            break;
          }
          case 16: {

            seed_ = input.readUInt32();
            break;
          }
          case 24: {

            mapId_ = input.readSInt32();
            break;
          }
          case 32: {

            battleStartTime_ = input.readSInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        actors_ = java.util.Collections.unmodifiableList(actors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return NetMessageOuterClass.internal_static_LockstepProto_S2CMatch_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return NetMessageOuterClass.internal_static_LockstepProto_S2CMatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            S2CMatch.class, Builder.class);
  }

  private int bitField0_;
  public static final int ACTORS_FIELD_NUMBER = 1;
  private java.util.List<BattleActor> actors_;
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  public java.util.List<BattleActor> getActorsList() {
    return actors_;
  }
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  public java.util.List<? extends BattleActorOrBuilder>
      getActorsOrBuilderList() {
    return actors_;
  }
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  public int getActorsCount() {
    return actors_.size();
  }
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  public BattleActor getActors(int index) {
    return actors_.get(index);
  }
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  public BattleActorOrBuilder getActorsOrBuilder(
      int index) {
    return actors_.get(index);
  }

  public static final int SEED_FIELD_NUMBER = 2;
  private int seed_;
  /**
   * <code>uint32 seed = 2;</code>
   */
  public int getSeed() {
    return seed_;
  }

  public static final int MAPID_FIELD_NUMBER = 3;
  private int mapId_;
  /**
   * <code>sint32 mapId = 3;</code>
   */
  public int getMapId() {
    return mapId_;
  }

  public static final int BATTLESTARTTIME_FIELD_NUMBER = 4;
  private long battleStartTime_;
  /**
   * <code>sint64 battleStartTime = 4;</code>
   */
  public long getBattleStartTime() {
    return battleStartTime_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < actors_.size(); i++) {
      output.writeMessage(1, actors_.get(i));
    }
    if (seed_ != 0) {
      output.writeUInt32(2, seed_);
    }
    if (mapId_ != 0) {
      output.writeSInt32(3, mapId_);
    }
    if (battleStartTime_ != 0L) {
      output.writeSInt64(4, battleStartTime_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < actors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, actors_.get(i));
    }
    if (seed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, seed_);
    }
    if (mapId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(3, mapId_);
    }
    if (battleStartTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt64Size(4, battleStartTime_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof S2CMatch)) {
      return super.equals(obj);
    }
    S2CMatch other = (S2CMatch) obj;

    if (!getActorsList()
        .equals(other.getActorsList())) return false;
    if (getSeed()
        != other.getSeed()) return false;
    if (getMapId()
        != other.getMapId()) return false;
    if (getBattleStartTime()
        != other.getBattleStartTime()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getActorsCount() > 0) {
      hash = (37 * hash) + ACTORS_FIELD_NUMBER;
      hash = (53 * hash) + getActorsList().hashCode();
    }
    hash = (37 * hash) + SEED_FIELD_NUMBER;
    hash = (53 * hash) + getSeed();
    hash = (37 * hash) + MAPID_FIELD_NUMBER;
    hash = (53 * hash) + getMapId();
    hash = (37 * hash) + BATTLESTARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBattleStartTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static S2CMatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static S2CMatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static S2CMatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static S2CMatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static S2CMatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static S2CMatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static S2CMatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static S2CMatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static S2CMatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static S2CMatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static S2CMatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static S2CMatch parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(S2CMatch prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LockstepProto.S2CMatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.S2CMatch)
      S2CMatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NetMessageOuterClass.internal_static_LockstepProto_S2CMatch_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NetMessageOuterClass.internal_static_LockstepProto_S2CMatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              S2CMatch.class, Builder.class);
    }

    // Construct using LockstepProto.S2CMatch.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getActorsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (actorsBuilder_ == null) {
        actors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        actorsBuilder_.clear();
      }
      seed_ = 0;

      mapId_ = 0;

      battleStartTime_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return NetMessageOuterClass.internal_static_LockstepProto_S2CMatch_descriptor;
    }

    @Override
    public S2CMatch getDefaultInstanceForType() {
      return S2CMatch.getDefaultInstance();
    }

    @Override
    public S2CMatch build() {
      S2CMatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public S2CMatch buildPartial() {
      S2CMatch result = new S2CMatch(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (actorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          actors_ = java.util.Collections.unmodifiableList(actors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.actors_ = actors_;
      } else {
        result.actors_ = actorsBuilder_.build();
      }
      result.seed_ = seed_;
      result.mapId_ = mapId_;
      result.battleStartTime_ = battleStartTime_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof S2CMatch) {
        return mergeFrom((S2CMatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(S2CMatch other) {
      if (other == S2CMatch.getDefaultInstance()) return this;
      if (actorsBuilder_ == null) {
        if (!other.actors_.isEmpty()) {
          if (actors_.isEmpty()) {
            actors_ = other.actors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActorsIsMutable();
            actors_.addAll(other.actors_);
          }
          onChanged();
        }
      } else {
        if (!other.actors_.isEmpty()) {
          if (actorsBuilder_.isEmpty()) {
            actorsBuilder_.dispose();
            actorsBuilder_ = null;
            actors_ = other.actors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            actorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActorsFieldBuilder() : null;
          } else {
            actorsBuilder_.addAllMessages(other.actors_);
          }
        }
      }
      if (other.getSeed() != 0) {
        setSeed(other.getSeed());
      }
      if (other.getMapId() != 0) {
        setMapId(other.getMapId());
      }
      if (other.getBattleStartTime() != 0L) {
        setBattleStartTime(other.getBattleStartTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      S2CMatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (S2CMatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<BattleActor> actors_ =
      java.util.Collections.emptyList();
    private void ensureActorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        actors_ = new java.util.ArrayList<BattleActor>(actors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        BattleActor, BattleActor.Builder, BattleActorOrBuilder> actorsBuilder_;

    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public java.util.List<BattleActor> getActorsList() {
      if (actorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actors_);
      } else {
        return actorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public int getActorsCount() {
      if (actorsBuilder_ == null) {
        return actors_.size();
      } else {
        return actorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public BattleActor getActors(int index) {
      if (actorsBuilder_ == null) {
        return actors_.get(index);
      } else {
        return actorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder setActors(
        int index, BattleActor value) {
      if (actorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActorsIsMutable();
        actors_.set(index, value);
        onChanged();
      } else {
        actorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder setActors(
        int index, BattleActor.Builder builderForValue) {
      if (actorsBuilder_ == null) {
        ensureActorsIsMutable();
        actors_.set(index, builderForValue.build());
        onChanged();
      } else {
        actorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder addActors(BattleActor value) {
      if (actorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActorsIsMutable();
        actors_.add(value);
        onChanged();
      } else {
        actorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder addActors(
        int index, BattleActor value) {
      if (actorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActorsIsMutable();
        actors_.add(index, value);
        onChanged();
      } else {
        actorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder addActors(
        BattleActor.Builder builderForValue) {
      if (actorsBuilder_ == null) {
        ensureActorsIsMutable();
        actors_.add(builderForValue.build());
        onChanged();
      } else {
        actorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder addActors(
        int index, BattleActor.Builder builderForValue) {
      if (actorsBuilder_ == null) {
        ensureActorsIsMutable();
        actors_.add(index, builderForValue.build());
        onChanged();
      } else {
        actorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder addAllActors(
        Iterable<? extends BattleActor> values) {
      if (actorsBuilder_ == null) {
        ensureActorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, actors_);
        onChanged();
      } else {
        actorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder clearActors() {
      if (actorsBuilder_ == null) {
        actors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        actorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public Builder removeActors(int index) {
      if (actorsBuilder_ == null) {
        ensureActorsIsMutable();
        actors_.remove(index);
        onChanged();
      } else {
        actorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public BattleActor.Builder getActorsBuilder(
        int index) {
      return getActorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public BattleActorOrBuilder getActorsOrBuilder(
        int index) {
      if (actorsBuilder_ == null) {
        return actors_.get(index);  } else {
        return actorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public java.util.List<? extends BattleActorOrBuilder>
         getActorsOrBuilderList() {
      if (actorsBuilder_ != null) {
        return actorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actors_);
      }
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public BattleActor.Builder addActorsBuilder() {
      return getActorsFieldBuilder().addBuilder(
          BattleActor.getDefaultInstance());
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public BattleActor.Builder addActorsBuilder(
        int index) {
      return getActorsFieldBuilder().addBuilder(
          index, BattleActor.getDefaultInstance());
    }
    /**
     * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
     */
    public java.util.List<BattleActor.Builder>
         getActorsBuilderList() {
      return getActorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        BattleActor, BattleActor.Builder, BattleActorOrBuilder>
        getActorsFieldBuilder() {
      if (actorsBuilder_ == null) {
        actorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            BattleActor, BattleActor.Builder, BattleActorOrBuilder>(
                actors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        actors_ = null;
      }
      return actorsBuilder_;
    }

    private int seed_ ;
    /**
     * <code>uint32 seed = 2;</code>
     */
    public int getSeed() {
      return seed_;
    }
    /**
     * <code>uint32 seed = 2;</code>
     */
    public Builder setSeed(int value) {
      
      seed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 seed = 2;</code>
     */
    public Builder clearSeed() {
      
      seed_ = 0;
      onChanged();
      return this;
    }

    private int mapId_ ;
    /**
     * <code>sint32 mapId = 3;</code>
     */
    public int getMapId() {
      return mapId_;
    }
    /**
     * <code>sint32 mapId = 3;</code>
     */
    public Builder setMapId(int value) {
      
      mapId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint32 mapId = 3;</code>
     */
    public Builder clearMapId() {
      
      mapId_ = 0;
      onChanged();
      return this;
    }

    private long battleStartTime_ ;
    /**
     * <code>sint64 battleStartTime = 4;</code>
     */
    public long getBattleStartTime() {
      return battleStartTime_;
    }
    /**
     * <code>sint64 battleStartTime = 4;</code>
     */
    public Builder setBattleStartTime(long value) {
      
      battleStartTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>sint64 battleStartTime = 4;</code>
     */
    public Builder clearBattleStartTime() {
      
      battleStartTime_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LockstepProto.S2CMatch)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.S2CMatch)
  private static final S2CMatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new S2CMatch();
  }

  public static S2CMatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<S2CMatch>
      PARSER = new com.google.protobuf.AbstractParser<S2CMatch>() {
    @Override
    public S2CMatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new S2CMatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<S2CMatch> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<S2CMatch> getParserForType() {
    return PARSER;
  }

  @Override
  public S2CMatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

