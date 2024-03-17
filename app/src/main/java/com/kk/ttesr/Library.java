package com.kk.ttesr;

import android.content.Context;
import android.widget.Toast;

public class Library {
	public static void show(Context context) {
		Toast.makeText(context, "Welcome", 2000).show();
	}
	
}
