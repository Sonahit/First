package net.thumbtack.school.windows.v4.base;

public enum WindowErrorCode {
	WRONG_STATE("WRONG_STATE"), WRONG_INDEX("WRONG_INDEX"), EMPTY_ARRAY("EMPTY_ARRAY");
	
	   private String message;
	   
	   private WindowErrorCode(String msg) {
		   message = msg;
	   }
	   
	   public String getErrorString() {
		   return message;
	   }
	   
   
	   
	   
	   
	   
}

