
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания размещения товара в контейнере
 */
public class WHGoodContLinkType
{
    private String goodNumber;
    private String containerNumber;

    /** 
     * Get the 'GoodNumber' element value. Порядковый номер товара в транспортном документе
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. Порядковый номер товара в транспортном документе
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'ContainerNumber' element value. Порядковый номер контейнера  в транспортном документе
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. Порядковый номер контейнера  в транспортном документе
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}
