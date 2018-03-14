package com.menglong.statusbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

/**
 * @author sunmenglong
 *
 * 全屏不保留状态栏
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏状态栏方式1
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //隐藏状态栏方式2
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        //方式3 见style风格
//        <!--去掉ActionBar-->
//        <style name="fullScreen" parent="Theme.AppCompat.DayNight.NoActionBar">
//          <!--隐藏状态栏方式3-->
//          <!--<item name="android:windowFullscreen">true</item>-->
//        </style>
    }

    public void noStatusBarRetainText(View view) {
        intent(NoStatusBarRetainText.class);
    }

    private void intent(Class activity){
        Intent intent=new Intent(this,activity);
        startActivity(intent);
    }

    public void StatusBarAndActionBar(View view) {
        intent(ActionBarAndStatusBar.class);
    }
}
