
package ru.acs.fts.schemas.album.cwformular;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ���������
 */
public class DocumentType extends DocumentBaseType
{
    private String docNN;
    private String docType;

    /** 
     * Get the 'DocNN' element value. ���������� ����� ���������
     * 
     * @return value
     */
    public String getDocNN() {
        return docNN;
    }

    /** 
     * Set the 'DocNN' element value. ���������� ����� ���������
     * 
     * @param docNN
     */
    public void setDocNN(String docNN) {
        this.docNN = docNN;
    }

    /** 
     * Get the 'DocType' element value. ��� ���������
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. ��� ���������
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }
}
