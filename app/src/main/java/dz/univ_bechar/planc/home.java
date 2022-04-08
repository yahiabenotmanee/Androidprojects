package dz.univ_bechar.planc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class home extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView imageanimation=findViewById(R.id.imagegif);

        // Status bar colors
        getWindow().setStatusBarColor(ContextCompat.getColor(home.this,R.color.black));
// to use a GIF
        Glide.with(this).asGif().load(R.raw.seccess).into(imageanimation);
// hide buttons
        Button button1=findViewById(R.id.button2);
        Button button2=findViewById(R.id.button3);
        Button button3=findViewById(R.id.button4);
        Button button4=findViewById(R.id.button5);
        imageanimation.setVisibility(View.VISIBLE);

        // time bach ybda ybano l buttons
        timer=new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                imageanimation.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);

            }
        },2000);

    }
}