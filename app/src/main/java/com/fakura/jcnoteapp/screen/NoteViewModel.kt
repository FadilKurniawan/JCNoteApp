package com.fakura.jcnoteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.fakura.jcnoteapp.data.NoteDataSource
import com.fakura.jcnoteapp.model.Note

class NoteViewModel: ViewModel() {
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note:Note){
        noteList.add(note)
    }

    fun removeNote(note:Note){
        noteList.remove(note)
    }

    fun getAllNote():List<Note> {
        return noteList
    }
}