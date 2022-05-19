package javaproject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	public Date convertToDate(long unixTime){
		return new Date(unixTime);
	}

	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public String unit(long number) {
		int i = 0;
		for(i = 0; number>=1024; i++){
			number/=1024;
		}
		String str;
		switch (i){
			case 1:
				str = "KB";
				break;
			case 2:
				str = "MB";
				break;
			case 3:
				str = "GB";
				break;
			default:
				str = "";
		}
		return number+str;
	}

	@Override
	public File executeCommand() {
		// TODO
		try {
			File[] files = currentDirectory.listFiles();

			for (File name : files) {
				boolean dirB = name.isDirectory();
				System.out.printf(formatDate(convertToDate(name.lastModified())) + "  " + (dirB ? "<DIR>" : "     ") + "  " + (dirB ? "     " : "%5s") + " " + name + "\n", unit(name.length()));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return currentDirectory;
	}
	
}
