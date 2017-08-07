class Date{
	
	private int day;
	private int month;
	private int year;

	public Date(){
		this.day=25;
		this.month=7;
		this.year=2014;
	}

	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}


	public int getDay(){
		return this.day;
	}

	public void setDate(int day){
		this.day=day;

	}

	public void swapDay(int day1, int day2){
			int temp;
			temp = day1;
		    day1 = day2;
		    day2 = temp;
		    System.out.println(day1);
		    System.out.println(day2);
	}

	public String toString(){
		return this.day+"-"+this.month+"-"+this.year;
	}

}
public class DateTest{

	public static void main(String args[]){
		Date d = new Date();
		Date d2 = new Date(7,3,1995);
		Date d3 = new Date();
		d.getDay();
		d2.getDay();
		d3.setDate(5);
		d.swapDay(5,8);
		//System.out.println(d);
		//System.out.println(d2);
		//System.out.println(d3);
		//System.out.println(d);
	}
}