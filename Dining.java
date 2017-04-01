import java.util.Calendar;

public class Dining {

	public static void main(String[] args) {

    // figure out date
		Calendar current = Calendar.getInstance();
		Calendar year1617 = Calendar.getInstance();
		Calendar year1718 = Calendar.getInstance();
    Calendar winterVac = Calendar.getInstance();
    Calendar springBreak = Calendar.getInstance();
    Calendar end;
		
		year1617.set(2017, 6, 16);
		year1718.set(2018, 6, 15);
		
		int daysLeft, fall, winter, spring;

    // set dates and number of days in each quarter
    if (current.before(year1617)) {
      end = year1617;
      winterVac.set(2016, 12, 10);
      springBreak.set(2017, 3, 25);
      fall = 83;
      winter = 81;
      spring = 79;
    } 

    else {
      end = year1718;
      winterVac.set(2017, 12, 16);
      springBreak.set(2018, 3, 24);
      fall = 83;
      winter = 81;
      spring = 80;
    }

    // set number of days left in school year
    if (current.before(winterVac)) {
      daysLeft = (winterVac.get(Calendar.DAY_OF_YEAR) - 
        current.get(Calendar.DAY_OF_YEAR)) + winter + spring;
    } 

    else if (current.before(springBreak)) {
      daysLeft = (springBreak.get(Calendar.DAY_OF_YEAR) -
        current.get(Calendar.DAY_OF_YEAR)) + spring;
    } 

    else {
      daysLeft = end.get(Calendar.DAY_OF_YEAR) - current.get(Calendar.DAY_OF_YEAR);
    }

    // calculate remaining dining dollars

    double diningPlan = 647.44; // this will be user input

    int daysToNotSpend = 0;

    if (daysToNotSpend != 0) {
      daysLeft += daysToNotSpend;
    }
    
    double dailySpending = diningPlan/daysLeft;

    System.out.println(dailySpending);
    System.out.println(daysLeft);
    
	}
}
