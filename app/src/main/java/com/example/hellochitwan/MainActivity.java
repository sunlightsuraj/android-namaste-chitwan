package com.example.hellochitwan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button bt1;
	Button bt2;
	EditText ed1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		

		bt1 = (Button) findViewById(R.id.bt1);
		bt1.setOnClickListener(this);

		bt2 = (Button) findViewById(R.id.bt2);
		bt2.setOnClickListener(this);

		ed1 = (EditText) findViewById(R.id.ed1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		if (arg0 == bt1) {
			Toast.makeText(getApplicationContext(), "Namaste Chitwan",
					Toast.LENGTH_LONG).show();
		}
		if (arg0 == bt2) {
			Intent intent = new Intent(getApplicationContext(),
					SecondActivity.class);
			intent.putExtra("KEY_1", ed1.getText().toString());
			startActivity(intent);
		}

	}

}
