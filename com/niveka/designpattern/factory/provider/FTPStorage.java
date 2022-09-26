package com.niveka.designpattern.factory.provider;

import com.niveka.designpattern.factory.StorageProvider;

import java.io.File;

/**
 * The concrete creator class for FTP Storage type
 */
public class FTPStorage implements StorageProvider {
  public FTPStorage() {
    System.out.println(" ********  Initializing FTPStorage ********* ");
  }
  @Override
  public void putObject(File file) {
    System.out.println("PUT file to FTP Server..");
  }

  @Override
  public File getObject(String path) {
    System.out.println("PUT file from FTP server..");
    return null;
  }
}
