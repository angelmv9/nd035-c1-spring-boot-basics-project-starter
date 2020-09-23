package com.udacity.jwdnd.course1.cloudstorage.mappers;

import com.udacity.jwdnd.course1.cloudstorage.model.FilesORM;
import org.apache.ibatis.annotations.*;

@Mapper
public interface FilesMapper {

   @Select("SELECT * FROM FILES")
   FilesORM getFile();

   @Insert("INSERT INTO FILES (fileId,filename,contenttype,filesize,filedata," +
           "userid) VALUES (#{fileId},#{filename},#{contentType},#{fileSize}," +
           "#{fileData},#{userId})")
   @Options(useGeneratedKeys = true, keyProperty = "fileId")
   int uploadFile(FilesORM file);

   @Delete("DELETE FROM FILES WHERE fileId = #{fileId}")
   int removeFile(int fileId);


}
