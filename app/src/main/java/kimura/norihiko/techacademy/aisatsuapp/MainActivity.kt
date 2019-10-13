package kimura.norihiko.techacademy.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()
        }

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if ("$hour:$minute" >= "2:0" && "$hour:$minute" <= "9:59"){
                    textView.text = "おはよう"
                } else if ("$hour:$minute" >= "10:0" && "$hour:$minute" <= "17:59") {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            }, 13, 0, true)
        timePickerDialog.show()
    }
}
