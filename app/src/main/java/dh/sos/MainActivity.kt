package dh.sos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.idenfy.permissionissue.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Called after some button click, to return to clientActivity and pass result
     */
    fun returnToClientActivity(){
        val intent = Intent()
        intent.putExtra("responseKey", "response")
        setResult(1110, intent)
        finish()
    }

}