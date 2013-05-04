package com.fran.navegconparams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todoactivities.R;

public class PlayGameParametersActivity extends Activity {

	private TextView tv2;
	int answer;
	String author;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_game_parameters);
		tv2 = (TextView) findViewById(R.id.game_text);
		
		/**
		 * 4. Ahora vamos a leer la informaci�n pasada a esta acitivity
		 */
		Intent intent = getIntent();
		// Retornar� -1 si el parametro no esta inicializado por la activity que llama
		answer = intent.getIntExtra("meaningOfLife", -1);
		// Retorna [] si no esta inicializado por la activity que llama
		author = intent.getStringExtra("userName");
		tv2.setText(author + ": "+answer);
		
		/**
		 * 5. Ahora vamos a cambiar los valores para mostrar un ejemplo de retorno
		 * de parametros
		 */
		answer = answer - 41;
		author = author + " Jr.";
		
		Button startButton = (Button)findViewById(R.id.end_game);
		/**
		 * 6. Para finalizar el juego, antes de llamar al m�todo finish() que 
		 * cerrar� la activity y devolver� el control a la activity que la llam�
		 * informamos en el intent los parametros que queremos devolver.
		 */
		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = getIntent();
				i.putExtra("returnInt", answer);
				i.putExtra("returnStr", author);
				setResult(RESULT_OK, i);
				finish();
			}
		});
	}
}
