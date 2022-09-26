package com.niveka.designpattern.factory.provider;

import com.niveka.designpattern.factory.StorageProvider;

import java.io.File;

/**
 * The concrete class for Aws S3 Storage type
 */
public class AwsS3Storage implements StorageProvider {
  public AwsS3Storage() {
    // configure your aws sdk connection here
    // var s3 = S3....build()
    System.out.println(" ********  Initializing AwsS3Storage ********* ");
  }
  @Override
  public void putObject(File file) {
    System.out.println("PUT file to S3 storage..");
  }

  @Override
  public File getObject(String path) {
    System.out.println("GET file from S3 storage..");
    return null;
  }
}
