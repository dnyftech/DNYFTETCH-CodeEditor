package com.dnyfetch.codeeditor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.rosemoe.sora.widget.CodeEditor
import io.github.rosemoe.sora.langs.text.JavaLanguage

class CodeEditorActivity : AppCompatActivity() {

    private lateinit var editor: CodeEditor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_editor)

        editor = findViewById(R.id.codeEditor)
        editor.setEditorLanguage(JavaLanguage())
    }
}