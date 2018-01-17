package net.buildbox.sample.buildbox_styleabletoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowToast(View view) {
        new StyleableToast.Builder(this)
            .text("テスト")
            .textColor(Color.BLUE)
            .backgroundColor(Color.CYAN)
            .iconResLeft(android.R.drawable.star_on)
            .solidBackground()
            .length(Toast.LENGTH_LONG)
            .show();
    }
}
