package org.unq.conversor.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    getSayHelloButton().setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        getTextView().setVisibility(View.VISIBLE);
      }
    });
  }

  private TextView getTextView() {
    return (TextView) findViewById(R.id.hello_view);
  }

  private Button getSayHelloButton() {
    return (Button) findViewById(R.id.say_hello_button);
  }
}
