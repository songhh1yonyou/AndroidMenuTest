package com.example.androidmenutest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {

	private static final String TAG = "TestMenu";
	private Button mBUtton;

	public static final int RED_MENU_ID = Menu.FIRST;
	public static final int GREEN_MENU_ID = Menu.FIRST + 1;
	public static final int BLUE_MENU_ID = Menu.FIRST + 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mBUtton = (Button) findViewById(R.id.btn);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		menu.add(0, RED_MENU_ID, 0, R.string.red);
		menu.add(0, GREEN_MENU_ID, 0, R.string.green);
		menu.add(0, BLUE_MENU_ID, 0, R.string.blue);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case RED_MENU_ID:
			mBUtton.setBackgroundColor(Color.RED);
			mBUtton.setText(R.string.red);
			return true;
		case GREEN_MENU_ID:
			mBUtton.setBackgroundColor(Color.GREEN);
			mBUtton.setText(R.string.green);
			return true;
		case BLUE_MENU_ID:
			mBUtton.setBackgroundColor(Color.BLUE);
			mBUtton.setText(R.string.blue);
			return true;

		}
		return super.onOptionsItemSelected(item);
	}
}
