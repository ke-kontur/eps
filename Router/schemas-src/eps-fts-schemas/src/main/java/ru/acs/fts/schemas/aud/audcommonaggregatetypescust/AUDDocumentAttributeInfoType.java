
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDDocumentAttributeValueKindType;

/** 
 * ���������� � ��������� ���������.
 */
public class AUDDocumentAttributeInfoType
        extends
            AUDDocumentAttributeIdInfoType
{
    private String description;
    private AUDDocumentAttributeValueKindType valueKind;

    /** 
     * Get the 'Description' element value. �������� ��������� (������� ��������).
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ��������� (������� ��������).
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'ValueKind' element value. ��� �������� ���������.
     * 
     * @return value
     */
    public AUDDocumentAttributeValueKindType getValueKind() {
        return valueKind;
    }

    /** 
     * Set the 'ValueKind' element value. ��� �������� ���������.
     * 
     * @param valueKind
     */
    public void setValueKind(AUDDocumentAttributeValueKindType valueKind) {
        this.valueKind = valueKind;
    }
}
