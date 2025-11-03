package sample;

public class Company {
  static  String companyName; 
  final static String REGNO="CTS1234";
  static String companyLocation ;
  static{
    companyName="Cognizant Technologies Pvt. Ltd.";
    companyLocation="Chennai";
  }
  static void showCompanyDetails(){
    System.out.println("Company name is "+companyName+"\n Company Location is "+companyLocation);
  }
}
