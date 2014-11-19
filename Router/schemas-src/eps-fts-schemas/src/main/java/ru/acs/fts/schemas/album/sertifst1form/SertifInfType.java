
package ru.acs.fts.schemas.album.sertifst1form;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * —ведени€ об удостоверении сертификата
 */
public class SertifInfType
{
    private String organizationName;
    private LocalDate dateInf;
    private String FIO;
    private String signPlace;
    private AddressType place;

    /** 
     * Get the 'OrganizationName' element value. Ќаименование органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Ќаименование органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'DateInf' element value. ƒата удостоверени€ документа
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ƒата удостоверени€ документа
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'FIO' element value. ‘»ќ лица удостоверившего сертификат
     * 
     * @return value
     */
    public String getFIO() {
        return FIO;
    }

    /** 
     * Set the 'FIO' element value. ‘»ќ лица удостоверившего сертификат
     * 
     * @param FIO
     */
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    /** 
     * Get the 'SignPlace' element value. ћесто  подписи
     * 
     * @return value
     */
    public String getSignPlace() {
        return signPlace;
    }

    /** 
     * Set the 'SignPlace' element value. ћесто  подписи
     * 
     * @param signPlace
     */
    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    /** 
     * Get the 'Place' element value. јдрес органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @return value
     */
    public AddressType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. јдрес органа, уполномоченного в соответствии с национальным законодательством удостовер€ть происхождение товаров
     * 
     * @param place
     */
    public void setPlace(AddressType place) {
        this.place = place;
    }
}
