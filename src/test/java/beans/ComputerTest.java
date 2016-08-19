package beans;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Iurii_Kryshtop on 8/19/2016.
 */
public class ComputerTest {
    @Test
    public void CompTest() {
        Computer computer = new Computer();
        computer.setPower(500);
        computer.setVideo(2000);
        computer.setSsd(120);
        computer.setHdd(1000);
        computer.setPrice(2000.);
        computer.setRam(8000);
        assertEquals(500, computer.getPower());
        assertEquals(2000, computer.getVideo());
        assertEquals(120, computer.getSsd());
        assertEquals(1000, computer.getHdd());
        assertEquals(8000, computer.getRam());
        assertEquals(2000., computer.getPrice());
    }
}
