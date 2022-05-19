package javaproject;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	public boolean dirCheck(File file){
		if(!file.exists()){
			System.out.println("존재하지 않는 디렉토리입니다.");
			return false;
		}
		if(!file.isDirectory()){
			System.out.println("다렉토리가 아닙니다.");
			return false;
		}
		return true;
	}

	@Override
	public File executeCommand() {
		// TODO
		try {
			File file = new File(currentDirectory.getCanonicalPath() + "/" + commandLine.split(" ",2)[1]);
			File remove = new File(file.getCanonicalPath());
			if(dirCheck(file)) {
				return remove;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return currentDirectory;
	}
}
