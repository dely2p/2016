package kr.co.test.web.control;

import org.springframework.web.multipart.MultipartFile;

//dto
public class UploadFile {
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
}
