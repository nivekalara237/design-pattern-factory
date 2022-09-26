package com.niveka.designpattern.factory.provider;

import com.niveka.designpattern.factory.StorageProvider;

import java.io.File;

/**
 * The concrete creator class for In Memory Storage type
 */
public class MemoryStorage implements StorageProvider {
  public MemoryStorage() {
    System.out.println(" ********  Initializing MemoryStorage ********* ");
  }
  @Override
  public void putObject(File file) {
    System.out.println("PUT file to server memory..");
  }

  @Override
  public File getObject(String path) {
    System.out.println("PUT file from server memory..");
    return null;
  }
}
