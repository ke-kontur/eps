
package ru.acs.fts.schemas.album.transportmeanschassispassport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * Сведения о сделках с шасси ТС
 */
public class ChassicBargainType
{
    private LocalDate sellingDate;
    private TransportOwnerType newChassisOwner;
    private List<DocumentBaseType> docPropertyRightList = new ArrayList<DocumentBaseType>();
    private PersonBaseType prevOwnerSign;
    private PersonBaseType newOwnerSign;

    /** 
     * Get the 'SellingDate' element value. Дата продажи
     * 
     * @return value
     */
    public LocalDate getSellingDate() {
        return sellingDate;
    }

    /** 
     * Set the 'SellingDate' element value. Дата продажи
     * 
     * @param sellingDate
     */
    public void setSellingDate(LocalDate sellingDate) {
        this.sellingDate = sellingDate;
    }

    /** 
     * Get the 'NewChassisOwner' element value. Сведения о новом собственнике ТС
     * 
     * @return value
     */
    public TransportOwnerType getNewChassisOwner() {
        return newChassisOwner;
    }

    /** 
     * Set the 'NewChassisOwner' element value. Сведения о новом собственнике ТС
     * 
     * @param newChassisOwner
     */
    public void setNewChassisOwner(TransportOwnerType newChassisOwner) {
        this.newChassisOwner = newChassisOwner;
    }

    /** 
     * Get the list of 'DocPropertyRights' element items. Документ на право  собственности
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocPropertyRightList() {
        return docPropertyRightList;
    }

    /** 
     * Set the list of 'DocPropertyRights' element items. Документ на право  собственности
     * 
     * @param list
     */
    public void setDocPropertyRightList(List<DocumentBaseType> list) {
        docPropertyRightList = list;
    }

    /** 
     * Get the 'PrevOwnerSign' element value. Подпись прежнего  собственника
     * 
     * @return value
     */
    public PersonBaseType getPrevOwnerSign() {
        return prevOwnerSign;
    }

    /** 
     * Set the 'PrevOwnerSign' element value. Подпись прежнего  собственника
     * 
     * @param prevOwnerSign
     */
    public void setPrevOwnerSign(PersonBaseType prevOwnerSign) {
        this.prevOwnerSign = prevOwnerSign;
    }

    /** 
     * Get the 'NewOwnerSign' element value. Подпись настоящего  собственника
     * 
     * @return value
     */
    public PersonBaseType getNewOwnerSign() {
        return newOwnerSign;
    }

    /** 
     * Set the 'NewOwnerSign' element value. Подпись настоящего  собственника
     * 
     * @param newOwnerSign
     */
    public void setNewOwnerSign(PersonBaseType newOwnerSign) {
        this.newOwnerSign = newOwnerSign;
    }
}
