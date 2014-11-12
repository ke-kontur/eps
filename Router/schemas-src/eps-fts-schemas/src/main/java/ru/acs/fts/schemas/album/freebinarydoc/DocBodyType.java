
package ru.acs.fts.schemas.album.freebinarydoc;

/** 
 * ���� ��������� � ��������� �������
 */
public class DocBodyType
{
    private String fileName;
    private String fileData;

    /** 
     * Get the 'FileName' element value. ��� �����
     * 
     * @return value
     */
    public String getFileName() {
        return fileName;
    }

    /** 
     * Set the 'FileName' element value. ��� �����
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /** 
     * Get the 'FileData' element value. ������ �����  � ��������� BASE64
     * 
     * @return value
     */
    public String getFileData() {
        return fileData;
    }

    /** 
     * Set the 'FileData' element value. ������ �����  � ��������� BASE64
     * 
     * @param fileData
     */
    public void setFileData(String fileData) {
        this.fileData = fileData;
    }
}
