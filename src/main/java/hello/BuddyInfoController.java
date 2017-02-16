package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuddyInfoController {

    @Autowired
    private BuddyInfoRepository buddiesRepository;

    @GetMapping("/myAddressBook")
    public String buddyForm(Model model) {
        model.addAttribute("buddyInfo", new BuddyInfo());
        return "myAddressBook";
    }

    @PostMapping("/myAddressBook")
    public String buddyResult(@ModelAttribute BuddyInfo buddyInfo) {
        System.out.print("buddy received : " + buddyInfo.getName());
        buddiesRepository.save(buddyInfo);
        return "result";
    }






}