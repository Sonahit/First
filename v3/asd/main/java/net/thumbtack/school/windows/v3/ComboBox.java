package net.thumbtack.school.windows.v3;

public class ComboBox extends ListBox {
	private Integer selected;
	public ComboBox(Point topLeft, Point bottomRight, boolean active, String[] lines, Integer selected){
		super(topLeft,bottomRight,active,lines);
		this.selected = selected;
		}
	public ComboBox(int xLeft, int yTop, int width, int height, boolean active, String[] lines, Integer selected){
		super(xLeft,yTop,width,height,active,lines);
		this.selected = selected;
		}
	public ComboBox(Point topLeft, Point bottomRight,  String[] lines, Integer selected){
		super(topLeft,bottomRight,lines);
		this.selected = selected;
		}
	public ComboBox(int xLeft, int yTop, int width, int height, String[] lines, Integer selected){
		super(xLeft,yTop,width,height,lines);
		this.selected = selected;
		}

	public String[] getLines(){
		return super.getLines();
		}
	public void setLines(String[] lines){
		super.setLines(lines);
		}
	public Integer getSelected(){
		return selected;
		}
	public void setSelected(Integer selected){
		this.selected = selected;
		}
	public String[] getLinesSlice(int from, int to){
		return super.getLinesSlice(from, to);
		}
	public String getLine(int index){
		return super.getLine(index);
		}
	public void setLine(int index, String line){
		super.setLine(index, line);;
		}
	public Integer findLine(String line){
		return super.findLine(line);
		}
	public void reverseLineOrder() {
	super.reverseLineOrder();
	}
	public void reverseLines() {
		super.reverseLines();
		}
	public void duplicateLines() {
		super.duplicateLines();
		}
	public void removeOddLines() {
		super.removeOddLines();
		}
	public boolean isSortedDescendant() {
		return super.isSortedDescendant();
		}

	public boolean isIntersects(ComboBox comboBox) {
		return super.isIntersects(comboBox);
	}
	public boolean isInside(ComboBox comboBox) {
		return super.isInside(comboBox);
	}
}
