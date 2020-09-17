package com.udacity.jwdnd.course1.cloudstorage.model;

import java.sql.Blob;

// Stores data from FILES table. Simple POJO.
public class FilesORM {
   private Integer fileId;
   private String filename;
   private String contentType;
   private String fileSize;

   // Blob or InputStream ?
   private Blob fileData;

   // Foreign Key points to USERS
   private String userId;

   public FilesORM(Integer fileId, String filename, String contentType,
                   String fileSize, Blob fileData, String userId) {
      this.fileId = fileId;
      this.filename = filename;
      this.contentType = contentType;
      this.fileSize = fileSize;
      this.fileData = fileData;
      this.userId = userId;
   }

   public Integer getFileId() {
      return fileId;
   }

   public void setFileId(Integer fileId) {
      this.fileId = fileId;
   }

   public String getFilename() {
      return filename;
   }

   public void setFilename(String filename) {
      this.filename = filename;
   }

   public String getContentType() {
      return contentType;
   }

   public void setContentType(String contentType) {
      this.contentType = contentType;
   }

   public String getFileSize() {
      return fileSize;
   }

   public void setFileSize(String fileSize) {
      this.fileSize = fileSize;
   }

   public Blob getFileData() {
      return fileData;
   }

   public void setFileData(Blob fileData) {
      this.fileData = fileData;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }
}
