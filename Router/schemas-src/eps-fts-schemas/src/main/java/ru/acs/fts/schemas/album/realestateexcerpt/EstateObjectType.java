
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * Объект недвижимости
 */
public class EstateObjectType
{
    private String objectSign;
    private String estateObjectSign;
    private String housingSign;
    private String isRoom;
    private String areaValue;
    private String areaUnit;
    private String objectDescription;
    private String cadastrNumber;
    private String additionalInfo;
    private String ID;
    private String conditionCadastrNum;
    private AddressType address;

    /** 
     * Get the 'ObjectSign' element value. Тип объекта: 0 - земельный участок; 1 - объект недвижимости
     * 
     * @return value
     */
    public String getObjectSign() {
        return objectSign;
    }

    /** 
     * Set the 'ObjectSign' element value. Тип объекта: 0 - земельный участок; 1 - объект недвижимости
     * 
     * @param objectSign
     */
    public void setObjectSign(String objectSign) {
        this.objectSign = objectSign;
    }

    /** 
     * Get the 'EstateObjectSign' element value. Тип объекта недвижимости: 1 - помещение; 2 - здание; 3 - иное
     * 
     * @return value
     */
    public String getEstateObjectSign() {
        return estateObjectSign;
    }

    /** 
     * Set the 'EstateObjectSign' element value. Тип объекта недвижимости: 1 - помещение; 2 - здание; 3 - иное
     * 
     * @param estateObjectSign
     */
    public void setEstateObjectSign(String estateObjectSign) {
        this.estateObjectSign = estateObjectSign;
    }

    /** 
     * Get the 'HousingSign' element value. Признак того, что объект недвижимости является жилым (квартира, жилой дом)
     * 
     * @return value
     */
    public String getHousingSign() {
        return housingSign;
    }

    /** 
     * Set the 'HousingSign' element value. Признак того, что объект недвижимости является жилым (квартира, жилой дом)
     * 
     * @param housingSign
     */
    public void setHousingSign(String housingSign) {
        this.housingSign = housingSign;
    }

    /** 
     * Get the 'IsRoom' element value. Признак того, что помещение является комнатой
     * 
     * @return value
     */
    public String getIsRoom() {
        return isRoom;
    }

    /** 
     * Set the 'IsRoom' element value. Признак того, что помещение является комнатой
     * 
     * @param isRoom
     */
    public void setIsRoom(String isRoom) {
        this.isRoom = isRoom;
    }

    /** 
     * Get the 'AreaValue' element value. Площадь объекта
     * 
     * @return value
     */
    public String getAreaValue() {
        return areaValue;
    }

    /** 
     * Set the 'AreaValue' element value. Площадь объекта
     * 
     * @param areaValue
     */
    public void setAreaValue(String areaValue) {
        this.areaValue = areaValue;
    }

    /** 
     * Get the 'AreaUnit' element value. Единица измерения площади
     * 
     * @return value
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /** 
     * Set the 'AreaUnit' element value. Единица измерения площади
     * 
     * @param areaUnit
     */
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    /** 
     * Get the 'ObjectDescription' element value. Описание объекта
     * 
     * @return value
     */
    public String getObjectDescription() {
        return objectDescription;
    }

    /** 
     * Set the 'ObjectDescription' element value. Описание объекта
     * 
     * @param objectDescription
     */
    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    /** 
     * Get the 'CadastrNumber' element value. Кадастровый номер
     * 
     * @return value
     */
    public String getCadastrNumber() {
        return cadastrNumber;
    }

    /** 
     * Set the 'CadastrNumber' element value. Кадастровый номер
     * 
     * @param cadastrNumber
     */
    public void setCadastrNumber(String cadastrNumber) {
        this.cadastrNumber = cadastrNumber;
    }

    /** 
     * Get the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. Дополнительная информация
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ID' element value. Внутренний идентификатор
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Внутренний идентификатор
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ConditionCadastrNum' element value. Условный кадастровый номер
     * 
     * @return value
     */
    public String getConditionCadastrNum() {
        return conditionCadastrNum;
    }

    /** 
     * Set the 'ConditionCadastrNum' element value. Условный кадастровый номер
     * 
     * @param conditionCadastrNum
     */
    public void setConditionCadastrNum(String conditionCadastrNum) {
        this.conditionCadastrNum = conditionCadastrNum;
    }

    /** 
     * Get the 'Address' element value. Адрес объекта
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес объекта
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
