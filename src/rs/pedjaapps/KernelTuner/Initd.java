package rs.pedjaapps.KernelTuner;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import android.os.AsyncTask;
import android.util.Log;

public class Initd extends AsyncTask<String, Void, String>
{


	@Override
	protected String doInBackground(String... args)
	{


		Process localProcess;
		System.out.println("Init.d: Writing init.d");
		if (args[0].equals("apply"))
		{
			try {
	            String line;
	            Process process = Runtime.getRuntime().exec("su");
	            OutputStream stdin = process.getOutputStream();
	            InputStream stderr = process.getErrorStream();
	            InputStream stdout = process.getInputStream();

	            stdin.write(("mount -o remount,rw /system\n").getBytes());
	            stdin.write(("/data/data/rs.pedjaapps.KernelTuner/files/cp /data/data/rs.pedjaapps.KernelTuner/files/99ktcputweaks /system/etc/init.d\n").getBytes());
	            stdin.write(("chmod 777 /system/etc/init.d/99ktcputweaks\n").getBytes());
	            stdin.write(("/data/data/rs.pedjaapps.KernelTuner/files/cp /data/data/rs.pedjaapps.KernelTuner/files/99ktgputweaks /system/etc/init.d\n").getBytes());
	            stdin.write(("chmod 777 /system/etc/init.d/99ktgputweaks\n").getBytes());
	            stdin.write(("/data/data/rs.pedjaapps.KernelTuner/files/cp /data/data/rs.pedjaapps.KernelTuner/files/99ktmisctweaks /system/etc/init.d\n").getBytes());
	            stdin.write(("chmod 777 /system/etc/init.d/99ktmisctweaks\n").getBytes());
	            stdin.write(("/data/data/rs.pedjaapps.KernelTuner/files/cp /data/data/rs.pedjaapps.KernelTuner/files/99ktvoltage /system/etc/init.d\n").getBytes());
	            stdin.write(("chmod 777 /system/etc/init.d/99ktvoltage\n").getBytes());
	            
	            stdin.flush();

	            stdin.close();
	            BufferedReader brCleanUp =
	                    new BufferedReader(new InputStreamReader(stdout));
	            while ((line = brCleanUp.readLine()) != null) {
	                Log.d("[KernelTuner Init.d Output]", line);
	            }
	            brCleanUp.close();
	            brCleanUp =
	                    new BufferedReader(new InputStreamReader(stderr));
	            while ((line = brCleanUp.readLine()) != null) {
	            	Log.e("[KernelTuner Init.d Error]", line);
	            }
	            brCleanUp.close();

	        } catch (IOException ex) {
	        }
		}
		else if (args[0].equals("rm"))
		{
			try {
	            String line;
	            Process process = Runtime.getRuntime().exec("su");
	            OutputStream stdin = process.getOutputStream();
	            InputStream stderr = process.getErrorStream();
	            InputStream stdout = process.getInputStream();

	            stdin.write(("mount -o remount,rw /system\n").getBytes());
	            stdin.write(("rm /system/etc/init.d/99ktcputweaks\n").getBytes());
	            stdin.write(("rm /system/etc/init.d/99ktgputweaks\n").getBytes());
	            stdin.write(("rm /system/etc/init.d/99ktmisctweaks\n").getBytes());
	            stdin.write(("rm /system/etc/init.d/99ktvoltage\n").getBytes());
	            
	            stdin.flush();

	            stdin.close();
	            BufferedReader brCleanUp =
	                    new BufferedReader(new InputStreamReader(stdout));
	            while ((line = brCleanUp.readLine()) != null) {
	                Log.d("[KernelTuner Init.d Output]", line);
	            }
	            brCleanUp.close();
	            brCleanUp =
	                    new BufferedReader(new InputStreamReader(stderr));
	            while ((line = brCleanUp.readLine()) != null) {
	            	Log.e("[KernelTuner Init.d Error]", line);
	            }
	            brCleanUp.close();

	        } catch (IOException ex) {
	        }
		}
		return "";
	}

}


