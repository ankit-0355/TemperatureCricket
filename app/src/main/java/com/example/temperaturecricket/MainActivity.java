package com.example.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnsubmit;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btnsubmit = findViewById(R.id.btnsubmit);
        tvresult = findViewById(R.id.tvresult);
        tvresult.setVisibility(View.GONE);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = etID.getText().toString().trim();
                int num = Integer.parseInt((id));
                int ans = (num/3)+4;
                tvresult.setText("The approximate temperature outside is \n"+ans+" degrees Celcius");
                tvresult.setVisibility(View.VISIBLE);
            }
        });
    }
}
