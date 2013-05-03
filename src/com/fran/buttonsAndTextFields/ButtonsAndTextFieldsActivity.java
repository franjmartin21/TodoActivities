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
		 * Ahora vamos a recuperar una referencia al botón añadido
		 * recordemos que su atributo id era "trigger"
		 */
		Button startButton = (Button)findViewById(R.id.trigger);
		//Recuperamos también ya la del texto que usaremos más adelante
		textView = (TextView)findViewById(R.id.hello_text);
		/**
		 * Ahora añadimos un botón al evento, si has programado swing,
		 * esto te tiene que ser muy familiar ;).
		 */
		startButton.setOnClickListener(new View.OnClickListener() {
			@Override
			/**
			 * Antes de implementar este método, vamos a añadir un texto a la activity
			 * para ello vamos al xml donde definimos el layout: activity_buttons_and_text_fields.xml
			 */
			
			/**
			 * 5. Ahora si, vamos a implementar el método, hemos recuperad
			 * la referencia anteriormente del TextView también, ahora solo
			 * cambiaremos su texto llamando al método privado changeText
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
