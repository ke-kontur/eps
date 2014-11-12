
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ������� ��� ��� ���
 */
public class CWDocType extends BaseDocType
{
    private String documentDateTime;
    private CustomsType customsProperties;

    /** 
     * Get the 'DocumentDateTime' element value. ���� � ����� �������� ������������ ���������.
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. ���� � ����� �������� ������������ ���������.
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'CustomsProperties' element value. ��������� ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustomsProperties() {
        return customsProperties;
    }

    /** 
     * Set the 'CustomsProperties' element value. ��������� ����������� ������
     * 
     * @param customsProperties
     */
    public void setCustomsProperties(CustomsType customsProperties) {
        this.customsProperties = customsProperties;
    }
}
