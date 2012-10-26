package ca.projectpike.rnd_imureceive;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RND_IMUReceive extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rnd__imureceive);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_rnd__imureceive, menu);
        return true;
    }
}
