package com.fran.launch_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.todoactivities.R;

public class NavegacionEntreActivities extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navegacion_entre_activities);
		
		//Creamos una referencia al botón y le agregamos un evento
		Button startButton = (Button)findViewById(R.id.play_game);
		startButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startGame();
			}
		});
	}
	
	/**
	 * Los pasos para lanzar una nueva activity son:
	 * 1. Declarar un Intend que apunta a la actividad a lanzar
	 * 2. Llamar con el intend ael método startActivity
	 * 3. Declarar la actividad adicional en el AndroidManifiest.xml
	 */
	private void startGame(){
		Intent launchGame = new Intent(this,PlayGame.class);
		startActivity(launchGame); 
	}

}
