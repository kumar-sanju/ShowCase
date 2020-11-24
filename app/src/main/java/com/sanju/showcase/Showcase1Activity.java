package com.sanju.showcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import co.mobiwise.materialintro.animation.MaterialIntroListener;
import co.mobiwise.materialintro.shape.Focus;
import co.mobiwise.materialintro.shape.FocusGravity;
import co.mobiwise.materialintro.shape.ShapeType;
import co.mobiwise.materialintro.view.MaterialIntroView;

public class Showcase1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcase1);

        TextView textView = (TextView)findViewById(R.id.textView);

        new MaterialIntroView.Builder(this)
                .enableDotAnimation(true)
                .enableIcon(false)
                .setFocusGravity(FocusGravity.CENTER)
                .setFocusType(Focus.MINIMUM)
                .setDelayMillis(1000)
                .enableFadeAnimation(true)
                .performClick(true)
                .setInfoText("Hi There! This is our TextView for showcase.")
                .setShape(ShapeType.RECTANGLE)
                .setTarget(textView)
                .setUsageId("intro_card") //THIS SHOULD BE UNIQUE ID
                .setMaskColor(getResources().getColor(R.color.green))

                .setListener(new MaterialIntroListener() {
                    @Override
                    public void onUserClicked(String materialIntroViewId) {
                        Toast.makeText(Showcase1Activity.this,"Showcase clicked",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }
}