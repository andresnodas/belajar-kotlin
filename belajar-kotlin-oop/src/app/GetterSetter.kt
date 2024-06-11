package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    note.title = ""

    println(note.title)

    val bigNote = BigNote("Belajar Getter Setter")
    println(bigNote.title)
    println(bigNote.bigTitle)
}