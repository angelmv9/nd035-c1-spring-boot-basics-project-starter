package com.udacity.jwdnd.course1.cloudstorage.model;

// Stores data from CREDENTIALS table. Simple POJO.
public class CredentialsORM {
   private Integer credentialId;
   private String url;
   private String username;
   private String key;
   private String password;

   // Foreign Key points to USERS
   private Integer userid;

   public CredentialsORM(Integer credentialId, String url, String username,
                         String key, String password, Integer userid) {
      this.credentialId = credentialId;
      this.url = url;
      this.username = username;
      this.key = key;
      this.password = password;
      this.userid = userid;
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

   public Integer getUserid() {
      return userid;
   }

   public void setUserid(Integer userid) {
      this.userid = userid;
   }
}