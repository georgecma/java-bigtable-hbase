// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface InstanceOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.InstanceOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .google.bigtable.admin.v2.ClusterOperationMetadata clusters = 2;</code>
   */
  java.util.List<com.google.bigtable.admin.v2.ClusterOperationMetadata> 
      getClustersList();
  /**
   * <code>repeated .google.bigtable.admin.v2.ClusterOperationMetadata clusters = 2;</code>
   */
  com.google.bigtable.admin.v2.ClusterOperationMetadata getClusters(int index);
  /**
   * <code>repeated .google.bigtable.admin.v2.ClusterOperationMetadata clusters = 2;</code>
   */
  int getClustersCount();
  /**
   * <code>repeated .google.bigtable.admin.v2.ClusterOperationMetadata clusters = 2;</code>
   */
  java.util.List<? extends com.google.bigtable.admin.v2.ClusterOperationMetadataOrBuilder> 
      getClustersOrBuilderList();
  /**
   * <code>repeated .google.bigtable.admin.v2.ClusterOperationMetadata clusters = 2;</code>
   */
  com.google.bigtable.admin.v2.ClusterOperationMetadataOrBuilder getClustersOrBuilder(
      int index);
}