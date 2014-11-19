
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� ���������
 */
public class ArriveCustomsDocType extends DocumentBaseType
{
    private String documentCode;

    /** 
     * Get the 'DocumentCode' element value. ��� ����������� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ����������� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }
}
