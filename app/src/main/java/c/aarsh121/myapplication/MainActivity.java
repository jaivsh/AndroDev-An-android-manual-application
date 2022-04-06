package c.aarsh121.myapplication;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements  RewardedVideoAdListener {
    CardView b,b2,b3,b4,b7;
    Button button;
    RewardedVideoAd mRewardedVideoAd;
    ScheduledExecutorService scheduler;
    Context context=MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            Objects.requireNonNull(getSupportActionBar()).setCustomView(R.layout.abs_layout1);
        }
        MobileAds.initialize(this, "ca-app-pub-5404724432369100~8948289377");
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        scheduler= Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        if (mRewardedVideoAd.isLoaded()) {
                            mRewardedVideoAd.show();
                        }
                        loadRewardedVideoAd();
                    }
                });
            }
        }, 30, 75, TimeUnit.SECONDS);


        button=(Button)findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,aboutapp.class);
                startActivity(i);   }

        });
        b=(CardView)findViewById(R.id.b6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(context,projects.class);
                startActivity(i1);
            }
        });

        b2=(CardView)findViewById(R.id.b3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(context,beginners_level.class);
                startActivity(i3);
            }
        });

        b3=(CardView)findViewById(R.id.b4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(context,course_context_2.class);
                startActivity(i4);
            }
        });
        b4=(CardView)findViewById(R.id.b5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(context,course_context_3.class);
                startActivity(i5);
            }
        });
        b7=(CardView)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(context,demo.class);
                startActivity(i6);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId())
        {
            case R.id.mm1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=c.aarsh121.myapplication")));                break;
            case R.id.mm2:
                Intent invite=new Intent(Intent.ACTION_SEND);
                invite.setType("text/plain");
                String body="Check out the new Android development app to learn android development all in one place.This app contains almost everything you will need to learn android. Contains Tutorials, examples, Tips and more. Download from Google Play- ";
                String subject="AndroDev- An Android learning platform";
                invite.putExtra(Intent.EXTRA_SUBJECT, subject);
                invite.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(invite,"Share using"));
                break;
            case R.id.mm3:
                Intent email=new Intent(Intent.ACTION_SEND);
                email.setData(Uri.parse("mail to:"));
                email.setType("text/email");
                email.putExtra(Intent.EXTRA_EMAIL, new String[] {"aarshorai22@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                try
                {
                    startActivity(Intent.createChooser(email,"Send Feedback:"));
                    Log.i("Finished sending email","OK");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this,"There is no e-mail application installed",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.mm4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://androtandc.blogspot.com/2018/11/androdev-privacy-policy.html")));
                break;
        }

        return true;
    }


    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-5404724432369100/5724349915",
                new AdRequest.Builder().build());
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
    public void rateapp(View v)
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=c.aarsh121.myapplication")));
    }


    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}

