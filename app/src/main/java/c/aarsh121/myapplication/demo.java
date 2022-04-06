package c.aarsh121.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Objects;

public class demo extends AppCompatActivity {
        AdView mAdView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        MobileAds.initialize(this,
                "ca-app-pub-5404724432369100~7652270951");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void opensplashrun(View v)
    {
        Intent intent=new Intent(demo.this,splashrun.class);
        startActivity(intent);
    }
    public void opensplashcode(View v)
    {
        Intent intent=new Intent(demo.this,splashcode.class);
        startActivity(intent);
    }
    public void openwebview(View v)
    {
        Intent intent=new Intent(demo.this,webview.class);
        startActivity(intent);
    }
    public void openwebcode(View v)
    {
        Intent intent=new Intent(demo.this,webviewcode.class);
        startActivity(intent);
    }

    public void opentoastrun(View v)
    {
        Toast.makeText(getBaseContext(),"This is a Sample Toast",Toast.LENGTH_SHORT).show();
    }
    public void opentoastcode(View v)
    {
        Intent intent=new Intent(demo.this,toastcode.class);
        startActivity(intent);
    }
    public void snackbarun(View v)
    {
        Intent intent=new Intent(demo.this,snakbarrun.class);
        startActivity(intent);
    }
    public void opensnackbarcode(View v)
    {
        Intent intent=new Intent(demo.this,snackbarcode.class);
        startActivity(intent);
    }
}
