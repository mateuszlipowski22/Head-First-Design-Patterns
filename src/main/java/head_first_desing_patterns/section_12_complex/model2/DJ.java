package head_first_desing_patterns.section_12_complex.model2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DJ extends HttpServlet {

    public void initialize() throws ServletException {
        BeatModel beatModel=new BeatModel();
        beatModel.initialize();
        getServletContext().setAttribute("beatModel", beatModel);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        BeatModel beatModel= (BeatModel) getServletContext().getAttribute("beatModel");

        String bpm = request.getParameter("bpm");

        if(bpm==null){
            bpm=beatModel.getBPM()+"";
        }

        String set = request.getParameter("set");

        if(set!=null){
            int bpmInt=90;
            bpmInt = Integer.parseInt(bpm);
            beatModel.setBPM(bpmInt);
        }

        String decrease = request.getParameter("decrease");
        if(decrease!=null){
            beatModel.setBPM(beatModel.getBPM()-1);
        }

        String increase = request.getParameter("increase");
        if(increase!=null){
            beatModel.setBPM(beatModel.getBPM()+1);
        }

        String start = request.getParameter("start");
        if(start!=null){
            beatModel.on();
        }

        String stop = request.getParameter("stop");
        if(stop!=null){
            beatModel.off();
        }

        request.setAttribute("beatModel", beatModel);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DJview.jsp");
        dispatcher.forward(request, response);
    }

}
