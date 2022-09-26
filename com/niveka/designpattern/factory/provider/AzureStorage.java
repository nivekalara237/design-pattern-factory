package com.niveka.designpattern.factory.provider;

import com.niveka.designpattern.factory.StorageProvider;

import java.io.File;

/**
 * The concrete creator class for Azure Storage type
 */
public class AzureStorage implements StorageProvider {
  public AzureStorage() {
    System.out.println(" ********  Initializing AzureStorage ********* ");
  }
  @Override
  public void putObject(File file) {
    System.out.println("PUT file to Microsoft Azure storage..");
  }

  @Override
  public File getObject(String path) {
    System.out.println("PUT file from Microsoft Azure storage..");
    return null;
  }
}
