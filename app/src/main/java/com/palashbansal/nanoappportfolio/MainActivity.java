package com.palashbansal.nanoappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void appButtonClick(View view) {
		String text = "This Button will launch my ";
		switch (view.getId()){
			case R.id.scoresApp:
				text += "Scores";
				break;
			case R.id.spotifyStreamer:
				text += "Spotify Streamer";
				break;
			case R.id.libraryApp:
				text += "Library";
				break;
			case R.id.buildItBigger:
				text += "Build it Bigger";
				break;
			case R.id.xyzReader:
				text += "XYZ Reader";
				break;
			case R.id.capstoneApp:
				text += "Capstone";
				break;
		}
		text += " App";
		Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
	}
}
