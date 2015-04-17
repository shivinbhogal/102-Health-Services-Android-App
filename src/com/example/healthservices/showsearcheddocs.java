package com.example.healthservices;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class showsearcheddocs extends Activity {

	EditText editText1, editText2, editText3, editText4, editText5, editText6,
			editText7, editText8, editText9, editText10, editText11;
	String[] name = { "Rahul", "Parag", "Rakesh", "Jai", "Aryan", "Kartik",
			"Vikalp", "Preeti", "Niyati", "Priya" };
	String[] sur_name = { "Arora", "Agrawal", "Shakya", "Gandhi", "Sharma",
			"Vyas", "Verma", "Singh", "Yadav", "Malhotra" };
	int p;
	// int num_recieved=getIntent().getExtras().getInt("mynum");
	int quo = randInt(0, 9), mod = randInt(0, 9);

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.showsearcheddocs);
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.EditText01);
		editText3 = (EditText) findViewById(R.id.EditText02);
		editText4 = (EditText) findViewById(R.id.EditText04);
		editText5 = (EditText) findViewById(R.id.EditText03);
		editText6 = (EditText) findViewById(R.id.editText7);
		editText7 = (EditText) findViewById(R.id.editText3);
		editText8 = (EditText) findViewById(R.id.editText2);
		editText9 = (EditText) findViewById(R.id.editText4);
		editText10 = (EditText) findViewById(R.id.editText5);
		editText11 = (EditText) findViewById(R.id.editText6);

		/*
		 * if(num_recieved<11){p=1;
		 * editText6.setText("This search produced zero results");}
		 * 
		 * if(num_recieved%10==0){p=1;
		 * editText6.setText("This search produced zero results");}
		 */

		editText7.setText("     9425649631");
		editText8.setText("     8764534233");
		editText9.setText("     9039425239");
		editText10.setText("     7734773434");
		editText11.setText("     8989989899");

		editText1.setText(name[quo % 10] + " " + sur_name[mod % 10]);
		editText2.setText(name[(quo +1) % 10] + " " + sur_name[(mod + 1) % 10]);
		editText3.setText(name[(quo +2) % 10] + " " + sur_name[(mod + 2) % 10]);
		editText4.setText(name[(quo +3) % 10] + " " + sur_name[(mod + 3) % 10]);
		editText5.setText(name[(quo +4) % 10] + " " + sur_name[(mod + 4) % 10]);

	}

	@Override
	protected void onResume() {
		quo = quo + 7;
		mod = mod + 3;
		editText1
				.setText(name[(quo + 1) % 10] + " " + sur_name[(mod + 1) % 10]);
		editText2
				.setText(name[(quo + 2) % 10] + " " + sur_name[(mod + 2) % 10]);
		editText3
				.setText(name[(quo + 3) % 10] + " " + sur_name[(mod + 3) % 10]);
		editText4
				.setText(name[(quo + 4) % 10] + " " + sur_name[(mod + 4) % 10]);
		editText5
				.setText(name[(quo + 5) % 10] + " " + sur_name[(mod + 5) % 10]);

		// TODO Auto-generated method stub
		super.onResume();
	}

	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}
