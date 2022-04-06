package c.aarsh121.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class beginners_level extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginners_level);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        Button b=(Button)findViewById(R.id.bl1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction(v);
            }
        });
        Button b1=(Button)findViewById(R.id.bl2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction1(v);
            }
        });
        Button b2=(Button)findViewById(R.id.bl3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction2(v);
            }
        });
        Button b3=(Button)findViewById(R.id.bl4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction3(v);
            }
        });
        Button b4=(Button)findViewById(R.id.bl5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction4(v);
            }
        });
        Button b5=(Button)findViewById(R.id.bl6);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction5(v);
            }
        });
        Button b6=(Button)findViewById(R.id.bl7);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction6(v);
            }
        });
        Button b7=(Button)findViewById(R.id.bl8);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction7(v);
            }
        });
        Button b8=(Button)findViewById(R.id.bl9);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction8(v);
            }
        });
        Button b9=(Button)findViewById(R.id.bl10);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction9(v);
            }
        });
        Button b10=(Button)findViewById(R.id.bl11);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction10(v);
            }
        });
        Button b11=(Button)findViewById(R.id.bl12);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction11(v);
            }
        });
        Button b12=(Button)findViewById(R.id.bl13);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction12(v);
            }
        });
        Button b13=(Button)findViewById(R.id.bl14);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introduction13(v);
            }
        });
    }
    public void introduction(View v)
    {
        Intent intent=new Intent(this, android_introduction.class);
        startActivity(intent);

    }
    public void introduction1(View v)
    {
        Intent intent1=new Intent(this,introduction1.class);
        startActivity(intent1);
    }public void introduction2(View v)
    {
        Intent intent2=new Intent(this, software_stack.class);
        startActivity(intent2);
    }
    public void introduction3(View v)
    {
        Intent intent3=new Intent(this,art_dvm.class);
        startActivity(intent3);
    }
    public void introduction4(View v)
    {
        Intent intent4=new Intent(this, setup.class);
        startActivity(intent4);
    }
    public void introduction5(View v)
    {
        Intent intent5=new Intent(this, android_device.class);
        startActivity(intent5);
    }
    public void introduction6(View v)
    {
        Intent intent6=new Intent(this, project_structure.class);
        startActivity(intent6);
    }
    public void introduction7(View v)
    {
        Intent intent7=new Intent(this, manifestxml.class);
        startActivity(intent7);
    }
    public void introduction8(View v)
    {
        Intent intent8=new Intent(this, androidJava.class);
        startActivity(intent8);
    }
    public void introduction9(View v)
    {
        Intent intent9=new Intent(this,Androidres.class);
        startActivity(intent9);
    }
    public void introduction10(View v)
    {
        Intent intent10=new Intent(this,view.class);
        startActivity(intent10);
    }
    public void introduction11(View v)
    {
        Intent intent11=new Intent(this, layout.class);
        startActivity(intent11);
    }
    public void introduction12(View v)
    {
        Intent intent12=new Intent(this, linearlayout.class);
        startActivity(intent12);
    }
    public void introduction13(View v)
    {
        Intent intent13=new Intent(this, relativelayout.class);
        startActivity(intent13);
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
