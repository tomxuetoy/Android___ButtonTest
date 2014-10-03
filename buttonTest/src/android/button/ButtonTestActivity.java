package android.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonTestActivity extends Activity {
    /** Called when the activity is first created. */
	private Button button;
	private TextView text, text2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView)findViewById(R.id.text);
        text2 = (TextView)findViewById(R.id.text2);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "clicked",
					     Toast.LENGTH_SHORT).show();
			}
		});
        text.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "long clicked",
					     Toast.LENGTH_SHORT).show();
				return false;
			}
		});
        text2.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "long clicked",
					     Toast.LENGTH_SHORT).show();
				return false;
			}
		});
    }    
}