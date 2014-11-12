
package ru.acs.fts.schemas.album.mzsrinvestigation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание лекарственного средства/фарм. субстанции/биообразца
 */
public class ItemDescriptionType
{
    private List<String> nameList = new ArrayList<String>();
    private String internationalName;
    private String info;
    private LocalDate expitarionDate;
    private String cost;
    private CUOrganizationType producer;
    private SupplementaryQuantityType count;
    private DocumentBaseType gosRegistration;

    /** 
     * Get the list of 'Name' element items. Наименование лекарственного средства/биообразца
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование лекарственного средства/биообразца
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'InternationalName' element value. Международное непатентованное наименование лекарственного средства
     * 
     * @return value
     */
    public String getInternationalName() {
        return internationalName;
    }

    /** 
     * Set the 'InternationalName' element value. Международное непатентованное наименование лекарственного средства
     * 
     * @param internationalName
     */
    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName;
    }

    /** 
     * Get the 'Info' element value. Информация (форма выпуска, дозировка)
     * 
     * @return value
     */
    public String getInfo() {
        return info;
    }

    /** 
     * Set the 'Info' element value. Информация (форма выпуска, дозировка)
     * 
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /** 
     * Get the 'ExpitarionDate' element value. Cрок годности
     * 
     * @return value
     */
    public LocalDate getExpitarionDate() {
        return expitarionDate;
    }

    /** 
     * Set the 'ExpitarionDate' element value. Cрок годности
     * 
     * @param expitarionDate
     */
    public void setExpitarionDate(LocalDate expitarionDate) {
        this.expitarionDate = expitarionDate;
    }

    /** 
     * Get the 'Cost' element value. Стоимость
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Producer' element value. Производитель лекарственного средства
     * 
     * @return value
     */
    public CUOrganizationType getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. Производитель лекарственного средства
     * 
     * @param producer
     */
    public void setProducer(CUOrganizationType producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'Count' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }

    /** 
     * Get the 'GosRegistration' element value. Государственная регистрация
     * 
     * @return value
     */
    public DocumentBaseType getGosRegistration() {
        return gosRegistration;
    }

    /** 
     * Set the 'GosRegistration' element value. Государственная регистрация
     * 
     * @param gosRegistration
     */
    public void setGosRegistration(DocumentBaseType gosRegistration) {
        this.gosRegistration = gosRegistration;
    }
}
