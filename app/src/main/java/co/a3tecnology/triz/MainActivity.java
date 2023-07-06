package co.a3tecnology.triz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.a3tecnology.backlog.RebugLog;
import co.a3tecnology.crashlog.CrashLog;
import co.a3tecnology.newlibrary.NewLog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrashLog.print("oi");
        NewLog.print("oi");
        RebugLog.print("oi");
    }
}