package dz.univ_bechar.planc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenanimation extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Status bar color
        getWindow().setStatusBarColor(ContextCompat.getColor(SplashScreenanimation.this,R.color.black));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screenanimation);
        ImageView imageView=findViewById(R.id.splash_img);

      //use gif picture
        Glide.with(this).asGif().load(R.raw.loading).into(imageView);

        // for time
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashScreenanimation.this, MainActivity.class );
                startActivity(intent);
                finish();
            }
        },2000);
    }
}