package c.aarsh121.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class activitybutton extends AppCompatActivity {
    AdView mview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitybutton);
        Button button=(Button)findViewById(R.id.samplebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namespace(v);
            }
        });
    }
    public void namespace(View v)
    {
        Intent intent=new Intent(this,activity.class);
        startActivity(intent);
    }
}
