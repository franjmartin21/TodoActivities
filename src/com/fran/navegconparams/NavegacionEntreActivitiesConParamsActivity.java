package com.fran.navegconparams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todoactivities.R;

public class NavegacionEntreActivitiesConParamsActivity extends Activity {
	private static final int PLAY_GAME = 1010;
	private TextView tv;
	private int meaningofLife = 42;
	private String userName = "Maria Teresa";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navegacion_entre_activities_con_params);
		tv = (TextView)findViewById(R.id.startscreen_text);
		/**
		 * 1. Muestra los valores iniciales
		 */
		tv.setText(userName + ":" +meaningofLife);
		
		/**
		 * 2. Recuperamos referencia al botón que va dar comienzo a la otra
		 * activity
		 */
		Button startButton = (Button)findViewById(R.id.play_gameparams);
		
		startButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startGame();
			}
		});
	}
	
	/**
	 * 7. Método que será ejecutado al volver de la activity llamada
	 * Este, va a recuperar los parametros retornados de la activity
	 * y los va a pintar en un cadro de texto
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		/**
		 * Identificamos que volvemos de la activity dada, gracias al requestCode que pasamos
		 * al llamarla, comprobamos también que la activity arrojó el resultado esperado
		 */
		if(requestCode == PLAY_GAME && resultCode == RESULT_OK){
			meaningofLife = data.getExtras().getInt("returnInt");
			userName = data.getExtras().getString("userName");
			//Show it has changed
			tv.setText(userName + ":" + meaningofLife);
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	
	private void startGame(){
		Intent launchGame = new Intent(this, PlayGameParametersActivity.class);
		/**
		 *  3. Pasamos la información a la actividad que vamos a llamar a través
		 *  del Intent
		 */
		launchGame.putExtra("meaningOfLife", meaningofLife);
		launchGame.putExtra("userName", userName);
		
		startActivityForResult(launchGame, PLAY_GAME);
	}
	
	
	
	
	
}
