
package ru.acs.fts.schemas.album.revealeddirections;

import java.util.ArrayList;
import java.util.List;

/** 
 * Список сработавших оперативных ориентировок
 */
public class DirectionsListType
{
    private String directionKind;
    private List<String> informationTextList = new ArrayList<String>();
    private DirectionRegNumberType directionRegNumber;
    private ContactInfoType contactInfo;

    /** 
     * Get the 'DirectionKind' element value. Код типа оперативной ориентировки: 1 - информационная, 2- скрытая, 3 -блокирующая
     * 
     * @return value
     */
    public String getDirectionKind() {
        return directionKind;
    }

    /** 
     * Set the 'DirectionKind' element value. Код типа оперативной ориентировки: 1 - информационная, 2- скрытая, 3 -блокирующая
     * 
     * @param directionKind
     */
    public void setDirectionKind(String directionKind) {
        this.directionKind = directionKind;
    }

    /** 
     * Get the list of 'InformationText' element items. Информационное сообщение для должностного лица пункта пропуска
     * 
     * @return list
     */
    public List<String> getInformationTextList() {
        return informationTextList;
    }

    /** 
     * Set the list of 'InformationText' element items. Информационное сообщение для должностного лица пункта пропуска
     * 
     * @param list
     */
    public void setInformationTextList(List<String> list) {
        informationTextList = list;
    }

    /** 
     * Get the 'DirectionRegNumber' element value. Регистрационный номер оперативной ориентировки
     * 
     * @return value
     */
    public DirectionRegNumberType getDirectionRegNumber() {
        return directionRegNumber;
    }

    /** 
     * Set the 'DirectionRegNumber' element value. Регистрационный номер оперативной ориентировки
     * 
     * @param directionRegNumber
     */
    public void setDirectionRegNumber(DirectionRegNumberType directionRegNumber) {
        this.directionRegNumber = directionRegNumber;
    }

    /** 
     * Get the 'ContactInfo' element value. Информация о владельце оперативной ориентировки
     * 
     * @return value
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /** 
     * Set the 'ContactInfo' element value. Информация о владельце оперативной ориентировки
     * 
     * @param contactInfo
     */
    public void setContactInfo(ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }
}
