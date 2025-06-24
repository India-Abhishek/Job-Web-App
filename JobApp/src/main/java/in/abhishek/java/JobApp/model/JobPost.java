package in.abhishek.java.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data //data annotation of lombok will take care of getter, setter, toString for this class
@NoArgsConstructor // default constructor
@AllArgsConstructor // constructor which takes all the parameters
@Component // Spring manage and create the object of this class
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
