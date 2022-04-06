package c.aarsh121.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class snakbarrun extends AppCompatActivity {
    FloatingActionButton fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snakbarrun);
        fb=(FloatingActionButton)findViewById(R.id.flb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=Snackbar.make(findViewById(R.id.idlayout),"This is Sample SnackBar Message", Snackbar.LENGTH_LONG)
                        .setAction("OK",null);
                snackbar.show();
            }
        });

    }
}
