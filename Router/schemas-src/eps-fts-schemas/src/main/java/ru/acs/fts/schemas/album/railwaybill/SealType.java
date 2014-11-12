
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Количество и знаки пломб,  наложенных на вагон или контейнер
 */
public class SealType
{
    private String sealID;
    private String sealQuantity;
    private String identKind;
    private String identDesc;

    /** 
     * Get the 'SealID' element value. Номер пломбы
     * 
     * @return value
     */
    public String getSealID() {
        return sealID;
    }

    /** 
     * Set the 'SealID' element value. Номер пломбы
     * 
     * @param sealID
     */
    public void setSealID(String sealID) {
        this.sealID = sealID;
    }

    /** 
     * Get the 'SealQuantity' element value. Количество пломб,  наложенных на вагон или контейнер
     * 
     * @return value
     */
    public String getSealQuantity() {
        return sealQuantity;
    }

    /** 
     * Set the 'SealQuantity' element value. Количество пломб,  наложенных на вагон или контейнер
     * 
     * @param sealQuantity
     */
    public void setSealQuantity(String sealQuantity) {
        this.sealQuantity = sealQuantity;
    }

    /** 
     * Get the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @return value
     */
    public String getIdentKind() {
        return identKind;
    }

    /** 
     * Set the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @param identKind
     */
    public void setIdentKind(String identKind) {
        this.identKind = identKind;
    }

    /** 
     * Get the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @return value
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /** 
     * Set the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @param identDesc
     */
    public void setIdentDesc(String identDesc) {
        this.identDesc = identDesc;
    }
}
