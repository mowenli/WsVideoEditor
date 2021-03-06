// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ws_video_editor_sdk.proto

package com.whensunset.wsvideoeditorsdk.model;

public interface MediaStreamHolderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:whensunset.wsvideoeditor.model.MediaStreamHolder)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * 视频的长和宽
   * </pre>
   *
   * <code>optional int32 width = 1;</code>
   */
  int getWidth();

  /**
   * <code>optional int32 height = 2;</code>
   */
  int getHeight();

  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  java.lang.String getCodecType();
  /**
   * <pre>
   * 编解码器的名称
   * </pre>
   *
   * <code>optional string codec_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getCodecTypeBytes();

  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  boolean hasAvgFrameRate();
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational avg_frame_rate = 4;</code>
   */
  com.whensunset.wsvideoeditorsdk.model.Rational getAvgFrameRate();

  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  boolean hasTimeBase();
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational time_base = 5;</code>
   */
  com.whensunset.wsvideoeditorsdk.model.Rational getTimeBase();

  /**
   * <code>optional int64 duration_ts = 6;</code>
   */
  long getDurationTs();

  /**
   * <pre>
   * 视频的旋转角度
   * </pre>
   *
   * <code>optional int32 rotation = 7;</code>
   */
  int getRotation();

  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  boolean hasSampleAspectRatio();
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational sample_aspect_ratio = 8;</code>
   */
  com.whensunset.wsvideoeditorsdk.model.Rational getSampleAspectRatio();

  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  boolean hasGuessedFrameRate();
  /**
   * <code>optional .whensunset.wsvideoeditor.model.Rational guessed_frame_rate = 9;</code>
   */
  com.whensunset.wsvideoeditorsdk.model.Rational getGuessedFrameRate();
}
