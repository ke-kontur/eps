
package ru.acs.fts.schemas.album.errorlist;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ��������
 */
public class BadDocumentType
{
    private String docID;
    private String docName;
    private String docModeID;
    private List<ErrorType> errorList = new ArrayList<ErrorType>();

    /** 
     * Get the 'DocID' element value. ���������� ������������� ��������� � ��������.
     * 
     * @return value
     */
    public String getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. ���������� ������������� ��������� � ��������.
     * 
     * @param docID
     */
    public void setDocID(String docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'DocName' element value. �������� ��������� � ��������
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. �������� ��������� � ��������
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'DocModeID' element value. ��� ���� ���������� ���������  (�������� �������� DocumentModeID).
     * 
     * @return value
     */
    public String getDocModeID() {
        return docModeID;
    }

    /** 
     * Set the 'DocModeID' element value. ��� ���� ���������� ���������  (�������� �������� DocumentModeID).
     * 
     * @param docModeID
     */
    public void setDocModeID(String docModeID) {
        this.docModeID = docModeID;
    }

    /** 
     * Get the list of 'Error' element items. �������� ������
     * 
     * @return list
     */
    public List<ErrorType> getErrorList() {
        return errorList;
    }

    /** 
     * Set the list of 'Error' element items. �������� ������
     * 
     * @param list
     */
    public void setErrorList(List<ErrorType> list) {
        errorList = list;
    }
}
