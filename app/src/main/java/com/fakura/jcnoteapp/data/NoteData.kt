package com.fakura.jcnoteapp.data

import com.fakura.jcnoteapp.model.Note

class NoteDataSource{
    fun loadNotes(): List<Note>{
        return  listOf(
            Note(title = "A good day", description = "we went on a vacation by the lake"),
            Note(title = "A great day", description = "we went on a honeymoon by the island"),
            Note(title = "Android Compose", description = "working on android compose")
        )
    }
}