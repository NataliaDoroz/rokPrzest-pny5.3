public class Main {
    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();

        System.out.println(yearCheck.isLeap(2012));
        System.out.println(yearCheck.isLeap(2100));
        System.out.println(yearCheck.isLeap(2020));
        System.out.println(yearCheck.isLeap(2019));
        System.out.println(yearCheck.isLeap(2018));
        System.out.println(yearCheck.isLeap(2016));
        System.out.println(yearCheck.isLeap(2015));
        System.out.println(yearCheck.isLeap(2014));
        System.out.println(yearCheck.isLeap(2013));
    }
}
