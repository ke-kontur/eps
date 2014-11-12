
package ru.acs.fts.schemas.album.revealedrisks;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID5Type;

/** 
 * Номер ориентировки 
 */
public class NumberOrientationType extends GTDID5Type
{
    private String terrActionCode;

    /** 
     * Get the 'TerrActionCode' element value. Код вида документа Возможные значения:11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска, 25 - общероссийская ориентировка, 26 - региональная ориентировка, 27 - зональная ориентировка, 32 - специальный региональный профиль риска, 77 -  для субъектов ВЭД, включенных в "зеленый сектор".
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. Код вида документа Возможные значения:11 - общероссийский профиль риска, 12 - региональный профиль риска, 13 - зональный профиль риска, 55 - профиль риска, обязательный к применению, 20 - срочный профиль риска, 25 - общероссийская ориентировка, 26 - региональная ориентировка, 27 - зональная ориентировка, 32 - специальный региональный профиль риска, 77 -  для субъектов ВЭД, включенных в "зеленый сектор".
     * 
     * @param terrActionCode
     */
    public void setTerrActionCode(String terrActionCode) {
        this.terrActionCode = terrActionCode;
    }
}
