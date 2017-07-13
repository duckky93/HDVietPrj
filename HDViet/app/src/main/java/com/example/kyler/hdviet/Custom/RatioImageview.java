package com.example.kyler.hdviet.Custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by kyler on 13/07/2017.
 */

public class RatioImageview extends ImageView {
    public RatioImageview(Context context) {
        super(context);
    }

    public RatioImageview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RatioImageview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();

        //force a 16:9 aspect ratio
        int height = Math.round(width * 1.46f);
        setMeasuredDimension(width, height);
    }
}
