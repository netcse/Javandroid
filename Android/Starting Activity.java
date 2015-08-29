<activity android:name=".MainActivity" android:label="@string/app_name">
	<intent-filter>
		<action android:name="android.intent.action.Main"/>
		<category android:name="android.intent.category.LAUNCHER"/>
	</intent-filter>
</activity>

TextView mTextView; // Member variable for text view in the layout

@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	
	// set the user interface layout for this activity
	// The layout file is defined in the project /res/layout/main_activity.xml file
	
	setContentView(R.layout.main_activity);
	
	// Initialize member TextView so we can manipulate it later
	
	mtextView = (TextView)findViewById(R.id.text_message);
	
	// Make sure we're running on Honeycomb or higher to use ActionBar APIs
	if(Build.VERSION.SDK_INT > Build.VERSION_CODES.HONECOMB){
		// For the main activity, make sure the app icon in the actionbar
		// does not behave as a button
		
		ActionBar actionBar = getActionBar();
		actionBar.setHomeButtonEnabled(false);
	}
	
}


// Destorying an activity
@Override
public void onDestroy(){
	super.onDestroy(); // Always call the superclass
	
	// stop method tracing that the activity started during on Create()
	android.os.Debug.stopMethodTracing();
	
}