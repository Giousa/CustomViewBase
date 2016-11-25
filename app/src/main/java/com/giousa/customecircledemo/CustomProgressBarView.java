package com.giousa.customecircledemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Description:
 * Author:Giousa
 * Date:2016/11/25
 * Email:65489469@qq.com
 */
public class CustomProgressBarView extends View{

    private final String TAG = CustomProgressBarView.class.getSimpleName();

    public CustomProgressBarView(Context context) {
        this(context,null);
        Log.d(TAG,"here 001");
    }

    public CustomProgressBarView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
        Log.d(TAG,"here 002");
    }

    public CustomProgressBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.d(TAG,"here 003");

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomProgressBar,defStyleAttr,0);
        int n = typedArray.getIndexCount();
        Log.d(TAG,"count= "+n);
        for (int i = 0; i < n; i++) {

            int attr = typedArray.getIndex(i);
            Log.d(TAG,"attr="+attr);

        }

        typedArray.recycle();


    }

}
