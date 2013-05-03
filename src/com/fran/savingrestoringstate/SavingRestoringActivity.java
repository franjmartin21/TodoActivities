package com.fran.savingrestoringstate;

import android.app.Activity;
import android.os.Bundle;

import com.example.todoactivities.R;

public class SavingRestoringActivity extends Activity{
	float[] localFloatArray = {3.14f, 2.718f, 0.577f};
	String localUserName = "Euler";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState){
		super.onRestoreInstanceState(outState);
		//Guardamos toda la información relevante
		outState.putString("name", localUserName);
		outState.putFloatArray("array", localFloatArray);
	}
	
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState){
		super.onRestoreInstanceState(savedInstanceState);
		//Restore relevant information
		localUserName = savedInstanceState.getString("name");
		localFloatArray = savedInstanceState.getFloatArray("array");
	}
}
