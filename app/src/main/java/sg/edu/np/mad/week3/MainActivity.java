package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        VideoView rabbit = findViewById(R.id.videoView);
        rabbit.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        rabbit.start();

        MediaPlayer babyLaugh = MediaPlayer.create(MainActivity.this,R.raw.baby_laughing);
        babyLaugh.start();
    }
}
