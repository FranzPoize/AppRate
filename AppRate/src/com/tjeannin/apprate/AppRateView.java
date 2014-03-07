package com.tjeannin.apprate;

import android.view.View;
import android.view.View.OnClickListener;

public interface AppRateView  {
	public void show();
	
	public void setOnClickPositive(OnClickListener listener);
	public void setOnClickNegative(OnClickListener listener);
	public void setOnClickNeutral(OnClickListener listener);
	
	public View getView();
}