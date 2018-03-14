package com.menglong.statusbardemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/**
 * 使状态栏与ActionBar颜色保持一致
 */
public class ActionBarAndStatusBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_and_status_bar);

        //适配低于21的版本
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.status_toolBar_same_color));
        } else {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            ViewGroup systemContent = (ViewGroup) findViewById(android.R.id.content);
            View statusBarView = new View(this);
//            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusBarHeight());
            statusBarView.setBackgroundColor(getResources().getColor(R.color.status_toolBar_same_color));
            systemContent.getChildAt(0).setFitsSystemWindows(true);
//            systemContent.addView(statusBarView, 0, lp);
        }


//        <!--使ActionBar与状态栏颜色保持一致-->
//    <style name="status_toolbar_same_color" parent="Theme.AppCompat.Light.DarkActionBar">
//        <!-- Customize your theme here. -->
//        <item name="colorPrimary">@color/status_toolBar_same_color</item>
//        <item name="colorPrimaryDark">@color/status_toolBar_same_color</item>
//        <item name="colorAccent">@color/colorAccent</item>
//    </style>
    }
}
