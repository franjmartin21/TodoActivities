package com.fran.buttonsAndTextFields;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todoactivities.R;

public class ButtonsAndTextFieldsActivity extends Activity {

	private TextView textView = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/**
		 * 2. Esta linea carga el layout declarado en activity_buttons_and_text_fields.xml
		 */
		setContentView(R.layout.activity_buttons_and_text_fields);
		/**
		 * Ahora vamos a recuperar una referencia al bot�n a�adido
		 * recordemos que su atributo id era "trigger"
		 */
		Button startButton = (Button)findViewById(R.id.trigger);
		//Recuperamos tambi�n ya la del texto que usaremos m�s adelante
		textView = (TextView)findViewById(R.id.hello_text);
		/**
		 * Ahora a�adimos un bot�n al evento, si has programado swing,
		 * esto te tiene que ser muy familiar ;).
		 */
		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			/**
			 * Antes de implementar este m�todo, vamos a a�adir un texto a la activity
			 * para ello vamos al xml donde definimos el layout: activity_buttons_and_text_fields.xml
			 */
			
			/**
			 * 5. Ahora si, vamos a implementar el m�todo, hemos recuperad
			 * la referencia anteriormente del TextView tambi�n, ahora solo
			 * cambiaremos su texto llamando al m�todo privado changeText
			 * que solo cambia el texto de la cadena
			 */
			public void onClick(View v) {
				changeText();
				
			}
		});
	}
	
	private void changeText(){
		textView.setText("Nueva Cadena");
	}


}
