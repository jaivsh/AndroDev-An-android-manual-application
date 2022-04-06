package c.aarsh121.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewSwitcher;

public class ui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        Button button=(Button)findViewById(R.id.sampleb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                samplebutton(v);
            }
        });
        TimePicker tp=(TimePicker)findViewById(R.id.tstime);
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int i, int i1) {
                Toast.makeText(getApplicationContext(),"Time is:"+i+":"+i1,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void samplebutton(View v)
    {
        Toast.makeText(this,"Button is clicked!!!!",Toast.LENGTH_SHORT).show();
    }
    public void stf(View v)
    {
        Toast.makeText(this,"Completed",Toast.LENGTH_SHORT).show();
    }
    public void toggle(View view)
    {
        boolean checked=((ToggleButton)view).isChecked();
        if(checked)
        {
            Toast.makeText(this,"Toggle button on",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Toggle button off",Toast.LENGTH_SHORT).show();
        }
    }
}
