package in.abhishek.java.JobApp;

import in.abhishek.java.JobApp.model.JobPost;
import in.abhishek.java.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"}) // this method will be called for both request
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjobs";
    }

    //handel the post request of the addjobs form
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
        // sucess.jsp page have an object myJobPost
    }

    //send data to view to show
    @GetMapping("viewalljobs")
    public String viewalljobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }
}
