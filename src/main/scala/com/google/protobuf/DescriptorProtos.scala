package com.google.protobuf

object DescriptorProtos {
  class FileDescriptorProto

  def getDescriptor(): Descriptors.FileDescriptor = ???
  object FileDescriptorProto {
    def parseFrom(b: Array[Byte]): FileDescriptorProto = ???
  }
}

object UnknownFieldSet {
  class Field
}

class Message