// http://apache-netcse.c9.io/restaurants/kfc/Shredded-Chicken-and-Avocado.jpg

using System;
using System.Net;
using System.IO;
using System.Drawing;
using System.Collections;
using System.ComponentModel;
using System.Windows.Forms;

public class ImageDownloadFromNetwork{
	
	public static void Main(String[] args){
		string picUri = "http://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
		WebRequest requestPic = WebRequest.Create(picUri);
		WebResponse responsePic = requestPic.GetResponse();
		Image webImage = Image.FromStream(responsePic.GetResponseStream());
		webImage.Save("google.jpg");
	}
	
}

















