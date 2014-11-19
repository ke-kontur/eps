
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * ���������� �� ����
 */
public class ExcerptObjectType
{
    private String rightAssert;
    private String rightClaim;
    private EstateObjectType estateObject;

    /** 
     * Get the 'RightAssert' element value. ���������������
     * 
     * @return value
     */
    public String getRightAssert() {
        return rightAssert;
    }

    /** 
     * Set the 'RightAssert' element value. ���������������
     * 
     * @param rightAssert
     */
    public void setRightAssert(String rightAssert) {
        this.rightAssert = rightAssert;
    }

    /** 
     * Get the 'RightClaim' element value. ����� ����������
     * 
     * @return value
     */
    public String getRightClaim() {
        return rightClaim;
    }

    /** 
     * Set the 'RightClaim' element value. ����� ����������
     * 
     * @param rightClaim
     */
    public void setRightClaim(String rightClaim) {
        this.rightClaim = rightClaim;
    }

    /** 
     * Get the 'EstateObject' element value. ������ ������������
     * 
     * @return value
     */
    public EstateObjectType getEstateObject() {
        return estateObject;
    }

    /** 
     * Set the 'EstateObject' element value. ������ ������������
     * 
     * @param estateObject
     */
    public void setEstateObject(EstateObjectType estateObject) {
        this.estateObject = estateObject;
    }
}
