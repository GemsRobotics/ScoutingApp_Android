package com.gemsrobotics.scouting_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
public int ahighyn = 0;
public int ahighnn = 0;
public int alowyn = 0;
public int alownn= 0 ;
public int highyn =0 ;
public int highnn= 0;
public int lowyn = 0;
public int lownn = 0;
public int teamnumbern = 0;
public int matchnumbern = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void send(View view){
    	final EditText mn = (EditText) findViewById(R.id.matchNumber);
    	final EditText tn = (EditText) findViewById(R.id.teamNumber);
    	if(tn.getText().toString().equals("")){
    		new AlertDialog.Builder(this)
    	    .setTitle("Error")
    	    .setMessage("Please Enter a valid team number Thanks")
    	    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
    	        public void onClick(DialogInterface dialog, int which) { 
    	            // continue with delete
    	        }
    	     })
    	    
    	    .setIcon(android.R.drawable.ic_dialog_alert)
    	     .show();
    	}
		if(mn.getText().toString().equals("")){
    		new AlertDialog.Builder(this)
    	    .setTitle("Error")
    	    .setMessage("Please Enter a valid match number Thanks")
    	    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
    	        public void onClick(DialogInterface dialog, int which) { 
    	            // continue with delete
    	        }
    	     })
    	    
    	    .setIcon(android.R.drawable.ic_dialog_alert)
    	     .show();
    	}else{
    	teamnumbern = Integer.parseInt(tn.getText().toString());
    	matchnumbern = Integer.parseInt( mn.getText().toString());
    	
    		
    	
    	Intent i = new Intent(Intent.ACTION_VIEW, 
    		       Uri.parse("http://www.gemsrobotics.com/write.php?TeamNumber=" + teamnumbern + "&MatchNumber=" + matchnumbern
    	     			+"&Alowy=" + alowyn + "&Alown=" + alownn + "&Ahighy=" + ahighyn + "&Ahighn=" + ahighnn + "&lowy=" + lowyn
    	     			+"&lown=" + lownn + "&highy=" + highyn + "&highn=" + highnn));
    		startActivity(i);
    		
  
    }}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
  
    public void ahighy(View view){
    	ahighyn ++;
    	final TextView Text = (TextView) findViewById(R.id.ahighy) ;
    	Text.setText("Auton High Goal Made: " + ahighyn);
    	
    	
    }
    
    public void ahighn(View view){
    	ahighnn++;
    	final TextView Text = (TextView) findViewById(R.id.ahighn) ;
    	Text.setText("Auton High Goal Miss: " + ahighnn);
    }
    public void alowy(View view){
    	alowyn++;
    	final TextView Text = (TextView) findViewById(R.id.alowy) ;
    	Text.setText("Auton Low Goal Made: " + alowyn);
    }
    public void alown(View view){
    	alownn++;
    	final TextView Text = (TextView) findViewById(R.id.alown) ;
    	Text.setText("Auton Low Goal Miss: " + alownn);
    }
    public void highy(View view){
    	highyn++;
    	final TextView Text = (TextView) findViewById(R.id.highy) ;
    	Text.setText("High Goal Made: " + highyn);
    }
    public void highn(View view){
    	highnn++;
    	final TextView Text = (TextView) findViewById(R.id.highn) ;
    	Text.setText("High Goal Miss: " + highnn);
    }
    public void lowy(View view){
    	lowyn++;
    	final TextView Text = (TextView) findViewById(R.id.lowy) ;
    	Text.setText("Low Goal Made: " + lowyn);
    }
    public void lown(View veiw){
    	lownn++;
    	final TextView Text = (TextView) findViewById(R.id.lown) ;
    	Text.setText("Low Goal Miss: " + lownn);
    }
}
