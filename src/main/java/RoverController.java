import sun.nio.cs.ext.MSISO2022JP;

public class RoverController {
    public String execute(String mission) {
        String[] missions = mission.split(",");
        Rover rover = new Rover();
        Area area = new Area(Integer.parseInt(missions[0]),Integer.parseInt(missions[1]));
        rover.land(area,Integer.parseInt(missions[2]),Integer.parseInt(missions[3]), missions[4]);
        for(int i=5;i<missions.length;i++){
            if(missions[i].equals("M")){
                rover.move();
            }
            if(missions[i].equals("L")){
                rover.turLeft();
            }
            if(missions[i].equals("R")){
                rover.turRight();
            }
        }
        return rover.getPosition();
    }
}
