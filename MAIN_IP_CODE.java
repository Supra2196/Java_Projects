import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MAIN_IP_CODE
{
    // Shared flags and variables
    private static volatile boolean lookFlag = false;
    private static volatile boolean parcelReady = false;
    private static String envelope = "";

    public static void main(String[] args)
    {
        IPRetrieveer ipRetrieveObject = new IPRetrieveer();
        IPPresenter IPPresenterObj = new IPPresenter();

        // Start continuous monitoring threads
        new Thread(ipRetrieveObject::GetIPmethod).start();
        new Thread(IPPresenterObj::PickupCourier).start();

        // Take user input in main thread
        ipRetrieveObject.TakeUserInput();
    }

    // IPRetrieveer definition
    static class IPRetrieveer
    {
        void TakeUserInput()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to get the IP? (yes/no):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes"))
            {
                lookFlag = true;  // Set flag to trigger IP fetch
            }
        }

        void GetIPmethod()
        {
            while (true)
            {
                if (lookFlag)
                {
                    try
                    {
                        URL url = new URL("https://api.ipify.org");
                        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                        envelope = in.readLine();
                        in.close();
                        System.out.println("IP fetched: " + envelope);
                        lookFlag = false;
                        parcelReady = true;
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    // IPPresenter definition
    static class IPPresenter
    {
        void PickupCourier()
        {
            while (true)
            {
                if (parcelReady)
                {
                    try
                    {
                        URL url = new URL("https://httpbin.org/post");
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setDoOutput(true);
                        conn.setRequestProperty("Content-Type", "application/json");

                        String json = "{\"IP\":\"" + envelope + "\"}";

                        OutputStream os = conn.getOutputStream();
                        os.write(json.getBytes());
                        os.flush();
                        os.close();

                        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String line;
                        while ((line = in.readLine()) != null)
                        {
                            System.out.println(line);
                        }
                        in.close();

                        parcelReady = false;

                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
