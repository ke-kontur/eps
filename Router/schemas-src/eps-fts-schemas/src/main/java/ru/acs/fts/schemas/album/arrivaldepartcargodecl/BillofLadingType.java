
package ru.acs.fts.schemas.album.arrivaldepartcargodecl;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Реквизиты коносамента на груз (товар), подлежащий выгрузке в порту прихода
 */
public class BillofLadingType extends DocumentBaseType
{
    private String debarkationPort;
    private String departureGoodsPort;

    /** 
     * Get the 'DebarkationPort' element value. Название порта выгрузки грузов (товаров), оставшихся на борту судна
     * 
     * @return value
     */
    public String getDebarkationPort() {
        return debarkationPort;
    }

    /** 
     * Set the 'DebarkationPort' element value. Название порта выгрузки грузов (товаров), оставшихся на борту судна
     * 
     * @param debarkationPort
     */
    public void setDebarkationPort(String debarkationPort) {
        this.debarkationPort = debarkationPort;
    }

    /** 
     * Get the 'DepartureGoodsPort' element value. Название первоначальных портов отправления грузов (товаров), перевозимых по коносаментам
     * 
     * @return value
     */
    public String getDepartureGoodsPort() {
        return departureGoodsPort;
    }

    /** 
     * Set the 'DepartureGoodsPort' element value. Название первоначальных портов отправления грузов (товаров), перевозимых по коносаментам
     * 
     * @param departureGoodsPort
     */
    public void setDepartureGoodsPort(String departureGoodsPort) {
        this.departureGoodsPort = departureGoodsPort;
    }
}
