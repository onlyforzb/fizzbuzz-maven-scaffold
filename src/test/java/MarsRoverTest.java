import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.print.DocFlavor;

import static org.fest.assertions.api.Assertions.assertThat;


public class MarsRoverTest {

    @Rule
    public  ExpectedException expectedException = ExpectedException.none();
    @Test
    public void should_land_the_rover_on_area(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.EAST);
        String position = rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }
    @Test
    public void should_move_forward_east(){
        Area area = new Area(10,10);
        Rover rover =new Rover();
        rover.land(area,5,5, Rover.EAST);
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("65E");
    }
    @Test
    public void should_move_forward_south(){
        Area area = new Area(10,10);
        Rover rover =new Rover();
        rover.land(area,5,5, Rover.SOUTH);
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("54S");
    }
    @Test
    public void should_move_forward_west(){
        Area area = new Area(10,10);
        Rover rover =new Rover();
        rover.land(area,5,5, Rover.WEST);
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("45W");
    }
    @Test
    public void should_move_forward_north(){
        Area area = new Area(10,10);
        Rover rover =new Rover();
        rover.land(area,5,5, Rover.NORTH);
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("56N");
    }
    @Test
    public void should_turn_left(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,Rover.NORTH);
        rover.turLeft();
        assertThat(rover.getPosition()).isEqualTo("55W");
        rover.turLeft();
        assertThat(rover.getPosition()).isEqualTo("55S");
        rover.turLeft();
        assertThat(rover.getPosition()).isEqualTo("55E");
        rover.turLeft();
        assertThat(rover.getPosition()).isEqualTo("55N");
    }
    @Test
    public void should_turn_right(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,Rover.NORTH);
        rover.turRight();
        assertThat(rover.getPosition()).isEqualTo("55E");
        rover.turRight();
        assertThat(rover.getPosition()).isEqualTo("55S");
        rover.turRight();
        assertThat(rover.getPosition()).isEqualTo("55W");
        rover.turRight();
        assertThat(rover.getPosition()).isEqualTo("55N");
    }
    @Test
    public void should_execute_batch_commands(){
        Rover rover =new Rover();
        RoverController roverController = new RoverController();
        String mission = "10,10,5,5,E,M,L,M,R";
        String position = roverController.execute(mission);
        assertThat(position).isEqualTo("66E");
    }
    @Test
    public void should_warning_when_land_out_of_area(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("x=20 is out of area width 10");
        Area area = new Area(10,10);
        Rover rover =new Rover();
        rover.land(area,20,30, Rover.SOUTH);
    }
}