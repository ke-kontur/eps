
package ru.acs.fts.schemas.album.drugpurpconfirmperm;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание лекарственного средства
 */
public class ItemDescriptionType
{
    private List<String> nameList = new ArrayList<String>();
    private LocalDate expitarionDate;
    private String cost;
    private CUOrganizationType producer;
    private SupplementaryQuantityType count;
    private DocumentBaseType gosRegistration;

    /** 
     * Get the list of 'Name' element items. Наименование лекарственного средства (форма выпуска, дозировка)
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование лекарственного средства (форма выпуска, дозировка)
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
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
