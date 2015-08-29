English (default locale), /values/strings.xml:

	<?xml version = "1.0" encoding="utf-8"?>
	<resources>
		<string name="title">My Application</string>
		<string name="hello_world">Hello world!</string>
	</resources>

Spanish, /values-es/strings.xml:

	<?xml version="1.0" encoding="utf-8"?>
	<resources>
		<string name="title">Mi Aplicación</string>
		<string name="hello_world">Hola Mundo!</string>
	</resources>

French, /values-fr/strings.xml:

	<?xml version="1.0" encoding="utf-8"?>
	<resources>
		<string name="title">Mon Application</string>
		<string name="hello_world">Bonjour le monde !</string>
	</resources>

	
// Get a string resources from your apps' Resources

String hello = getResources.getString(R.string.hello_world);

TextView textView = new TextView(this);
textView.setText(R.string.hello_world);


<TextView 
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:text="@string/hello_world" />
	
