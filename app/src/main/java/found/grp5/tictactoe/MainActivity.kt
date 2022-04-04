package found.grp5.tictactoe

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.Window
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiplayerBtn: Button = findViewById(R.id.multiplayer_btn)
        multiplayerBtn.setOnClickListener {
            val intent = Intent(this, Board::class.java)
            startActivity(intent)
        }

        val vsComputerBtn: Button = findViewById(R.id.vs_comp_btn)
        vsComputerBtn.setOnClickListener {
            val intent = Intent(this, Board::class.java)
            startActivity(intent)
        }
    }
}