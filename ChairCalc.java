import java.util.HashMap;
import java.util.Map;

public class ChairCalc implements ShipmentCalc{
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {
        sizeChart.put("small", 30.0);
        sizeChart.put("medium", 40.0);
        sizeChart.put("large", 50.0);
    }

    @Override
    public double compute(double size, double distance) {
        String ctg = "";

        if(size <=18.0){
            ctg = "small";
        }
        else if(size > 18.0 && size < 24.0){
            ctg = "medium";
        }
        else{
            ctg = "large";
        }

        return sizeChart.get(ctg);
    }
    
}
