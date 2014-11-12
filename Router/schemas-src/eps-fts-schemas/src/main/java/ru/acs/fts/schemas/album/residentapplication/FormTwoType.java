
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Форма №2. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны с целью переработки товаров, о продуктах переработки и отходах 
 */
public class FormTwoType
{
    private PersonSignatureType residentPersonSignature;
    private PersonSignatureType econZonePersonSignature;
    private List<FormTwoSectionType> sectionList = new ArrayList<FormTwoSectionType>();

    /** 
     * Get the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'EconZonePersonSignature' element value. ФИО и подпись уполномоченного лица органа управления ОЭЗ 
     * 
     * @return value
     */
    public PersonSignatureType getEconZonePersonSignature() {
        return econZonePersonSignature;
    }

    /** 
     * Set the 'EconZonePersonSignature' element value. ФИО и подпись уполномоченного лица органа управления ОЭЗ 
     * 
     * @param econZonePersonSignature
     */
    public void setEconZonePersonSignature(
            PersonSignatureType econZonePersonSignature) {
        this.econZonePersonSignature = econZonePersonSignature;
    }

    /** 
     * Get the list of 'Section' element items. Раздел 
     * 
     * @return list
     */
    public List<FormTwoSectionType> getSectionList() {
        return sectionList;
    }

    /** 
     * Set the list of 'Section' element items. Раздел 
     * 
     * @param list
     */
    public void setSectionList(List<FormTwoSectionType> list) {
        sectionList = list;
    }
}
