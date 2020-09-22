package com.udacity.jwdnd.course1.cloudstorage.mappers;

import com.udacity.jwdnd.course1.cloudstorage.model.NotesORM;
import org.apache.ibatis.annotations.*;

@Mapper
public interface NotesMapper {

   @Select("SELECT * FROM NOTES")
   NotesORM getNote();

   @Insert("INSERT INTO NOTES (notetitle, notedescription, userid) " +
           "VALUES (#{noteTitle},#{noteDescription},#{userId})")
   @Options(useGeneratedKeys = true, keyProperty = "noteid")
   int insertNote(NotesORM note);


   @Update("UPDATE NOTES SET notedescription = #{noteDescription}, notetitle = " +
           "#{noteTitle} WHERE noteid = #{noteId}" + "notetitle = #{noteTitle}")
   int updateNote(NotesORM updatedNote);

   @Delete("DELETE FROM NOTES WHERE noteid = #{noteId}")
   int deleteNote(int noteId);

}
