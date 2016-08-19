package servlets;

import beans.Computer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Iurii_Kryshtop on 8/11/2016.
 */

@WebServlet("/servlet")
public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int cpu = Integer.parseInt(req.getParameter("cpu"));
        int ram = Integer.parseInt(req.getParameter("ram"));
        int hdd = Integer.parseInt(req.getParameter("hdd"));
        int ssd = Integer.parseInt(req.getParameter("ssd"));
        int video = Integer.parseInt(req.getParameter("video"));
        int power = Integer.parseInt(req.getParameter("power"));
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setRam(ram);
        computer.setHdd(hdd);
        computer.setSsd(ssd);
        computer.setVideo(video);
        computer.setPower(power);
          computer.setPrice(cpu*2);
        computer.setPrice(cpu*80 + ram*0.005 + hdd*0.1 + ssd*0.35 + video*0.1 + power*0.1 + 200);
        req.getSession().setAttribute("computer", computer);
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }

}
