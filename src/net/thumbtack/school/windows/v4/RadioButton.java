package net.thumbtack.school.windows.v4;
import net.thumbtack.school.windows.v4.base.*;

public class RadioButton extends RoundButton {
	   boolean checked = true;
		
		public RadioButton(Point center, int radius, WindowState state, String text, boolean checked) throws WindowException{
			super(center,radius,state,text);
			this.checked = checked;
		}

		public RadioButton(int xCenter, int yCenter, int radius, WindowState state, String text, boolean checked)throws WindowException{
			super(xCenter,yCenter,radius,state,text);
			super.setCenter(xCenter, yCenter);
			this.checked = checked;
		}
		
		public RadioButton(Point center, int radius, String status, String text, boolean checked)throws WindowException {
			super(center,radius,text);
			if(   status == "ACTIVE"
				       || status == "INACTIVE") 
					   super.setState(WindowState.valueOf(status));
				    else throw new WindowException(WindowErrorCode.WRONG_STATE);
			this.checked = checked;
		}

		public RadioButton(int xCenter, int yCenter, int radius, String status, String text, boolean checked)throws WindowException{
			super(xCenter,yCenter,radius,text);
			super.setCenter(xCenter, yCenter);
			this.checked = checked;
			if(   status == "ACTIVE"
				       || status == "INACTIVE") 
					   super.setState(WindowState.valueOf(status));
				    else throw new WindowException(WindowErrorCode.WRONG_STATE);
		}



		public RadioButton(int xCenter, int yCenter, int radius, String text, boolean checked) throws WindowException{
			super(xCenter,yCenter,radius,text);
			super.setCenter(xCenter, yCenter);
			this.checked = checked;
		}
		
		public RadioButton(Point center, int radius, String text, boolean checked)throws WindowException {
			super(center,radius,text);
			this.checked = checked;

		}


	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}
