using System;
using System.Collections.Generic;
using System.Text;
using System.Net;
using System.IO;

class WebRequesttocreateaStreamReader
{
    static void Main(string[] args)
    {
        try{		
				StreamReader reader = new StreamReader(WebRequest.Create("http://www.prothom-alo.com").GetResponse().GetResponseStream());
				string line;
				while ((line = reader.ReadLine()) != null)
				{
					Console.WriteLine(line);
				}
		}catch (IOException e)
		{
			// Extract some information from this exception, and then 
			// throw it to the parent method.
			if (e.Source != null)
				Console.WriteLine("IOException source: {0}", e.Source);
			throw;
		}
		
	}
		
}