
package ru.acs.fts.schemas.album.sem_niresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����� ������� NI
 */
public class SEMNIResponseType extends BaseDocType
{
    private String message;
    private List<ResDeclarationsType> resDeclarationList = new ArrayList<ResDeclarationsType>();
    private String documentModeID;

    /** 
     * Get the 'Message' element value. ��������� � ������� ���������
     * 
     * @return value
     */
    public String getMessage() {
        return message;
    }

    /** 
     * Set the 'Message' element value. ��������� � ������� ���������
     * 
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * Get the list of 'ResDeclarations' element items. ������������ ����������
     * 
     * @return list
     */
    public List<ResDeclarationsType> getResDeclarationList() {
        return resDeclarationList;
    }

    /** 
     * Set the list of 'ResDeclarations' element items. ������������ ����������
     * 
     * @param list
     */
    public void setResDeclarationList(List<ResDeclarationsType> list) {
        resDeclarationList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
