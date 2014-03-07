package com.tjeannin.apprate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public abstract class AppRateFrameLayout extends LinearLayout {
	public AppRateFrameLayout(Context context,AttributeSet attrs) {
		super(context,attrs);
	}

	public abstract void show();
	
	public abstract void hide();
}
