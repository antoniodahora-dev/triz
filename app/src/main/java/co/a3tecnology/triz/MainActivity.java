package co.a3tecnology.triz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.a3tecnology.backlog.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DebugLog.print("olá Mundo");

    }
}