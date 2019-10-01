package jp.co.systena.tigerscave.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RPGController {

	@RequestMapping(value = "/CharacterView" )
		public ModelAndView index(ModelAndView mav) {
		mav.setViewName("/CharacterCreateView");
		return mav;
	}


	@RequestMapping(value = "/CommandView" )
	public ModelAndView index1(ModelAndView mav) {
		mav.setViewName("/CommandView");
		return mav;

	}


	@RequestMapping(value = "/ResultView" )
	public ModelAndView index2(ModelAndView mav) {
		mav.setViewName("/ResultView");
		return mav;

	}

}
