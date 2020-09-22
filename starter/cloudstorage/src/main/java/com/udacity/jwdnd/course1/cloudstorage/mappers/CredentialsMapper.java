package com.udacity.jwdnd.course1.cloudstorage.mappers;

import com.udacity.jwdnd.course1.cloudstorage.model.CredentialsORM;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CredentialsMapper {

   @Select("SELECT * FROM CREDENTIALS")
   CredentialsORM getCredentials();

   @Insert("INSERT INTO CREDENTIALS (url, username, key, password, userid) " +
           "VALUES (#{url}, #{username}, #{key}, #{password}, #{userId})")
   @Options(useGeneratedKeys = true, keyProperty = "credentialId")
   int insertCredentials(CredentialsORM credentials);


   @Update("UPDATE CREDENTIALS SET url = #{url}, username = #{username}," +
           "password = #{password} WHERE credentialid = #{credentialId}")
   int updateCredentials(CredentialsORM updatedCredentials);

   @Delete("DELETE FROM CREDENTIALS WHERE credentialid = #{credentialId}")
   int deleteCredentials(int credentialId);

}