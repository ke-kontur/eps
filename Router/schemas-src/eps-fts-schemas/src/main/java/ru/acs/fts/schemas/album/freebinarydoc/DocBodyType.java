
package ru.acs.fts.schemas.album.freebinarydoc;

/** 
 * Тело документа с бинарными данными
 */
public class DocBodyType
{
    private String fileName;
    private String fileData;

    /** 
     * Get the 'FileName' element value. Имя файла
     * 
     * @return value
     */
    public String getFileName() {
        return fileName;
    }

    /** 
     * Set the 'FileName' element value. Имя файла
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /** 
     * Get the 'FileData' element value. Данные файла  в кодировке BASE64
     * 
     * @return value
     */
    public String getFileData() {
        return fileData;
    }

    /** 
     * Set the 'FileData' element value. Данные файла  в кодировке BASE64
     * 
     * @param fileData
     */
    public void setFileData(String fileData) {
        this.fileData = fileData;
    }
}
