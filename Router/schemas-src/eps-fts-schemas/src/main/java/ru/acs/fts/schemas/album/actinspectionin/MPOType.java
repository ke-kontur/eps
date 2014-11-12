
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о предъявленном МПО
 */
public class MPOType
{
    private String MPONumber;
    private String MPOName;
    private String MPODamageFlag;
    private List<String> damageDescList = new ArrayList<String>();

    /** 
     * Get the 'MPO_Number' element value. Номер МПО
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. Номер МПО
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }

    /** 
     * Get the 'MPO_Name' element value. Наименование МПО: 1 - почтовая карточка; 2 - письмо; 3 - бандероль; 4 - мелкий пакет; 5 - секограмма; 6 - посылка; 7 - мешок «М»; 8 - отправление EMS; 9 - аэрограмма
     * 
     * @return value
     */
    public String getMPOName() {
        return MPOName;
    }

    /** 
     * Set the 'MPO_Name' element value. Наименование МПО: 1 - почтовая карточка; 2 - письмо; 3 - бандероль; 4 - мелкий пакет; 5 - секограмма; 6 - посылка; 7 - мешок «М»; 8 - отправление EMS; 9 - аэрограмма
     * 
     * @param MPOName
     */
    public void setMPOName(String MPOName) {
        this.MPOName = MPOName;
    }

    /** 
     * Get the 'MPO_DamageFlag' element value. Признак повреждения МПО: 0 -  повреждения отсутствуют; 1 - повреждено
     * 
     * @return value
     */
    public String getMPODamageFlag() {
        return MPODamageFlag;
    }

    /** 
     * Set the 'MPO_DamageFlag' element value. Признак повреждения МПО: 0 -  повреждения отсутствуют; 1 - повреждено
     * 
     * @param MPODamageFlag
     */
    public void setMPODamageFlag(String MPODamageFlag) {
        this.MPODamageFlag = MPODamageFlag;
    }

    /** 
     * Get the list of 'DamageDesc' element items. Описание повреждения МПО
     * 
     * @return list
     */
    public List<String> getDamageDescList() {
        return damageDescList;
    }

    /** 
     * Set the list of 'DamageDesc' element items. Описание повреждения МПО
     * 
     * @param list
     */
    public void setDamageDescList(List<String> list) {
        damageDescList = list;
    }
}
