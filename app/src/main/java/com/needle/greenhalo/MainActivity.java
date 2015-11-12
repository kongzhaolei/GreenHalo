package com.needle.greenhalo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        //调用父类的onCreate方法去初始化对象
		super.onCreate(savedInstanceState);
        //调用setContentView方法..告诉Activity去调用activity_main.xml文件下的布局.
        setContentView(R.layout.activity_main);

        //按钮单击事件的监听器
        OnClickListener listener = new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                setTitle(((TextView) v).getText());  //改变APP的title
            }
        };
        findViewById(R.id.button1).setOnClickListener(listener);
        findViewById(R.id.button2).setOnClickListener(listener);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

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
}
