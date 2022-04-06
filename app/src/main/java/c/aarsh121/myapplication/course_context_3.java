package c.aarsh121.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class course_context_3 extends AppCompatActivity {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_context_3);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        Button button=(Button)findViewById(R.id.cc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xmlthing(v);
            }
        });
        Button button1=(Button)findViewById(R.id.cc1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xmparse(v);
            }
        });
        Button button2=(Button)findViewById(R.id.cc2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsp(v);
            }
        });
        Button button3=(Button)findViewById(R.id.cc3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsparse(v);
            }
        });
        Button button4=(Button)findViewById(R.id.cc4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auie(v);
            }
        });
        Button button5=(Button)findViewById(R.id.cc5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data(v);
            }
        });
        Button button6=(Button)findViewById(R.id.cc6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp(v);
            }
        });
        Button button7=(Button)findViewById(R.id.cc7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storagetype(v);
            }
        });
        Button button8=(Button)findViewById(R.id.cc8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process(v);
            }
        });
        Button button9=(Button)findViewById(R.id.cc9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thread(v);
            }
        });
        Button button10=(Button)findViewById(R.id.cc10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hl(v);
            }
        });
        Button button11=(Button)findViewById(R.id.cc11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iipc(v);
            }
        });
        Button button12=(Button)findViewById(R.id.cc12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fire(v);
            }
        });

    }
    public void xmlthing(View v)
    {
        Intent intent=new Intent(this,xmlx.class);
        startActivity(intent);
    }
    public void xmparse(View v)
    {
        Intent intent=new Intent(this,xmlparse.class);
        startActivity(intent);
    }
    public void jsp(View v)
    {
        Intent intent=new Intent(this,json.class);
        startActivity(intent);
    }
    public void jsparse(View v)
    {
        Intent intent=new Intent(this,jsonparse.class);
        startActivity(intent);
    }
    public void auie(View v)
    {
        Intent intent=new Intent(this,advancedui.class);
        startActivity(intent);
    }
    public void data(View v)
    {
        Intent intent=new Intent(this,datastorage.class);
        startActivity(intent);
    }
    public void sp(View v)
    {
        Intent intent=new Intent(this,sharedpreference.class);
        startActivity(intent);
    }
    public void storagetype(View v)
    {
        Intent intent=new Intent(this,storagetypes.class);
        startActivity(intent);
    }
    public void process(View v)
    {
        Intent intent=new Intent(this,process.class);
        startActivity(intent);
    }
    public void thread(View v)
    {
        Intent intent=new Intent(this,thread.class);
        startActivity(intent);
    }
    public void hl(View v)
    {
        Intent intent=new Intent(this,handlersloopers.class);
        startActivity(intent);
    }
    public void iipc(View v)
    {
        Intent intent=new Intent(this,ipc.class);
        startActivity(intent);
    }
    public void fire(View v)
    {
        Intent intent=new Intent(this,firebase.class);
        startActivity(intent);
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
}
