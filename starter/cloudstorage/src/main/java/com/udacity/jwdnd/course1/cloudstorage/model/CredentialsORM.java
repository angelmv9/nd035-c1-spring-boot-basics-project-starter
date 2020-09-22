package com.udacity.jwdnd.course1.cloudstorage.model;

// Stores data from CREDENTIALS table. Simple POJO.

// functionality similar to LastPass: stores url, username, password
public class CredentialsORM {
   private Integer credentialId;
   private String url;
   private String username;
   private String key; //salt
   private String password;

   // Foreign Key points to USERS
   private Integer userId;

   public CredentialsORM(Integer credentialId, String url, String username,
                         String key, String password, Integer userid) {
      this.credentialId = credentialId;
      this.url = url;
      this.username = username;
      this.key = key;
      this.password = password;
      this.userId = userid;
   }

   public Integer getCredentialId() {
      return credentialId;
   }

   public void setCredentialId(Integer credentialId) {
      this.credentialId = credentialId;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getKey() {
      return key;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }
}
