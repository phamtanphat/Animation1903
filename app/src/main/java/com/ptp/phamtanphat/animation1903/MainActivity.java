package com.ptp.phamtanphat.animation1903;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgScale,imgAlpha,imgRotate,imgtranslate;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgScale = findViewById(R.id.imageviewScale);
        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgRotate = findViewById(R.id.imageviewRotate);
        imgtranslate = findViewById(R.id.imageviewTranslate);

//        StartViewAnimation(imgAlpha,R.anim.imageview_alpha);
//        StartViewAnimation(imgScale,R.anim.imageview_scale);
        //Khi pivotx < 50% x se nam ben tay trai va nguoc lai
        //Khi pivoty < 50% y se nam ben tren va nguoc lai
        //Khi chay tu duong sang am thi nguoc chieu kim dong ho va nguoc lai
        StartViewAnimation(imgtranslate,R.anim.imageview_translate);

    }
    public void StartViewAnimation(ImageView img , int fileanimation){
        animation = AnimationUtils.loadAnimation(this,fileanimation);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation);
            }
        });
    }
}
