public class EMICalculate {
    public static void main(String[] args){
        String carBrand ="Mahindra Scorpio";
        int OnRoadrice = 2100000;
        int downPayment = 500000;
        int loanAmount = OnRoadrice - downPayment;
        double interestrate=10;
        byte loanPeriod=4;
        double monthlyRate = interestrate/12/100;
        int noOfMonths = loanPeriod * 12;
        double EMI =(loanAmount *monthlyRate*Math.pow(1+monthlyRate,noOfMonths))/(Math.pow(1+monthlyRate,noOfMonths)-1);
        double totalPayment = EMI * noOfMonths;

        System.out.println("Brand Name :"+carBrand);
        System.out.println("Total Loan Amount:"+loanAmount);
        System.out.println("Payable Amount :"+totalPayment);
        System.out.println("EMI per month :"+EMI);
    }
}
