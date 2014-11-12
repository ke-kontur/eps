
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ���� ������������� (��� ������������ ���������).
 */
public class AUDRepresentationKindCommonInfoType
        extends
            AUDRepresentationKindIdInfoType
{
    private String description;

    /** 
     * Get the 'Description' element value. �������� �������������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� �������������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
