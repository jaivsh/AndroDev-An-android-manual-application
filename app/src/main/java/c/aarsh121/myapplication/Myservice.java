package c.aarsh121.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class Myservice extends Service {
    MediaPlayer myplayer;
    public Myservice()
    {}
    @Override
    public IBinder onBind(Intent intent)
    {
        throw new UnsupportedOperationException("Not implemented");
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
        Toast.makeText(this,"onCreate() in service was called",Toast.LENGTH_SHORT).show();
        myplayer=MediaPlayer.create(this,R.drawable.backgroundstudy);
    }
    @Override
    public int onStartCommand(Intent intent,int flags,int startId)
    {
        myplayer.start();
        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        myplayer.stop();
        Toast.makeText(this,"onDestroy() in service was called",Toast.LENGTH_SHORT).show();
    }


}
