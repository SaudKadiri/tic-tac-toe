package found.grp5.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiplayerBtn: Button = findViewById(R.id.multiplayer_btn)
        multiplayerBtn.setOnClickListener {
            val intent = Intent(this, Multiplayer::class.java)
            startActivity(intent)
        }

        val vsComputerBtn: Button = findViewById(R.id.vs_comp_btn)
        vsComputerBtn.setOnClickListener {
            val intent = Intent(this, Multiplayer::class.java)
            startActivity(intent)
        }
    }
}