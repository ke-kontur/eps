
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ���
 */
public class HatchType
{
    private String hatchKind;
    private String hatchDescription;

    /** 
     * Get the 'HatchKind' element value. ��� ����: "0" - ������������, "1" - �������������
     * 
     * @return value
     */
    public String getHatchKind() {
        return hatchKind;
    }

    /** 
     * Set the 'HatchKind' element value. ��� ����: "0" - ������������, "1" - �������������
     * 
     * @param hatchKind
     */
    public void setHatchKind(String hatchKind) {
        this.hatchKind = hatchKind;
    }

    /** 
     * Get the 'HatchDescription' element value. ��������
     * 
     * @return value
     */
    public String getHatchDescription() {
        return hatchDescription;
    }

    /** 
     * Set the 'HatchDescription' element value. ��������
     * 
     * @param hatchDescription
     */
    public void setHatchDescription(String hatchDescription) {
        this.hatchDescription = hatchDescription;
    }
}
