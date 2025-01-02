public class LogicalOperator{
    public static void main(String[] args){
        // logical Operators
        boolean isCustomer = true;
        boolean isCustomerPaid = false;
        System.out.println(isCustomer && isCustomerPaid);
        System.out.println(isCustomer || isCustomerPaid);

        // Comparison Operators
        int totalEarning = 300000;
        boolean checkTaxStatus = totalEarning > 150000 && isCustomer;
        System.out.println(checkTaxStatus);
    }
}