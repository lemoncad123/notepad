package com.example.notepad.Dao

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.notepad.Model.Note


interface NoteDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)


    @Query("SELECT * FROM note ORDER BY id DESC")
    fun getNotes() : LiveData<List<Note>>

    @Update
    suspend fun update(note: Note)


    @Delete
    suspend fun delete(note: Note)
}