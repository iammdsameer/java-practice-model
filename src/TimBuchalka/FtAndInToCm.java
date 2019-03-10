package TimBuchalka;

public class FtAndInToCm {

    public static void main(String[] args) {
        System.out.println("Result: "+calcFeetAndInchesToCentimeters(41,8));
        System.out.println("Result: "+calcFeetAndInchesToCentimeters(500));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet>=0) && (inches>=0) && (inches<=12)) {
            double result = (feet*30.48d) + (inches*2.54d);
            return result;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches>=0) {
            double convertedInches = inches % 12;
            double feet = (inches - convertedInches)/12;
            return calcFeetAndInchesToCentimeters(feet, convertedInches);
        }
        return -1;
    }
}
