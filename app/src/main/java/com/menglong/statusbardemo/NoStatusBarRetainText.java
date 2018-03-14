package com.menglong.statusbardemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/**
 * @author sunmenglong
 *
 * 全屏展示，保留状态栏文字
 *
 * 现在项目大部分支持最低版本为19，Android版本4.4.2，所以在此只考虑Api19以上
 */
public class NoStatusBarRetainText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_status_bar_retain_text);
        Window window=getWindow();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN_MR2) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            ViewGroup contentView = (ViewGroup) window.getDecorView().findViewById(Window.ID_ANDROID_CONTENT);
            contentView.getChildAt(0).setFitsSystemWindows(false);
        }
    }
}
