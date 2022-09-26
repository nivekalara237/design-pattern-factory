package com.niveka.designpattern.factory.provider;

import com.niveka.designpattern.factory.StorageProvider;

import java.io.File;

/**
 * The concrete creator class for Rackspace Storage type
 */
public class RackspaceStorage implements StorageProvider {
  public RackspaceStorage() {
    System.out.println(" ********  Initializing RackspaceStorage ********* ");
  }
  @Override
  public void putObject(File file) {
    System.out.println("PUT file to Rackspace cloud files..");
  }

  @Override
  public File getObject(String path) {
    System.out.println("GET file from Rackspace cloud files..");
    return null;
  }
}
