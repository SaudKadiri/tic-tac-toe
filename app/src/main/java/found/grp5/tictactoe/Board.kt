package found.grp5.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.Toast
import found.grp5.tictactoe.databinding.ActivityBoardBinding


class Board : AppCompatActivity(), View.OnClickListener {

    private var xTurn = true
    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewbinding = ActivityBoardBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        viewbinding.button00.setOnClickListener(this)
        viewbinding.button01.setOnClickListener(this)
        viewbinding.button02.setOnClickListener(this)

        viewbinding.button10.setOnClickListener(this)
        viewbinding.button11.setOnClickListener(this)
        viewbinding.button12.setOnClickListener(this)

        viewbinding.button20.setOnClickListener(this)
        viewbinding.button21.setOnClickListener(this)
        viewbinding.button22.setOnClickListener(this)
    }


    override fun onClick(view: View?) {
        toast?.cancel()
        val button: Button = findViewById(view!!.id)
        if (button.text == "O" || button.text == "X") {
            return
        }
        button.text = if (xTurn) "X" else "O"
        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 72f)
        toast = Toast.makeText(this@Board, "Next turn: ${if (xTurn) "O" else "X"}", Toast.LENGTH_SHORT)
        toast?.show()
        xTurn = !xTurn
    }
}