package org.unq.conversor.app.ui

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.unq.conversor.app.R
import org.unq.conversor.app.domain.Conversor

class MainActivity extends Activity {
  Conversor model

  override void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState)
    contentView = R.layout.activity_main

    this.model = new Conversor

    convertirButton.onClickListener = [
        model.kilometros = Double.parseDouble(kilometrosEditView.text.toString)
        model.convertir()
        millasTextView.text = model.millas.toString + " millas"
    ]
  }

  def TextView getMillasTextView() {
    return findViewById(R.id.millasTextView) as TextView
  }

  def EditText getKilometrosEditView() {
    return findViewById(R.id.kilometrosEditView) as EditText
  }

  def Button getConvertirButton() {
    return findViewById(R.id.convertir_button) as Button
  }
}
