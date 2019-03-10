package TimBuchalka;

public class SwitchCase {
    public static void main(String[] args) {
        String is="Sanchai";
        switch(is) {
            case "K xa":
                System.out.println("Thikai bhanum");
                break;
            case "Ani aru bhana":
                System.out.println("Aru ta testai ho");
                break;
            case "Sanchai": case "Sanchai xau":
                System.out.println("Ekdam");
                break;
            default:
                System.out.println("Sab jana chup, sab le jhuto bolyo!");
                break;
        }

        String hi="JANuAry";
        System.out.println(hi.toLowerCase());
    }
}
