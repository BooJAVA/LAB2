package vgtu.iip.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TreciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("2Lab", "TreciaActivity.onCreate()");
        setContentView(R.layout.activity_trecia);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                gautiPerduotusDuomenis(intent);
            }
        } else {
            gautiPerduotusDuomenis(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("2Lab", "TreciaActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("2Lab", "TreciaActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("2Lab", "TreciaActivity.onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("2Lab", "TreciaActivity.onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("2Lab", "TreciaActivity.onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("2Lab", "TreciaActivity.onDestroy()");
    }

    void gautiPerduotusDuomenis(Intent intent) {
        Log.i("2Lab", "TreciaActivity.gautiPerduotusDuomenis()");
        TextView laukasIsvedimui = (TextView) findViewById(R.id.rezultatas);
        String tekstas = intent.getStringExtra(Intent.EXTRA_TEXT);
        if (tekstas != null) {
            int kiekis = tekstas.split(" ").length;
            String isvestis = getString(R.string.ivestasTestas)+" '"+tekstas+"' "+getString(R.string.yra)
                    +" "+kiekis+" "+getString(R.string.zodziu);
            laukasIsvedimui.setText(isvestis);
        }
    }
}
