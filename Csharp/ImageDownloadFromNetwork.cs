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
		string picUri = "http://apache-netcse.c9.io/restaurants/kfc/Shredded-Chicken-and-Avocado.jpg";
		WebRequest requestPic = WebRequest.Create(picUri);
		WebResponse responsePic = requestPic.GetResponse();
		Image webImage = Image.FromStream(responsePic.GetResponseStream());
		webImage.Save("food.jpg");
	}
	
}

















