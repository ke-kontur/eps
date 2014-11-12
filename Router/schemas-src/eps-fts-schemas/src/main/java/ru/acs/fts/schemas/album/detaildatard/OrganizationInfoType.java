
package ru.acs.fts.schemas.album.detaildatard;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о фирме
 */
public class OrganizationInfoType
{
    private String countryCode;
    private String countryName;
    private List<StructuredTextType> nameList = new ArrayList<StructuredTextType>();

    /** 
     * Get the 'CountryCode' element value. Код страны
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. Наименование страны
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Наименование страны
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the list of 'Name' element items. Наименование
     * 
     * @return list
     */
    public List<StructuredTextType> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование
     * 
     * @param list
     */
    public void setNameList(List<StructuredTextType> list) {
        nameList = list;
    }
}
