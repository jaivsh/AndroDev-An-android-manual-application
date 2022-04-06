package c.aarsh121.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Objects;

public class course_context_2 extends AppCompatActivity {

    public Button button;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_context_2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        button=(Button)findViewById(R.id.cc);


        Button button=(Button)findViewById(R.id.cc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notification(v);
            }
        });
        Button button1=(Button)findViewById(R.id.cc1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uie(v);
            }
        });
        Button button2=(Button)findViewById(R.id.cc2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avt(v);
            }
        });
        Button button3=(Button)findViewById(R.id.cc3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityclick(v);
            }
        });
        Button button4=(Button)findViewById(R.id.cc4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intented(v);
            }
        });
        Button button5=(Button)findViewById(R.id.cc5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmented(v);
            }
        });
        Button button6=(Button)findViewById(R.id.cc6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmented1(v);
            }
        });
        Button button7=(Button)findViewById(R.id.cc7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu(v);
            }
        });
        Button button8=(Button)findViewById(R.id.cc8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuc(v);
            }
        });
        Button button9=(Button)findViewById(R.id.cc9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vice(v);
            }
        });
        Button button10=(Button)findViewById(R.id.cc10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vicec(v);
            }
        });
    }
    public void notification(View v)
    {
        Intent intent=new Intent(this, notification.class);
        startActivity(intent);

    }
    public void uie(View v)
    {
        Intent intent1=new Intent(this, ui.class);
        startActivity(intent1);
    }
    public void avt(View v)
    {
        Intent intent2=new Intent(this, activity.class);
        startActivity(intent2);
    }
    public void activityclick(View v)
    {
        Intent intent3=new Intent(this, activitybutton.class);
        startActivity(intent3);
    }
    public void intented(View v)
    {
        Intent intent4=new Intent(this,intent.class);
        startActivity(intent4);
    }
    public void fragmented(View v)
    {
        Intent intent5=new Intent(this,fragment.class);
        startActivity(intent5);
    }
    public void fragmented1(View v)
    {
        Intent intent6=new Intent(this,ifcommunication.class);
        startActivity(intent6);
    }
    public void menu(View v)
    {
        Intent intent7=new Intent(this,menu.class);
        startActivity(intent7);
    }
    public void menuc(View v)
    {
        Intent intent=new Intent(this,creating_menu.class);
        startActivity(intent);
    }
    public void vice(View v)
    {
        Intent intent=new Intent(this,service.class);
        startActivity(intent);
    }
    public void vicec(View v)
    {
        Intent intent=new Intent(this,service_lifecycle.class);
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
