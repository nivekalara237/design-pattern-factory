package com.niveka.designpattern.factory;

import com.niveka.designpattern.factory.provider.*;

/**
 * The creator class
 */
public class StorageFactory {
  public static StorageProvider newProvider(ProviderType type) {
    StorageProvider storageProvider;
    switch (type) {
      case AWS_S3:
        storageProvider = new AwsS3Storage();
        break;
      case FTP:
        storageProvider = new FTPStorage();
        break;
      case IN_MEMO:
        storageProvider = new MemoryStorage();
        break;
      case AZURE_OSS:
        storageProvider = new AzureStorage();
        break;
      case RACKSPACE:
        storageProvider = new RackspaceStorage();
        break;
      default:
        throw new RuntimeException("The provider " + type + " is no yet supported");
    }
    return storageProvider;
  }
}
