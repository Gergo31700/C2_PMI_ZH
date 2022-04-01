import java.util.HashMap;
import java.util.Map;

public class Team {
    public String name="";
    public String  position="";

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    Map<String,String>  team = new HashMap<>();




    public void newMember(String name, String position) {

        this.name=name;
        this.position=position;
        team.put(name,position);
    }

    public void leaveTeam(String name) {


            team.remove(name);




    }
}
