package net.thumbtack.school.windows.v4.base;

public class WindowException extends Exception {
	WindowErrorCode err;

	public WindowException(WindowErrorCode Error) {
		   err = Error;
		}
	
	public WindowErrorCode getWindowErrorCode() {
		return err;
	}
	
	

}
