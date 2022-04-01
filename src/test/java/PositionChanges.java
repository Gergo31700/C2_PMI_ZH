import java.util.HashMap;
import java.util.Map;

class PositionChanges extends Team {

    public String name="";
    public String desc="";
    Map<String,String> up = new HashMap<>();



    public void promote(String name, String desc) {
        this.name=name;
        this.desc=desc;
        up.replace(name,desc);

    }}