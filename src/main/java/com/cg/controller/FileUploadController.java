package com.cg.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * fileUploadController
 * @author Administrator
 *
 */
//@Controller
@RestController  //表示該類下的方法返回值會自動做json格式轉換
public class FileUploadController {

	/**
	 * 文件上傳
	 * @param fileName
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/uploadFile")
	public Map<String,Object> uploadFile(MultipartFile fileName) throws Exception{
		System.out.println(fileName.getOriginalFilename());
		fileName.transferTo(new File("e:/"+fileName.getOriginalFilename()));
		Map<String,Object> map = new HashMap();
		map.put("msg", "upload OK");
		return map;
	}
}
