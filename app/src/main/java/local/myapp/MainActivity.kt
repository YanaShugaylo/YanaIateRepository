package local.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var myText: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById<TextView>(R.id.MyText).
            text.toString()
    }
    fun onClickRun(view: View) {
        var text = WordsOnText(myText)
        var words: ArrayList<String> = text.getFiveLongestWords()

        val adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, words)
        val listView: ListView = findViewById(R.id.words)
        listView.adapter = adapter
    }
}