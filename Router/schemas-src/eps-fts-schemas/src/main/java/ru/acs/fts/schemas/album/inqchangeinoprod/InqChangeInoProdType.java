
package ru.acs.fts.schemas.album.inqchangeinoprod;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatProductsType;

/** 
 * Заявление на проведение замены продуктов переработки иностранными товарами
 */
public class InqChangeInoProdType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private OrganizationType applicant;
    private List<TreatProductsType> inoProdactList = new ArrayList<TreatProductsType>();
    private List<TreatProductsType> treatProductList = new ArrayList<TreatProductsType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'Applicant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Сведения о заявителе
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the list of 'InoProdacts' element items. Иностранные товары, которыми предлагается заменить продукты переработки.
     * 
     * @return list
     */
    public List<TreatProductsType> getInoProdactList() {
        return inoProdactList;
    }

    /** 
     * Set the list of 'InoProdacts' element items. Иностранные товары, которыми предлагается заменить продукты переработки.
     * 
     * @param list
     */
    public void setInoProdactList(List<TreatProductsType> list) {
        inoProdactList = list;
    }

    /** 
     * Get the list of 'TreatProducts' element items. Продукты переработки, которые подлежат замене.
     * 
     * @return list
     */
    public List<TreatProductsType> getTreatProductList() {
        return treatProductList;
    }

    /** 
     * Set the list of 'TreatProducts' element items. Продукты переработки, которые подлежат замене.
     * 
     * @param list
     */
    public void setTreatProductList(List<TreatProductsType> list) {
        treatProductList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
