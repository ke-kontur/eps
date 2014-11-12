
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Информация о происшествии (об аварии или действии непреодолимой силы во время перевозки)
 */
public class IncidentInfoType
{
    private String incidentDescription;
    private LocalDate date;
    private String measures;
    private AddressType accidentPlace;
    private CustomsPersonType customsPerson;
    private DamageIndicatorsType damageIndicators;
    private List<LostGoodsInfoType> lostGoodsInfoList = new ArrayList<LostGoodsInfoType>();

    /** 
     * Get the 'IncidentDescription' element value. Описание обстоятельства, препятствующего перевозке товаров
     * 
     * @return value
     */
    public String getIncidentDescription() {
        return incidentDescription;
    }

    /** 
     * Set the 'IncidentDescription' element value. Описание обстоятельства, препятствующего перевозке товаров
     * 
     * @param incidentDescription
     */
    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    /** 
     * Get the 'Date' element value. Дата происшествия
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата происшествия
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Measures' element value. Меры, принятые для продолжения перевозки товаров под таможенным контролем.
     * 
     * @return value
     */
    public String getMeasures() {
        return measures;
    }

    /** 
     * Set the 'Measures' element value. Меры, принятые для продолжения перевозки товаров под таможенным контролем.
     * 
     * @param measures
     */
    public void setMeasures(String measures) {
        this.measures = measures;
    }

    /** 
     * Get the 'AccidentPlace' element value. Место происшествия
     * 
     * @return value
     */
    public AddressType getAccidentPlace() {
        return accidentPlace;
    }

    /** 
     * Set the 'AccidentPlace' element value. Место происшествия
     * 
     * @param accidentPlace
     */
    public void setAccidentPlace(AddressType accidentPlace) {
        this.accidentPlace = accidentPlace;
    }

    /** 
     * Get the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа, составившем акт об аварии.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа, составившем акт об аварии.
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DamageIndicators' element value. Признаки наличия повреждений
     * 
     * @return value
     */
    public DamageIndicatorsType getDamageIndicators() {
        return damageIndicators;
    }

    /** 
     * Set the 'DamageIndicators' element value. Признаки наличия повреждений
     * 
     * @param damageIndicators
     */
    public void setDamageIndicators(DamageIndicatorsType damageIndicators) {
        this.damageIndicators = damageIndicators;
    }

    /** 
     * Get the list of 'LostGoodsInfo' element items. Информация об утрате (отсутствии/уничтожении) части товара
     * 
     * @return list
     */
    public List<LostGoodsInfoType> getLostGoodsInfoList() {
        return lostGoodsInfoList;
    }

    /** 
     * Set the list of 'LostGoodsInfo' element items. Информация об утрате (отсутствии/уничтожении) части товара
     * 
     * @param list
     */
    public void setLostGoodsInfoList(List<LostGoodsInfoType> list) {
        lostGoodsInfoList = list;
    }
}
