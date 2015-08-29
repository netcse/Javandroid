private void setUpActionBar(){
	// Make sure we're runnign on Honeycomb or
	// higher to use ActionBar
	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}
}

