package org.unq.conversor.app.ui

import org.unq.conversor.app.R
import org.unq.conversor.app.domain.Conversor
import org.xtendroid.app.AndroidActivity
import org.xtendroid.app.OnCreate

@AndroidActivity(R.layout.activity_main) class MainActivity {
  Conversor model

  @OnCreate
  def init() {
    this.model = new Conversor

    convertirButton.onClickListener = [
        model.kilometros = Double.parseDouble(kilometrosEditView.text.toString)
        model.convertir()
        millasTextView.text = model.millas.toString + " millas"
    ]
  }
}
