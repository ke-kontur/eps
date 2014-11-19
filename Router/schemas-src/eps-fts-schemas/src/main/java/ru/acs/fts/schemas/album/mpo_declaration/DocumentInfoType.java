
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������
 */
public class DocumentInfoType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. ��� ��������� (EDIFACT � UPU)
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ��������� (EDIFACT � UPU)
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
