
package ru.acs.fts.schemas.album.regconfirmdocrequest;

/** 
 * Описание деятельности/товара/объекта
 */
public class ObjectDescriptionType
{
    private String kindCode;
    private String objectName;
    private String movementType;
    private String objectNumber;
    private String manufacturer;

    /** 
     * Get the 'KindCode' element value. Код вида деятельности/Тип лекарственного средства (1 - лекарственный препарат; 2 - субстанция)/Тип объекта
     * 
     * @return value
     */
    public String getKindCode() {
        return kindCode;
    }

    /** 
     * Set the 'KindCode' element value. Код вида деятельности/Тип лекарственного средства (1 - лекарственный препарат; 2 - субстанция)/Тип объекта
     * 
     * @param kindCode
     */
    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    /** 
     * Get the 'ObjectName' element value. Описание вида деятельности/объекта/изделия и т.п.
     * 
     * @return value
     */
    public String getObjectName() {
        return objectName;
    }

    /** 
     * Set the 'ObjectName' element value. Описание вида деятельности/объекта/изделия и т.п.
     * 
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /** 
     * Get the 'MovementType' element value. Тип перевозок (ПП/ПГ)
     * 
     * @return value
     */
    public String getMovementType() {
        return movementType;
    }

    /** 
     * Set the 'MovementType' element value. Тип перевозок (ПП/ПГ)
     * 
     * @param movementType
     */
    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    /** 
     * Get the 'ObjectNumber' element value. Номер объекта
     * 
     * @return value
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /** 
     * Set the 'ObjectNumber' element value. Номер объекта
     * 
     * @param objectNumber
     */
    public void setObjectNumber(String objectNumber) {
        this.objectNumber = objectNumber;
    }

    /** 
     * Get the 'Manufacturer' element value. Производитель
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Производитель
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
