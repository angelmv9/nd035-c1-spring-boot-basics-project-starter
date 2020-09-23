package com.udacity.jwdnd.course1.cloudstorage.model;

// Stores data from NOTES table. Simple POJO.
public class NotesORM {
   private Integer noteId;
   private String noteTitle;
   private String noteDescription;

   // Foreign Key points to USERS
   private Integer userId;

   public NotesORM(Integer noteId, String noteTitle, String noteDescription,
                   Integer userId) {
      this.noteId = noteId;
      this.noteTitle = noteTitle;
      this.noteDescription = noteDescription;
      this.userId = userId;
   }

   public Integer getNoteId() {
      return noteId;
   }

   public void setNoteId(Integer noteId) {
      this.noteId = noteId;
   }

   public String getNoteTitle() {
      return noteTitle;
   }

   public void setNoteTitle(String noteTitle) {
      this.noteTitle = noteTitle;
   }

   public String getNoteDescription() {
      return noteDescription;
   }

   public void setNoteDescription(String noteDescription) {
      this.noteDescription = noteDescription;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }
}
