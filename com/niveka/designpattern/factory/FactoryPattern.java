package com.niveka.designpattern.factory;

import com.niveka.designpattern.factory.provider.ProviderType;

import java.io.File;

public class FactoryPattern {
  public static void main(String[] args) {
    // Amazonn S3 Storage
    StorageProvider s3 = StorageFactory.newProvider(ProviderType.AWS_S3);
    s3.putObject(new File("/path/to/file.ext"));
    s3.getObject("/path/to/cloud/file.ext");

    // FTP server
    StorageProvider ftp = StorageFactory.newProvider(ProviderType.FTP);
    ftp.putObject(new File("/path/to/file.ext"));
    ftp.getObject("/path/to/server/file.ext");

    // In Memory storage
    StorageProvider memo = StorageFactory.newProvider(ProviderType.IN_MEMO);
    memo.putObject(new File("/path/to/file.ext"));
    memo.getObject("/path/to/file.ext");

    // In Alibaba OSS (no yet implemented)
    StorageProvider ali_oss = StorageFactory.newProvider(ProviderType.ALIBABA_OSS);
    ali_oss.putObject(new File("/path/to/file.ext"));
    ali_oss.getObject("/path/to/cloud/file.ext");
  }
}
