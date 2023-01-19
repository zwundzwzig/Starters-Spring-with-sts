package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {

	@RequestMapping("/filelist")
	public ModelAndView downloadlist() {
		ModelAndView mv= new ModelAndView();
		File f = new File("/Users/junhyungcho/Downloads/upload/");
		String[] filelist =  f.list();
		
		mv.addObject("filelist", filelist);
		mv.setViewName("upload/filelist");
		return mv;
	}
	
	@RequestMapping("/filedownload")
	public void filedownload(String onefile, HttpServletResponse response) throws IOException {
		File f = new File("/Users/junhyungcho/Downloads/upload/" + onefile);
		int f_length = (int)f.length();
		
		response.setContentType("application/download");
		response.setContentLength(f_length);
		response.setHeader("Content-Disposition", "attachment;filename=\"" + onefile + "\"");
		
		OutputStream out = response.getOutputStream();
		FileInputStream f_in= new FileInputStream(f) ;
		FileCopyUtils.copy(f_in, out);
		f_in.close();
		out.close();
	} 
	
}










