package java_programming_hw_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_StationZone
{
    public static void main(String[] args) {
        Map<String,String[]> stationLine=new HashMap<>();
        stationLine.put("Piccadilly Circus",new String[]{"Bakerloo line","Piccadilly line"});
        stationLine.put("Waterloo",new String[]{"Jubilee line","Northern line"});
        stationLine.put("Bond Street",new String[]{"Central line","Northern line","Bakerloo line"});
        stationLine.put("Oxford Circus", new String[]{"Central line","Victoria line","Central line"});
        stationLine.put("Leicester square",new String[]{"Piccadilly line","Northern line"});
        stationLine.put("Paddington",new String[]{"Bakerloo line","Circle line","District line"});
        stationLine.put("Liverpool Street",new String[]{"Metropolitan line","Circle Hammersmith & City"});
        System.out.println("Few stations name and lines passing through it");
        for (String key : stationLine.keySet()) {
            System.out.println(key + ": " + String.join(", ", stationLine.get(key)));
        }
    }
}
