package com.manojbhadane.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.manojbhadane.QButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QButton qButton = (QButton) findViewById(R.id.btn);

        qButton.setCornerRadious(5);
        qButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        qButton.setStrokeWidth(5);
        qButton.setStrokeDashGap(5);
        qButton.setStrokeDashWidth(90);
        qButton.setStrokeColor(getResources().getColor(R.color.colorPrimaryDark));

    }
}
