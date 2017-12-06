package com.qhit.lh.gr3.ui.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {
	private String username;
	private File uploadFile;
	
	private String uploadFileName;
	private String uploadFileContentType;
	
	public String upload() {
		if(uploadFile!=null) {
			/*�ϴ���ҵ��
			 * 
			 * */
			
			try {
				InputStream is =new FileInputStream(uploadFile);
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file =new File(savePath);
				if(!file.exists()) {
					file.mkdirs();
				
				OutputStream os =new FileOutputStream(savePath+"/"+uploadFileName);
				byte [] buffer=new byte[8096];
				int len=0;
				try {
					while((len=is.read(buffer))!=-1) {
						os.write(buffer, 0, len);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				super.addFieldError("uploadFile", "�ļ�δ�ҵ�");
				
			}
		}else {
			//�ļ�δ�ҵ�
			
			super.addFieldError("uploadFile", "�ļ�δ�ҵ�");
		}
		return "uploadSuccess";
		
		
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	
}
