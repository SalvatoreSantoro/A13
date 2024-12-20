package com.groom.manvsclass.model.filesystem.upload;

public class FileUploadResponse {
	private String fileName;
	private String downloadUri;
	private long size;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDownloadUri() {
		return downloadUri;
	}
	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
    //MODIFICA (11/02/2024)
	private String errorMessage;

    // public FileUploadResponse(String errorMessage) {
    //     this.errorMessage = errorMessage;
    // }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

	//FINE MODIFICA
	
}
