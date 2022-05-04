package hotels;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hotelHome")
public class hotelHomeController {
	@GetMapping
	public String home() {
		return "hotelHome";
}
	
}
