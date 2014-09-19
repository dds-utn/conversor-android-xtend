package org.unq.conversor.app.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.unq.conversor.app.R;
import org.unq.conversor.app.domain.Conversor;

public class MainActivity extends Activity {
  private Conversor model;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.model = new Conversor();

    getConvertirButton().setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        model.setKilometros(Double.parseDouble(getKilometrosEditView().getText().toString()));
        model.convertir();
        getMillasTextView().setText(model.getMillas().toString() + " millas");
      }
    });
  }

  private TextView getMillasTextView() {
    return (TextView) findViewById(R.id.millasTextView);
  }

  private EditText getKilometrosEditView() {
    return (EditText) findViewById(R.id.kilometrosEditView);
  }

  private Button getConvertirButton() {
    return (Button) findViewById(R.id.convertir_button);
  }
}
