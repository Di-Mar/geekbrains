package space.dimar.a1l1_hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloWorldTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setOnBtnClickListener();
    }

    private  void initViews() {
        helloWorldTextView = findViewById(R.id.helloWorldtextView);
        button = findViewById(R.id.button);
    }

    private void setOnBtnClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getString(R.string.hello_fl);
                int color = ContextCompat.getColor(getBaseContext(), R.color.colorPrimaryDark);
                helloWorldTextView.setText(text);
                helloWorldTextView.setTextColor(color);
            }
        });

    }
}