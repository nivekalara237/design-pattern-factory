package com.niveka.designpattern.factory;
import java.io.File;

public interface StorageProvider {
  void putObject(File file);
  File getObject(String path);
}
