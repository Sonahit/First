package net.thumbtack.school.windows.v3;
import net.thumbtack.school.windows.v3.base.RoundWindow;

public class RadioButton extends RoundWindow {
	   boolean checked = true;
		
		public RadioButton(Point center, int radius, boolean active, String text, boolean checked){
			super(center,radius,active,text);
			this.checked = checked;
		}

		public RadioButton(int xCenter, int yCenter, int radius, boolean active, String text, boolean checked){
			super(xCenter,yCenter,radius,active,text);
			super.setCenter(xCenter, yCenter);
			this.checked = checked;
		}

		 
		public RadioButton(Point center, int radius, String text, boolean checked){
			super(center,radius,text);
			this.checked = checked;
		}


		public RadioButton(int xCenter, int yCenter, int radius, String text, boolean checked){
			super(xCenter,yCenter,radius,text);
			super.setCenter(xCenter, yCenter);
			this.checked = checked;
		}

	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}
