package c.aarsh121.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class service_lifecycle extends Activity {
    Button btnstart,btnstop;
    AdView mview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_lifecycle);


    }
    public void Servicestart(View v)
    {
        Intent i=new Intent(this,Myservice.class);
        startService(i);
    }
    public void Servicestop(View v)
    {
        Intent i=new Intent(this,Myservice.class);
        stopService(i);
    }
}
