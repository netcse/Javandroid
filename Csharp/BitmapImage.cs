using System;
using System.Drawing;
using System.Windows.Forms;
namespace RectangleApplication
{
   
   
   class BitmapImage 
   {
      static void Main(string[] args) 
      {
		 Bitmap bmp;
         
		 try
		{
			// Retrieve the image.
			bmp = new Bitmap(@"windows.bmp", true);

			int x, y;

			// Loop through the images pixels to reset color. 
			for(x=0; x<bmp.Width; x++)
			{
				for(y=0; y<bmp.Height; y++)
				{
					Color pixelColor = bmp.GetPixel(x, y);
					Console.WriteLine(pixelColor);
					Color newColor = Color.FromArgb(pixelColor.R, 0, 0);
					bmp.SetPixel(x, y, newColor);
				}
			}
			
			bmp.Save("windowsNew.bmp");


		}
		catch(ArgumentException)
		{
			MessageBox.Show("There was an error. " +
				"Check the path to the image file.");
		}
		 
      }
   }
}