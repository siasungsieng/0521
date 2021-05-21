package tw.edu.pu.textexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var size: Float = 30f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bigger(view: View){
        //val txv:TextView = findViewById<TextView>(R.id.txv)
        if (size<40){
            size++
            txv.textSize = size
            txv.text = size.toString()
        }
        else{
            //findViewById<Button>(R.id.btn).isEnabled = false
            btn.isEnabled = false
        }
    }

}

