package com.example.notepad.ViewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.notepad.Model.Note
import com.example.notepad.Repository.NoteRepository


class NoteViewModel : ViewModel() {

    fun insert(context: Context, note: Note) {
        NoteRepository.insert(context, note)
    }

    fun update(context: Context, note: Note) {
        NoteRepository.update(context, note)
    }

    fun delete(context: Context, note: Note) {
        NoteRepository.delete(context, note)
    }

    fun getNotes(context: Context): LiveData<List<Note>>? {
        return NoteRepository.getNotes(context)
    }

}