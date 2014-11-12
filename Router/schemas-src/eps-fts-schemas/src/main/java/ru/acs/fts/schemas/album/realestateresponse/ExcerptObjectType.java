
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * Информация из ЕГРП
 */
public class ExcerptObjectType
{
    private String rightAssert;
    private String rightClaim;
    private EstateObjectType estateObject;

    /** 
     * Get the 'RightAssert' element value. Правопритязания
     * 
     * @return value
     */
    public String getRightAssert() {
        return rightAssert;
    }

    /** 
     * Set the 'RightAssert' element value. Правопритязания
     * 
     * @param rightAssert
     */
    public void setRightAssert(String rightAssert) {
        this.rightAssert = rightAssert;
    }

    /** 
     * Get the 'RightClaim' element value. Право требования
     * 
     * @return value
     */
    public String getRightClaim() {
        return rightClaim;
    }

    /** 
     * Set the 'RightClaim' element value. Право требования
     * 
     * @param rightClaim
     */
    public void setRightClaim(String rightClaim) {
        this.rightClaim = rightClaim;
    }

    /** 
     * Get the 'EstateObject' element value. Объект недвижимости
     * 
     * @return value
     */
    public EstateObjectType getEstateObject() {
        return estateObject;
    }

    /** 
     * Set the 'EstateObject' element value. Объект недвижимости
     * 
     * @param estateObject
     */
    public void setEstateObject(EstateObjectType estateObject) {
        this.estateObject = estateObject;
    }
}
