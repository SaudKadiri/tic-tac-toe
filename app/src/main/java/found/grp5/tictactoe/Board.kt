package found.grp5.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_board.*

class Board : AppCompatActivity(), View.OnClickListener {

    private var xTurn = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)

        button_00.setOnClickListener(this)
        button_01.setOnClickListener(this)
        button_02.setOnClickListener(this)

        button_10.setOnClickListener(this)
        button_11.setOnClickListener(this)
        button_12.setOnClickListener(this)

        button_20.setOnClickListener(this)
        button_21.setOnClickListener(this)
        button_22.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val button: Button = findViewById(view!!.id)
        if (button.text == "O" || button.text == "X") {
            return
        }
        button.text = if (xTurn) "X" else "O"
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 72f)
        Toast.makeText(this@Board, "Next turn: ${if (xTurn) "O" else "X"}", Toast.LENGTH_SHORT).show()
        xTurn = !xTurn
    }
}