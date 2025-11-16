import java.io.FileWriter;
  import java.io.IOException;
  public class FileCreator
  {
  FileWriter MyFile;
  FileCreator (String filename)
  {
    try
    {
    MyFile = new FileWriter (filename);
    }
    catch (IOException e)
      {
		  System.out.println(e);
      }
    }
  void WriteFile(String store, double jansales, double febsales, double marsales, double aprilsales)
  {
	double totalsales;
    try
    {
	totalsales=jansales+febsales+marsales+aprilsales;
    MyFile.append(store+","+jansales+","+febsales+","+marsales+","+aprilsales+","+totalsales+"\n");
    }
    catch (IOException e)
    {

     }
  }
  void WriteHeader()
  {
    try
    {
    MyFile.append("Store,JanSales,FebSales,Marchsales,AprilSales,TotalSales \n");
    }
    catch (IOException e)
    {
      }
    }

    void CloseFile()
    {
	try
    {
      MyFile.close();
    }
    catch (IOException e)
    {
      }
    }
  }