package com.example.seekbarthread;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void ButtonSaved(View v){
		Thread th=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<=40;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					final int j=i;
					runOnUiThread(new Runnable() {

						public void run() {
							SeekBar sk=(SeekBar) findViewById(R.id.seekBar1);
							sk.setProgress(j*40);
						}
					});
				}

			}
		});
		th.start();
	}
	
	public void SeekClicked(View v){
		Thread th=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<=10;i++){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					final int j=i;
					runOnUiThread(new Runnable() {

						public void run() {
							ProgressBar pb=(ProgressBar) findViewById(R.id.progressBar1);
							pb.setProgress(j*10);
						}
					});
				}

			}
		});
		th.start();
	}



}
