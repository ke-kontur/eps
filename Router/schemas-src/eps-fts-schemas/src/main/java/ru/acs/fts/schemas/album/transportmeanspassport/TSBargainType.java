
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * Сведения о сделках с транспортным средством
 */
public class TSBargainType
{
    private LocalDate sellingDate;
    private String specialMark;
    private DocumentBaseType docPropertyRights;
    private TransportOwnerType newTransportOwner;
    private PersonBaseType prevOwnerSign;
    private PersonBaseType newOwnerSign;
    private GIBDDRegistrationType GIBDDRegistration;

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
     * Get the 'SpecialMark' element value. Особые отметки
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. Особые отметки
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /** 
     * Get the 'DocPropertyRights' element value. Документы на право собственности
     * 
     * @return value
     */
    public DocumentBaseType getDocPropertyRights() {
        return docPropertyRights;
    }

    /** 
     * Set the 'DocPropertyRights' element value. Документы на право собственности
     * 
     * @param docPropertyRights
     */
    public void setDocPropertyRights(DocumentBaseType docPropertyRights) {
        this.docPropertyRights = docPropertyRights;
    }

    /** 
     * Get the 'NewTransportOwner' element value. Сведения о новом собственнике ТС
     * 
     * @return value
     */
    public TransportOwnerType getNewTransportOwner() {
        return newTransportOwner;
    }

    /** 
     * Set the 'NewTransportOwner' element value. Сведения о новом собственнике ТС
     * 
     * @param newTransportOwner
     */
    public void setNewTransportOwner(TransportOwnerType newTransportOwner) {
        this.newTransportOwner = newTransportOwner;
    }

    /** 
     * Get the 'PrevOwnerSign' element value. Подпись прежнего собственника
     * 
     * @return value
     */
    public PersonBaseType getPrevOwnerSign() {
        return prevOwnerSign;
    }

    /** 
     * Set the 'PrevOwnerSign' element value. Подпись прежнего собственника
     * 
     * @param prevOwnerSign
     */
    public void setPrevOwnerSign(PersonBaseType prevOwnerSign) {
        this.prevOwnerSign = prevOwnerSign;
    }

    /** 
     * Get the 'NewOwnerSign' element value. Подпись настоящего собственника
     * 
     * @return value
     */
    public PersonBaseType getNewOwnerSign() {
        return newOwnerSign;
    }

    /** 
     * Set the 'NewOwnerSign' element value. Подпись настоящего собственника
     * 
     * @param newOwnerSign
     */
    public void setNewOwnerSign(PersonBaseType newOwnerSign) {
        this.newOwnerSign = newOwnerSign;
    }

    /** 
     * Get the 'GIBDDRegistration' element value. Сведения об учете ТС в ГИБДД
     * 
     * @return value
     */
    public GIBDDRegistrationType getGIBDDRegistration() {
        return GIBDDRegistration;
    }

    /** 
     * Set the 'GIBDDRegistration' element value. Сведения об учете ТС в ГИБДД
     * 
     * @param GIBDDRegistration
     */
    public void setGIBDDRegistration(GIBDDRegistrationType GIBDDRegistration) {
        this.GIBDDRegistration = GIBDDRegistration;
    }
}
