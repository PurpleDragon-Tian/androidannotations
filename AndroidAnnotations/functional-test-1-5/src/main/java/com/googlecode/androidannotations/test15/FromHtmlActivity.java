package com.googlecode.androidannotations.test15;

import android.app.Activity;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.FromHtml;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.views_injected)
public class FromHtmlActivity extends Activity {
	
	@ViewById(R.id.my_text_view)
	@FromHtml(R.string.hello_html)
	TextView textView;
	
	@ViewById
	@FromHtml
	TextView someView;
}